public class FoxAndGo {
    
    int[] dx = { 1, -1, 0, 0 };
    int[] dy = { 0, 0, 1, -1 };

	public int maxKill(String[] board) {
	    int height = board.length;
	    int width = board[0].length();
	    
	    int[][] tags = new int[height][width];


	    // tagging
	    int tag = 1;
	    for (int y = 0; y < height; y++) {
	        for (int x = 0; x < width; x++) {
	           if (tagging(board, tags, x, y, tag)) tag++;
	        }
	    }
	    
	    
	    int[] count = new int[tag];
	    int[][] critical = new int[tag][3];

	    for (int y = 0; y < height; y++) {
	        for (int x = 0; x < width; x++) {
	            int t = tags[y][x];
	            count[t]++;
	            
	            for (int i = 0; i < 4; i++) {
	                if (x + dx[i] >= 0 && x + dx[i] < width && y + dy[i] >= 0 && y + dy[i] < height && board[y+dy[i]].charAt(x+dx[i]) == '.') {
	                    if (critical[t][0] != 0 && (critical[t][1] != y + dy[i] || critical[t][2] != x + dx[i])) {
	                        critical[t][0] = -1;
	                    } else {
	                        critical[t][0] = 1;
	 	                    critical[t][1] = y + dy[i];
    	                    critical[t][2] = x + dx[i];
	                    }
	                }

	            }
	        }
	    }
	    
	    int kills = 0;
	    for (int i = 1; i < tag; i++) {
	       if (critical[i][0] == 0) {
	           kills += count[i];
	       }
	    }
	    
	    for (int[] c : critical) {
	        System.out.println("" + c[0] + "," + c[1] + "," + c[2]);
	    }
	    
	    int max = 0;
	    for (int y = 0; y < height; y++) {
	        for (int x = 0; x < width; x++) {    
	            int n = 0;
	            for (int i = 1; i < tag; i++) {
	                if (critical[i][0] == 1 && critical[i][1] == y && critical[i][2] == x) {
	                    n += count[i];
	                }
	            }
	            max = Math.max(n, max);
	        }
	    }
	    
	    kills += max;

		return kills;
	}
	
	private boolean tagging(String[] board, int[][] tags, int x, int y, int tag) {
	    if (x < 0 || x >= board[0].length() || y < 0 || y >= board.length) return false;
	    if (tags[y][x] != 0) return false;
	    
	    if (board[y].charAt(x) == 'o') {
	        tags[y][x] = tag;

	        for (int i = 0; i < 4; i++) {
	            tagging(board, tags, x + dx[i], y + dy[i], tag);
	        }
	        
	        return true;
	    }
	
	    return false;
	}

}
