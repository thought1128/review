package forex;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		int[] p = new int[30];
		int[] sequence = new int[30];
		Random r = new Random();

		for(int i=0; i<p.length; i++) {
			sequence[i] = r.nextInt(30)+1;
			for(int j=0; j<i; j++) {
				if(sequence[i]==sequence[j]) {
					i--;
				}
					
			}
		}
		for(int i=0; i<p.length; i++) {
			p[i] = i+1;
			System.out.println(p[i]+"번 학생의 발표순서는 "+sequence[i]);
		}

	}

} 