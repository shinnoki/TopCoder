public class ThreeColorabilityEasy {

	public String isColorable(String[] cells) {
		int h = cells.length;
		int w = cells[0].length();
		
		for (int i=0; i < h-1; i++) {
			for (int j=0; j < w-1; j++) {
				int count = 0;
				count += cells[i].charAt(j) == 'N' ? 1 : 0;
				count += cells[i].charAt(j+1) == 'N' ? 1 : 0;
				count += cells[i+1].charAt(j) == 'N' ? 1 : 0;
				count += cells[i+1].charAt(j+1) == 'N' ? 1 : 0;
				
				if (count == 1 || count == 3) return "No";
			}
		}
		
		
		return "Yes";
	}

}
