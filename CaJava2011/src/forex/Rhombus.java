package forex;

import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		int x = 0;
		int z = 1;
		while (true) {
			System.out.println("숫자를 입력하시오(홀수,양수)");
			x = sc.nextInt();
			if (x % 2 == 0 || x <= 0) {
				System.out.println("홀수만 입력해주세요(양수입력해주세요)");
			} else {
				break;
			}

		}
		
		int y = x;
		if (y == 3) {
			num = 2;
		} else if (y == 1) {
			num = 1;
		} else {
			while (true) {
				y = y - 2;
				z++;
				if (y == 3) {

					num = x - z;
					break;
				}
			}
		}

		for (int i = 1; i < num + 1; i++) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
				System.out.print(" ");
			}

			for (int j = 0; j < (i * 2 - 1); j++) {

				System.out.print("*");
				System.out.print(" ");
			}

			System.out.println();
		}
		for (int i = num - 1; i > 0; i--) {
			for (int j = num - i; j > 0; j--) {

				System.out.print(" ");
				System.out.print(" ");
			}
			for (int j = 0; j < (i * 2 - 1); j++) {
				System.out.print("*");
				System.out.print(" ");
			}

			System.out.println();
		}
		sc.close();
	}
}
