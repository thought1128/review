package test;

public class Q6 {

	public static void main(String[] args) {
		float f1= 10.5f;
		int i1= 10;
		float f2= f1/3;
		int i2= i1/3;
		System.out.println(f2);
		System.out.println(i2);

		long l1= 10;
		int i3= (int)l1/i2;
		System.out.println(i3);
		float f3= f2/3;
		System.out.println(String.format("%.2f", f3));
	}

}
