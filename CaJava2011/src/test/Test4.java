package test;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;

		for(int i=0; i<4; i++) {
			System.out.print("년도 입력: ");
			a = sc.nextInt();
			if(a%4==0 || a%400==0) {
				System.out.println("윤년");
			}else {
				System.out.println("평년");
			}
		}
	}
}