public class KeyDungeonDiv2 {

	public int countDoors(int[] doorR, int[] doorG, int[] keys) {
	    int count = 0;
	    int len = doorR.length;
	    
	    for (int i = 0; i < len; i++) {
	        if (doorR[i] <= keys[0] + keys[2]) {
	            int restWhite = keys[2] - Math.max(doorR[i] - keys[0], 0);
	            if (doorG[i] <= keys[1] + restWhite) {
	                count++;
	            }
	        }
	    }
	    
		return count;
	}

}
