package forex;

public class MultiforEx03 {

	public static void main(String[] args) {
		/*
		 * for(int x=2; x<10; x++) { System.out.printf(x+"단\t");
		 * if(x==9)System.out.println(); }
		 */
		for(int i=0; i<10; i++) {
			for(int j=2; j<=9; j++) {
				if(i<1) {
					System.out.printf(j+"단\t");
				}else {
					System.out.printf(j+"*"+i+"="+i*j+"\t");
				}	
			}
			System.out.println();
		}

	}

}