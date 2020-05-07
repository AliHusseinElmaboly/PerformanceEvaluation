package src;


import eduni.simjava.Sim_entity;
import eduni.simjava.Sim_system;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnitSource;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;


public class SimulationFrame extends javax.swing.JFrame {

     PlotHistogram plotHistogram;
     PrintWriter resultFile;

     Factory factory;
     MachineCenter machineCenter;
     InspectStation inspectionStation ;
    /** Creates new form SimulationFrame */
    public SimulationFrame() {
        initComponents();
         plotHistogram =new PlotHistogram();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SimulationMachine = new javax.swing.JFrame();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        MachineCenterFrame = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        InspectionStationFrame = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        SimulationMachine.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Machine Center");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        SimulationMachine.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 130, 60));

        jButton5.setText("Inspection Station");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        SimulationMachine.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, 60));

        MachineCenterFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setText("Machine Center");
        MachineCenterFrame.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 60));

        jButton6.setText("Interarrival Time ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        MachineCenterFrame.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jButton7.setText("Service Time");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        MachineCenterFrame.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jButton8.setText("Throughput");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        MachineCenterFrame.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, -1));

        jButton9.setText("Queue Length");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        MachineCenterFrame.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, -1));

        InspectionStationFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel2.setText("Inspection Station");
        InspectionStationFrame.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, 60));

        jButton10.setText("Interarrival Time ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        InspectionStationFrame.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jButton11.setText("Service Time");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        InspectionStationFrame.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jButton12.setText("Throughput");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        InspectionStationFrame.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 90, -1));

        jButton13.setText("Queue Length");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        InspectionStationFrame.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 110, -1));

        jButton14.setText("Hourly throughput");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        InspectionStationFrame.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jButton15.setText("Response Time");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        InspectionStationFrame.getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("LCG random number generator of 100,000 numbers");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 312, 58));

        jButton2.setText("exponential random deviate using the inverse transformation technique");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 50));

        jButton3.setText("Simulation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     double  chi_squareTest (double[] observed, double expected) {
	double D = 0;
	for (int i = 0; i < observed.length; i++)
		D += Math.pow( observed[i] - expected, 2) / expected;
	return D;
      }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        LCG lcg = new 	LCG(3);
	double[] numbers = new double[100000];
	for (int i = 0; i < numbers.length; i++)
            numbers[i] = lcg.calcLCG();

	int bins = 10;
        plotHistogram.setName("");
        plotHistogram.setBinsNumber(bins);
        plotHistogram.setNumbers(numbers);

	double[] observeds = plotHistogram.Histogram("the histogram of 100,000 generated numbers");
	double chi_square = chi_squareTest (observeds, 1.0 / bins);
	System.out.println("error using chi-square test:" +chi_square);

    }//GEN-LAST:event_jButton1ActionPerformed

	
        	private JFreeChart createChart(XYDataset dataset) {

        // create the chart...
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Objects/hr", // chart title
            "Time (hr)", // domain axis label
            "Objects", // range axis label
            dataset,  // initial series
            PlotOrientation.VERTICAL, // orientation
            true, // include legend
            true, // tooltips?
            false // URLs?
            );

        // set chart background
        chart.setBackgroundPaint(Color.white);

        // set a few custom plot features
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(new Color(0xffffe0));
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.lightGray);
        plot.setRangeGridlinePaint(Color.lightGray);

        // set the plot's axes to display integers
        TickUnitSource ticks = NumberAxis.createIntegerTickUnits();
        NumberAxis domain = (NumberAxis) plot.getDomainAxis();
        domain.setStandardTickUnits(ticks);
        NumberAxis range = (NumberAxis) plot.getRangeAxis();
        range.setStandardTickUnits(ticks);


        return chart;
    }

        void plotTime(double[] data , int idx, String plotTitle) {
		final DefaultXYDataset dataset = new DefaultXYDataset();
		double[][] d = new double[2][data.length-idx];
		for (int i = idx; i < d[0].length; i++) {
			d[0][i] = i-idx;
			d[1][i] = data[i];
		}
                dataset.addSeries(plotTitle, d);
		JFrame frame = new JFrame(plotTitle);
                
		final JFreeChart chart = createChart(dataset);
		ChartPanel chartPanel = new ChartPanel(chart, false);
		frame.add(chartPanel);

		frame.setContentPane(chartPanel);
		chartPanel.setPreferredSize(new java.awt.Dimension(400, 400));
                frame.setPreferredSize(new java.awt.Dimension(400, 400));

		frame.pack();
		frame.setVisible(true);
	}
        public void computeInterarrivalTime (String current,List [] Data , int index){
                Object [] numbers = ((ArrayList<Double>) Data[1].get(0)).toArray();
		double[] values = new double[numbers.length-1];
		for (int i = 1; i < values.length; i++)
			values[i-1] = (Double) numbers[i]-(Double) numbers[i-1];


                String name= current+" : Inter-arrival times";
                resultFile.write(name+"\n");

		
		for (int i = 0; i< values.length ; i++)
			resultFile.write(values[i] + ",");

                int bins = 50;

                plotHistogram.setName(name);
                plotHistogram.setBinsNumber(bins);
                plotHistogram.setNumbers(values);

                plotHistogram.Histogram(name);
		



        }

        public void computeThroughput(String current,List [] Data , int index){
		Object [] numbers = ((ArrayList<Double>) Data[1].get(0)).toArray();
		double[] values = new double[numbers.length-1];
		for (int i = 1; i < values.length; i++)
			values[i-1] = (Double) numbers[i]-(Double) numbers[i-1];

                String name= current+" : device Throughput";
                 resultFile.write(name+"\n");


		for (int i = 0; i< values.length ; i++)
			resultFile.write(values[i] + ",");
                int bins = 50;
                plotHistogram.setName(name);
                plotHistogram.setBinsNumber(bins);
                plotHistogram.setNumbers(values);

                plotHistogram.Histogram(name);
		

        }
        public void computeLengths(String current,List [] Data ){

            	ArrayList<double[]> numbers = (ArrayList<double[]>) Data[1].get(3);
		double[]  values = new double[numbers.size()];
		for (int i = 0; i < values.length; i++)
                    values[i] = numbers.get(i)[0];
		

                String name= current+": Queues  Lengths";
                resultFile.write(name+"\n");


		for (int i = 0; i< values.length ; i++)
			resultFile.write(values[i] + ",");

                
                int bins = 50;
                plotHistogram.setName(current+name);
                plotHistogram.setBinsNumber(bins);
                plotHistogram.setNumbers(values);

                plotHistogram.Histogram(name);


        }
        public void computeServiceTime(String current,List [] Data ){

            	ArrayList<double[]> numbers = (ArrayList<double[]>) Data[1].get(1);



                int bins = 50;
                String name= current+": Service Time";
                
                plotHistogram.setName(name);
                plotHistogram.setBinsNumber(bins);

                double[]  values= new double[numbers.size()];
		for (int i = 0; i < values.length; i++)
			values[i] = numbers.get(i)[1]-numbers.get(i)[0];
                plotHistogram.setNumbers(values);

                plotHistogram.Histogram(name);
       


                resultFile.write(name+"\n");


		for (int i = 0; i< values.length ; i++)
			resultFile.write(values[i] + ",");


        }
    	void OutputDevice(Sim_entity sim) {
		List[] Data = sim.get_stat().get_data();
                String current = sim.get_name();

                computeInterarrivalTime (current, Data , 0);
                computeServiceTime (current, Data );
                computeThroughput( current, Data , 2);
                computeLengths(current , Data );


                


	}


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        double mean =6;
        int seed =3;
        ExponentialDeviate exponentialDeviate = new ExponentialDeviate(mean, seed);

        double[] numbers = new double[100000];
	for (int i = 0; i < numbers.length; i++)
            numbers[i] = exponentialDeviate.calcExponentialDeviate();

	plotHistogram.setName("exponential random deviate using the inverse transformation technique");
        plotHistogram.setBinsNumber(10);
        plotHistogram.setNumbers(numbers);

	double[] observeds = plotHistogram.Histogram("exponential random deviate");
        double chi_square= chi_squareTest (observeds, 0.1);
	System.out.println("error using chi-square test: " + chi_square);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Sim_system.initialise();
        factory = new Factory("factory", 3);
        machineCenter = new MachineCenter("machineCenter", 5);
	inspectionStation = new InspectStation("inspectionStation", 9);

        Sim_system.add(factory);
        Sim_system.add(machineCenter);
	Sim_system.add(inspectionStation);
        Sim_system.set_report_detail(true, true);

				
				
	Sim_system.link_ports("factory", "Output", "machineCenter", "Input1");
	Sim_system.link_ports("machineCenter", "Output1","inspectionStation", "Input");
	Sim_system.link_ports("inspectionStation", "Output","machineCenter", "Input2");
	
	Sim_system.set_termination_condition(Sim_system.TIME_ELAPSED,10000, true);

	Sim_system.generate_graphs(true);



        //run the sim system
	Sim_system.run();

        // after Finishing Output Result
      SimulationMachine.setVisible(true);
       SimulationMachine.setSize(450,250);

 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

           try {
            resultFile = new PrintWriter(new File("machineCenter Service Time.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 List[] Data = machineCenter.get_stat().get_data();
                String current = machineCenter.get_name();

                computeServiceTime (current, Data );
         resultFile.close();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

           try {
            resultFile = new PrintWriter(new File("machineCenter Throughput.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 List[] Data = machineCenter.get_stat().get_data();
                String current = machineCenter.get_name();

                computeThroughput( current, Data , 2);
         resultFile.close();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed


       try {
            resultFile = new PrintWriter(new File("inspection Station  Service Time.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 List[] Data = inspectionStation.get_stat().get_data();
                String current = inspectionStation.get_name();

            computeServiceTime (current, Data );
         resultFile.close();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

          try {
            resultFile = new PrintWriter(new File("inspection Station  Throughput.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 List[] Data = inspectionStation.get_stat().get_data();
                String current = inspectionStation.get_name();

            computeThroughput( current, Data , 2);
         resultFile.close();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      MachineCenterFrame.setVisible(true);
      MachineCenterFrame.setSize(200, 500);

      
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    InspectionStationFrame.setVisible(true);
    InspectionStationFrame.setSize(200, 500);
    }//GEN-LAST:event_jButton5ActionPerformed
        // TODO add your handling code here:

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
	     try {
            resultFile = new PrintWriter(new File("machineCenter Inter-arrival Times.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 List[] Data = machineCenter.get_stat().get_data();
                String current = machineCenter.get_name();

                computeInterarrivalTime (current, Data , 0);
         resultFile.close();


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed



       try {
            resultFile = new PrintWriter(new File("inspection Station  Interarrival Time.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 List[] Data = inspectionStation.get_stat().get_data();
                String current = inspectionStation.get_name();

            computeInterarrivalTime (current, Data , 0);
         resultFile.close();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
	     try {
            resultFile = new PrintWriter(new File("machineCenter Queue Length.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 List[] Data = machineCenter.get_stat().get_data();
                String current = machineCenter.get_name();

               computeLengths(current , Data );
         resultFile.close();        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
               try {
            resultFile = new PrintWriter(new File("inspection Station  Queue Length.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 List[] Data = inspectionStation.get_stat().get_data();
                String current = inspectionStation.get_name();

           computeLengths(current , Data );
         resultFile.close();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
                try {
            resultFile = new PrintWriter(new File("Hourly Throughput.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
            computeHourlyTime ();
         resultFile.close();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
               try {
            resultFile = new PrintWriter(new File("response time.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SimulationFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
               computeResponseTime();
            resultFile.close();   

    }//GEN-LAST:event_jButton15ActionPerformed


    public void computeHourlyTime (){

        String name="Hourly throughput";
        Object[] numbers = inspectionStation.hourthroughput.toArray();
		double[] values = new double[numbers.length];
		for (int i = 0; i < values.length; i++)
			values[i] = (Double) numbers[i];


                resultFile.write(name+"\n");


		for (int i = 0; i< values.length ; i++)
			resultFile.write(values[i] + ",");


               plotTime(values, 0 , name);

    }
    public void  computeResponseTime(){
        String name ="Response times";
        Object[] numbers =  inspectionStation.responsetimes.toArray();
		double[] values = new double[numbers.length];
		for (int i = 0; i < values.length; i++)
			values[i] = (Double) numbers[i];


                resultFile.write(name+"\n");


		for (int i = 0; i< values.length ; i++)
			resultFile.write(values[i] + ",");

                    plotHistogram.setName(name);
                    plotHistogram.setBinsNumber(50);
                    plotHistogram.setNumbers(values);
                    plotHistogram.Histogram(name);



    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame InspectionStationFrame;
    private javax.swing.JFrame MachineCenterFrame;
    private javax.swing.JFrame SimulationMachine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables


}
