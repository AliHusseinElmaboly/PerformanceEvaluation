package src;


public class LCG {
    	int a = (int) Math.pow(2, 18) + 1;
	int b = 1;
	int m = Integer.MAX_VALUE;
	int xi;
        
        public LCG(int seed) {
		xi = seed;
	}

        double calcLCG() {

		xi = (a * xi + b) % m;

		
		return Math.abs((double) xi / m);
	}

}
