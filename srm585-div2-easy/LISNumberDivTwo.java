public class LISNumberDivTwo {

	public int calculate(int[] seq) {
	    int lis = 1;
	    int prev = 0;
	    for (int i = 0; i < seq.length; i++) {
	        if (seq[i] <= prev) {
	            lis++;
	        }
	        prev = seq[i];
	    }
		return lis;
	}

}
