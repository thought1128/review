package review;

public class Ex01_for {
	public static void main(String[] args) {

		int a = 0;
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			a += i;
		}
		System.out.println(a);
		a = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 1; i <= 2; i++) {

			for (int j = 1; j <= 3; j++) {
				System.out.println(i + "\s" + j);
				System.out.print(i + "\s" + j + "\n");
			}

		}
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + "\s");
		}
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + "\s");
		}
		System.out.println();
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("---------------------");
		}

		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "단");
			}
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}
			if (i % 2 == 0) {
				System.out.println("---------------------");
			}
		}

		for (int i = 2; i <= 9; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				if (i < j) {
					break;
				}
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("---------------------");
		}

		for (int i = 2; i <= 9; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i + "단");
			for (int j = 1; j <= i; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println("---------------------");
		}
	}
}