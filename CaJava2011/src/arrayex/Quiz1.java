package arrayex;

public class Quiz1 {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		char[] b = new char[5];
		for(int i=0; i<b.length; i++) {
			int e = 65;
			b[i] = (char)(e+i);
			System.out.print(b[i]);
		}
		AddEx ex = new AddEx();
		double[] c;
		c = new double[] {1,2,3,4,5};
		System.out.print("\n"+ex.add(c));
	}
}