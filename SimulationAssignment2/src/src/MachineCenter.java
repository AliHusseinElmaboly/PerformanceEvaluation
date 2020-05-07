package src;

import eduni.simjava.Sim_entity;
import eduni.simjava.Sim_event;
import eduni.simjava.Sim_port;
import eduni.simjava.Sim_stat;
import eduni.simjava.Sim_system;



public class MachineCenter extends Sim_entity {
	private ExponentialDeviate expFail;
	private Uniform uniRepair;
	private Uniform uni;
	// ports
	private Sim_port Input1;
	private Sim_port Input2;
	private Sim_port Output;
	Sim_stat device;

	public MachineCenter(String name, int seed) {
		super(name);

		// Port for recieve parts from factory
		Input1 = new Sim_port("Input1");
		add_port(Input1);
		
		// Port for recieve parts from production (Bad Items)
		Input2 = new Sim_port("Input2");
		add_port(Input2);

		// Port for sending events to Inspection Station
		Output = new Sim_port("Output1");
		add_port(Output);

		int mean =360; //6 hours 360 minutes
		expFail= new ExponentialDeviate(360, seed);

		uniRepair = new Uniform(8, 12, seed);

		uni = new Uniform(0.65, 0.7, seed);

		
		device = new Sim_stat();
                device.add_measure(Sim_stat.ARRIVAL_RATE);
		device.add_measure(Sim_stat.SERVICE_TIME);
		device.add_measure(Sim_stat.THROUGHPUT);
                device.add_measure(Sim_stat.QUEUE_LENGTH);

		set_stat(device);
		
	}

	public void body() {
		int failcount = (int) expFail.calcExponentialDeviate();
		double count = 0;
		while (Sim_system.running()) {
			
			if (count++ >= failcount) {
				sim_pause(uniRepair.calcUniform());
				failcount = (int) expFail.calcExponentialDeviate();
				count = 0;
			}

			double rand = uni.calcUniform();

                        Sim_event e = new Sim_event();
			sim_get_next(e);

			Integer num = e.get_src();
			if(num == -1)
                            return;
                        
			double time = e.end_waiting_time()-e.event_time();
                        time+=rand;

			sim_process(rand);
			sim_completed(e);
			sim_schedule(Output, 0.0, 1, time);
		}
	}
}
