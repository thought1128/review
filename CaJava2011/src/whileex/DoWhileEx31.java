package whileex;

import java.util.Scanner;

public class DoWhileEx31 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		Scanner sc= new Scanner(System.in);
		do {
			a= sc.nextInt();
		}while(a<1||a>10);
		for(int i=0; i<=a; i++) {
			b+=i;
		}
		System.out.println(b);
		sc.close();
	}

}
