package switchex;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		char c;
		int a = 0;
		int b = 0;

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.next().charAt(0);
		switch (c) {
		case '+': System.out.println("결과값: "+(int)(a+b));
			break;
		case '-': System.out.println("결과값: "+(int)(a-b));
			break;
		case '*': System.out.println("결과값: "+(int)(a*b));
			break;
		case '/': System.out.printf("결과값: %.2f",(float)(a/b));
			break;
		case '%': System.out.println("결과값: "+(a/b));
		default:
			break;
		}
		sc.close();
	}
}