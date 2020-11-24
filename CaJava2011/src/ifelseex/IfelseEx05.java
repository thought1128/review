package ifelseex;

import java.util.Scanner;

public class IfelseEx05 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,b,c,d;
		
		System.out.println("정수 4개를 입력하시오");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		d= sc.nextInt();
		
		if(a>b & a>c & a>d) {
			System.out.println(a);
		}else if (b>a & b>c & b>d ) {
			System.out.println(b);
		}else if (c>a & c>b & c>d) {
			System.out.println(c);
		}else {
			System.out.println(d);
		}
		

	}
 
}
