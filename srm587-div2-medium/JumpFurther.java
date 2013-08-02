public class JumpFurther {

	public int furthest(int N, int badStep) {
		int upmost = 0;
		
		for (int i = 1; i <= N; i++) {
			if (upmost + i != badStep) {
				upmost = upmost + i;
			} else {
				upmost = badStep - 1;
			}
			
		}
		return upmost;
	}

}
