package src;

import java.util.ArrayList;
import eduni.simjava.*;

public class InspectStation extends Sim_entity {

	private Uniform uniform;
	 private LCG lcg;
	// ports
	private Sim_port Input;
	private Sim_port Output;
	
	ArrayList<Double> hourthroughput;
	ArrayList<Double> responsetimes;
	
	Sim_stat device;

	InspectStation(String name, int seed) {
		super(name);
                double startInterval =0.75;
                double endInterval = 0.8;
		uniform= new Uniform(startInterval, endInterval, seed);
		lcg =new LCG(seed);

		// Port for recieve parts from MachineCenter
		Input = new Sim_port("Input");
		add_port(Input);

		// Port for sending events to production
		Output = new Sim_port("Output");
		add_port(Output);
		
		hourthroughput = new ArrayList<Double>();
		responsetimes = new ArrayList<Double>();

		device = new Sim_stat();


                device.add_measure(Sim_stat.ARRIVAL_RATE);
		device.add_measure(Sim_stat.SERVICE_TIME);
                device.add_measure(Sim_stat.THROUGHPUT);
		device.add_measure(Sim_stat.QUEUE_LENGTH);


		set_stat(device);
		
		
	}

	public void body() {
		int outputs = 0;
		double lastSampled = Sim_system.clock();
		
		while (Sim_system.running()) {
			
			double now = Sim_system.clock();
			if(now-lastSampled >= 60){
				lastSampled = now;
				hourthroughput.add((double)outputs);
				outputs = 0;
			}
			
			// recieve events from factory to process the current part
			Sim_event e = new Sim_event();
			sim_get_next(e);

			// Processing times at the machining center are uniform on the
			// interval [0.65,0.70] minutes
			double res=uniform.calcUniform();

			if(e.get_src() == -1)
				return;
			double time = e.end_waiting_time()-e.event_time()+res+(Double)e.get_data();
			sim_process(res);
			sim_completed(e);
			

			// 90% of the inspected parts are good and are sent to shipping
			if (lcg.calcLCG() < 0.10) {
				sim_schedule(Output, 0.0, 1, time);
			}
			else{
				outputs++;
				responsetimes.add(time);
			}
		}
	}
}
