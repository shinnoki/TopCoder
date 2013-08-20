public class PiecewiseLinearFunctionDiv2 {

	public int[] countSolutions(int[] Y, int[] query) {
		int N = query.length;
		int[] res = new int[N];
		
		for (int i = 0; i < N; i++) {
			int q = query[i];
			
			if (Y[0] == q) {
				res[i]++;
			}
			
			for (int j = 0; j < Y.length-1; j++) {
				if (Y[j] == q && Y[j+1] == q) {
					res[i] = -1;
					break;
				}
				if ((Y[j] > q && Y[j+1] < q) ||
						(Y[j] < q && Y[j+1] > q) ||
						(Y[j+1] == q)) {
					res[i]++;
				}
			}
		}
		return res;
	}

}
