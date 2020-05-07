package src;



import java.util.Date;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import javax.swing.JList;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.statistics.SimpleHistogramBin;
import org.jfree.data.statistics.SimpleHistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;


public class PlotHistogram extends JFrame {
    private int bins ;
    private double [] numbers;
    private String name;

    /**
     * Simple driver program to test this component
     *
     */
    public void setBinsNumber(int num){
           bins = num;

       }
      public void setNumbers(double[] numbers){
        this.numbers= numbers;
      }

      public void setName(String name){
        this.name= name;
      }
 



    /**
     * Constructs instance of this class given a correlation client
     */


    public void plotTestHistogram (){
        int binSizes[] = {1,1,3,6,5,8,7,4,2,1};
        int numBins = binSizes.length;
        SimpleHistogramDataset histData = new SimpleHistogramDataset("Correlation Histogram");
        SimpleHistogramBin bins[] = new SimpleHistogramBin[numBins];

        // want the bin ranges to be correlation coefficient values (i.e. within -1 and 1)
        double step = 0.2;
        double min = -1.0;
        double max = min + step;
        boolean upper;

        // construct each bin with an interval of 0.2, and then add it to the dataset
        for (int i=0; i<numBins; i++) {
            // the last bin includes 1.0
            upper = (i==numBins-1) ? true : false;
            bins[i] = new SimpleHistogramBin(min,max, true, upper);
            bins[i].setItemCount(binSizes[i]);
            histData.addBin(bins[i]);
            System.out.println("Created bin for range: " + min + "," + max + " with size " + binSizes[i]);
            min += step;
            max += step;
        }


        // create the chart and chart panel
        JFreeChart hchart = ChartFactory.createHistogram("Correlation Histogram","Bin","Count",
                            histData,PlotOrientation.VERTICAL,true,false,false);
        ChartPanel cp = new ChartPanel(hchart);

        // add it to the frame and display the frame
        add(cp);
        this.setVisible(true);
        this.setSize(new Dimension(400,400));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
      




      public double[]  Histogram(String file){
               double[] result = new double[bins];

		HistogramDataset data = new HistogramDataset();
		data.setType(HistogramType.RELATIVE_FREQUENCY);
		data.addSeries("Histogram", numbers, bins);
	
		String x = name;
		String y = "values";

               for (int i = 0; i < bins; i++)
                    result[i] = data.getYValue(0, i);

		PlotOrientation orientation = PlotOrientation.VERTICAL;
	
		JFreeChart chart = ChartFactory.createHistogram(name, x,
				y, data, orientation, false, true, false);
		JFrame frame = new JFrame("Histogram");
		try {
			ChartUtilities.saveChartAsPNG(new File(file+".jpg"), chart,
					500, 500);
		} catch (IOException e) {
		}
		final ChartPanel chartPanel = new ChartPanel(chart);
		frame.setPreferredSize(new java.awt.Dimension(500, 270));
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		frame.setContentPane(chartPanel);
		frame.pack();
		frame.setVisible(true);
		return result;
        }
      public static void main(String[] args) {
        PlotHistogram plotHistogram=new PlotHistogram ();
        plotHistogram.plotTestHistogram();
    }

}