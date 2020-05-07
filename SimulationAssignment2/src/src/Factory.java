package src;

import eduni.simjava.Sim_stat;
import eduni.simjava.Sim_entity;
import eduni.simjava.Sim_port;

public class Factory extends Sim_entity {
	Sim_stat device;
	private Sim_port Output;
        private ExponentialDeviate expDeviate;
	

	Factory(String name, int seed) {
		super(name);
                
                double mean =1;// 1 minute
		expDeviate = new ExponentialDeviate(mean,seed);


		// Port for sending events to the Inspection Station
		Output = new Sim_port("Output");
		add_port(Output);
		
		device = new Sim_stat();
		device.add_measure(Sim_stat.ARRIVAL_RATE);
		device.add_measure(Sim_stat.SERVICE_TIME);
		device.add_measure(Sim_stat.THROUGHPUT);
		device.add_measure(Sim_stat.QUEUE_LENGTH);
		device.add_measure(Sim_stat.RESIDENCE_TIME);
		set_stat(device);
		
	}
	

    public void body() {
    	
        for (int i=0; i < 100; i++) {
          // Send the processor a job
          sim_schedule(Output, 0.0, 0,0);
          // Pause
          //delay with  exponential interarrival times with a mean of 1 minute
          double delay = expDeviate.calcExponentialDeviate();
          sim_pause(delay);
        }
      }
}

