package forex;

import java.util.Scanner;

public class MultiforEx10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//1,5,10을 조합하여 30되는 경우의 수
		int x=1,y=5,z=10;
		int b=0;
		for (int i = 0; i <= 30/z; i++) {
			for (int j = 0; j <=30/y; j++) {
				for (int k = 0; k <=30/x; k++) {
					/*
					 * if(30==z*i+y*j+x*k) { System.out.println(k+" "+j+" "+i); }
					 */
					if(30-(z*i+y*j+x*k)==0) {
						System.out.println(k+" "+j+" "+i);
						b++;
					}
				}
			}
			sc.close();
		}
		System.out.println(b);

	}

}
