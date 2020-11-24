package forex;

import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		int a=0;
		Random r= new Random();	
		for(int i=0; i<6; i++) {
			a=r.nextInt(100);
			System.out.printf(a+" ");
		}
	}
}