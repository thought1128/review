package operatorex;

public class OperatorEx02 {

	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int b1 = 1;
		int b2 = 1;
		int c,d;
		
		a1++; b1--;
		a2++; b2--;
		System.out.println("a1="+a1);
		System.out.println("b1="+b1);
		System.out.println("a2="+a2);
		System.out.println("b2="+b2);
		c = ++a1 + ++b1;
		d = ++a2 + b2++;
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println(b2);
		
	}

}
