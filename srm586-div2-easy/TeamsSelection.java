public class TeamsSelection {

	public String simulate(int[] preference1, int[] preference2) {
		int N = preference1.length;
		int[] team = new int[N];
		
		int i = 0;
		int j = 0;
		
		while (i < N && j < N) {
			for (; i < N;i++) {
				if (team[preference1[i]-1] == 0) {
					team[preference1[i]-1] = 1;
					break;
				}
			}
			
			for (; j < N; j++) {
				if (team[preference2[j]-1] == 0) {
					team[preference2[j]-1] = 2;
					break;
				}
			}
		}
		
		String res = "";
		for (int k = 0; k < N; k++) {
			res += team[k];
		}
				
		return res;
	}

}
