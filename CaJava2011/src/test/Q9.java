package test;

public class Q9 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1) break;
				System.out.println("i: "+i+"\tj: "+j);
			}
		}
		System.out.println();
		for(int i=0; i<3; i=i+2) {
			for(int j=0; j<3; j++) {
				System.out.println("i: "+i+"\tj: "+j);
			}
		}

	}

}