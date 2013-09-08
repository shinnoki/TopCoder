public class FoxAndGomoku {

	public String win(String[] board) {
	    int height = board.length;
	    int width = board[0].length();

	    for (int i = 0; i < height; i++) {
	        for (int j = 0; j < width; j++) {
	            int k;
	            // horizontal
	            for (k = 0; k < 5; k++) {
	               if (j + k >= width || board[i].charAt(j+k) == '.') break;
	            }
	            if (k == 5) return "found";
	            
	            // vertical
	            for (k = 0; k < 5; k++) {
	                if (i + k >= height || board[i+k].charAt(j) == '.') break;
	            }
	            if (k == 5) return "found";
	            
	            // right-up
	            for (k = 0; k < 5; k++) {
	                if (i + k >= height || j - k < 0 || board[i+k].charAt(j-k) == '.') break;
	            }
	            if (k == 5) return "found";
	            
	            // right-down
	            for (k = 0; k < 5; k++) {
	                if (i + k >= height || j + k >= width || board[i+k].charAt(j+k) == '.') break;
	            }
	            if (k == 5) return "found";
	        }
	    }

		return "not found";
	}

}
