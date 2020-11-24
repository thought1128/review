package ioex;

import java.util.Scanner;

public class ScannerExTest {
	public interface Cmpare {
		int cp(int x, int y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("두개의 정수를 입력하세요!");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Cmpare c = (x, y) -> (x >= y) ? x : y;
		double average = ((double) num1 + (double) num2) / 2;
		System.out.println();
		System.out.println("결과 출력");
		System.out.println("-------");
		System.out.println(num1 + ", " + num2);
		System.out.printf("두 수중에 큰 숫자는 %d 입니다. \n", c.cp(num1, num2));

		System.out.printf("두 수의 합은? %d 입니다.\n", num1 + num2);
		System.out.printf("두 수의 곱은? %d 입니다.\n", num1 * num2);
		System.out.printf("두 수를 나머지한 몫은? " + ((double) num1 / num2) + " 이고 " + "나머지는 " + (num1 % num2) + "입니다. \n");
		System.out.printf("두 수의 평균은? %.2f", average);
		sc.close();

	}

}