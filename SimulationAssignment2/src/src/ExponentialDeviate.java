package src;


public class ExponentialDeviate {
    private LCG lcg;
    private double mean;

    ExponentialDeviate(double mean ,int seed){
        lcg = new LCG(seed);
        this.mean = mean;
    
    }

    public double calcExponentialDeviate(){

        double lamda = 1 / mean;
	double x = -(1 / lamda) * Math.log(lcg.calcLCG());
	return x;
    }


}
