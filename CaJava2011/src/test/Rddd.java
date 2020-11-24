package test;

public class Rddd {

	public static void main(String[] args) {
		int num=2;
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

	}

}
