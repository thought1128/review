package breakex;

public class BreakEx03 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==4) {
					break;
				}
				System.out.println(j+","+i+"\t");
			}
			if(i>2) {
				break;
			}
			System.out.println();
		}
	}

}
