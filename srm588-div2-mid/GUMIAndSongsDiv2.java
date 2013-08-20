import java.util.ArrayList;

public class GUMIAndSongsDiv2 {
    int max;

	public int maxSongs(int[] duration, int[] tone, int T) {
	    max = 0;
	    System.out.println("dfs");
	    dfs(duration, tone, T, new ArrayList<Integer>(), 0);
	    System.out.println(max);
		return max;
	}
	
	private void dfs(int[] duration, int[] tone, int T, ArrayList<Integer> songs, int t) {
	    for (int i = 0; i < duration.length; i++) {
	        if (!songs.contains(i)) {
	            int delay = 0;
	            if (songs.size() > 0) {
	                delay = Math.abs(tone[i]-tone[songs.get(songs.size()-1)]);
	            }
	            if (t+duration[i]+delay <= T) {
    	            songs.add(i);
    	            if (songs.size() > max) {
    	                max = songs.size();
    	                System.out.println(songs.toString() + max);
    	            }
    	            dfs(duration, tone, T, songs, t+duration[i]+delay);
    	            songs.remove(songs.size()-1);
	            }
	        }
	    }
	    
	}

}
