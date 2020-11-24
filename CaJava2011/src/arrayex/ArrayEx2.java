package arrayex;

import java.util.Random;

public class ArrayEx2 {

	public static void main(String[] args) {
		for(int k=0; k<10; k++) {
			int[] m = new int[6];
			Random r = new Random();
			for(int i=0; i<m.length; i++) {
				m[i] = r.nextInt(36)+1;
				for(int j=0; j<i; j++) {
					if(m[i] == m[j]) i--;
				}
			}
			for(int i=0; i<m.length; i++) {
				System.out.print(m[i]+"\t");
			}
			System.out.println();
		}


	}

}
