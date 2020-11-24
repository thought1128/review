package whileex;

import java.util.Scanner;

public class DoWhileEx03 {

	public static void main(String[] args) {
		int a=0, b=1, c=9, d=0;
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.print("단입력 : ");
			a = sc.nextInt();
			if (a < 2 || a > 9) {
				continue;
			}
			do {
				d = a * b;
				System.out.println(a + "*" + b + "=" + d);
				b++;
			} while (b <= c);
			break;
		} while (true);
		 
		do {
			System.out.print("단입력 : ");
			a = sc.nextInt();
		} while (a < 2 || a > 9);
		do {
			d = a * b;
			System.out.println(a + "*" + b + "=" + d);
			b++;
		} while (b <= c);
		sc.close();
	}

}
