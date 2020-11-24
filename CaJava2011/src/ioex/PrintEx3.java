package ioex;

public class PrintEx3 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int result = x + y;
		int r = x / y;
		int e = x % y;
		int s = x * y;
		int l = x - y;
		double u = x / y;

		System.out.println(result);
		System.out.println(r);
		System.out.println(e);
		System.out.println(s);
		System.out.println(l);
		System.out.printf("%1$f", u);
	}

}