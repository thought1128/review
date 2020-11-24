package forex;

import java.util.Random;

public class MultiforEx04 {

	public static void main(String[] args) {
		Random r= new Random();
		
		
		for(int j=0; j<10; j++) {
			for(int i=0; i<6; i++) {
				int a= r.nextInt(99);
				//System.out.print((int)(Math.random()*99)+1+"\t");
				System.out.print(a+"\t");
			}
			System.out.println();
		}

	}

}
