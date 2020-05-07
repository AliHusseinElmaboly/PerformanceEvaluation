package src;


public class Uniform {

    private LCG lcg;
    private double startInterval;
    private double endInterval;


    Uniform(double start, double end ,int seed){
        lcg = new LCG(seed);
        this.startInterval = start;
        this.endInterval = end;

    }
    
    public double calcUniform(){
        double intervalLength = startInterval;
	double diff = endInterval - startInterval;
	intervalLength += lcg.calcLCG() * diff;
	return intervalLength;
    }
    

}
