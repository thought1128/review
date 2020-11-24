package methodex;

public class MethodEx01_01 {
	public void hap(int a, int b) {
		System.out.println(a+b);
	}
	public void cha(int a, int b) {
		System.out.println(a-b);
	}
	public void gop(int a, int b) {
		System.out.println(a*b);
	}
	public void mok(int a, int b) {
		System.out.println((float)a/(float)b);
	}
	public void add(int c) {
		int a=0;
		for(int i=1; i<c+1; i++) {
			a=a+i;
		}
		System.out.println(a);
	}
	public void add(int d, int c) {
		int a=0;
		int i=0;
		for(i=d; i<c+1; i++) {
			a=a+i;
		}
		System.out.println(a);
	}
	public void p(int c) {
		int a=1;
		for(int i=1; i<c+1; i++) {
			a=a*i;
		}
		System.out.println(a);
	}
	public void p(int d,int c) {
		long a=1;
		int i=0;
		for(i=d; i<c+1; i++) {
			a=a*i;
		}
		System.out.println(a);
	}
}
