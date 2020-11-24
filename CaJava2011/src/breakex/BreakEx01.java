package breakex;

public class BreakEx01 {

	public static void main(String[] args) {
		int i = 0;
		
		while (true) {
			i++;
			if (i < 6) {
				System.out.println(i);
			} else {
				break;
			}
		}
		i=0;
		while (true) {
			i++;
			if (i > 5) break;

			System.out.println(i);
		}
	}
}