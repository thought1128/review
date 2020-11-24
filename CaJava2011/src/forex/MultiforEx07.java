package forex;

public class MultiforEx07 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 5 - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 0; j < (i * 2 - 1); j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
