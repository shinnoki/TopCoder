import java.math.BigInteger;

public class StringWeightDiv2 {
	static final int MOD = 1000000009;

	public int countMinimums(int L) {
		if (L <= 26) {
			return nP26(L);
		}
		
		if (L <= 52) {
			int permutation = 1;
			for (int i = 1; i < L-26; i++) {
				for (int j = 1; j <= Math.min(i, 26); j++) {
					permutation = (permutation + nP26(j+1)) % MOD;
				}
			}
			
			return (int)(((long)permutation * nP26(26)) % MOD);
		}
		
		return 0;
	}
	
	private int nP26(int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = (res * (26-i)) % MOD;
		}
		
		return res;
	}

}
