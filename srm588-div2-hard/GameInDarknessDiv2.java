public class GameInDarknessDiv2 {

	public String check(String[] field, String[] moves) {
	    String allMoves = "";
	    for (String move : moves) allMoves += move;
	    
	    int ax = 0 , ay = 0, bx = 0, by = 0;
	    
	    // initialize
	    for (int y = 0; y < field.length; y++) {
	        for (int x = 0; x <field[0].length(); x++) {
	            char c = field[y].charAt(x);
	            if (c == 'A') {
	                ax = x;
	                ay = y;
	            } else if (c == 'B') {
	                bx = x;
	                by = y;
	            }
	        }
	    }
	    
	    // move
		return move(field, allMoves, ax, ay, bx, by, 0) ? "Bob wins" : "Alice wins";
	}
	
	int[] kx = { 0, 1, -1, 0 };
	int[] ky = { -1, 0, 0, 1 };
	
	private boolean move(String[] field, String moves, int ax, int ay, int bx, int by, int turn) {

	    if (bx < 0 || bx >= field[0].length() || by < 0 || by >= field.length) return false;
	    if (field[by].charAt(bx) == '#') return false;
	    if (ax == bx && ay == by) return false;

	    if (turn >= moves.length()) return true;

	    switch (moves.charAt(turn)) {
        case 'U':
            ay--; break;
        case 'R':
            ax++; break;
        case 'L':
            ax--; break;
        case 'D':
            ay++; break;
        }
	    
	    if (ax == bx && ay == by) return false;
	    
	    
	    for (int i = 0; i < 4; i++) {
	        if (move(field, moves, ax, ay, bx+kx[i], by+ky[i], turn+1)) {
	            return true;
	        }
	    }
	    
	    return false;
	}

}
