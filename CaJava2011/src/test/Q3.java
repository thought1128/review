package test;

public class Q3 {

	public static void main(String[] args) {
		int x= 10;
		int y= 20;
		int z1= --x+ ++y;
		int z2= z1+ x/x++;
		int z3= z1+ y--/x;
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);

	}

}
