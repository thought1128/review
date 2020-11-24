package staticex;

public class InstanceMem {

	public int sum(int a, int b) {
		int c = 0;
		if (a < b) {
			for (int i = a; i < b; i++) {
				c = c + i;
			}
		} else {
			for (int i = b; i < a; i++) {
				c = c + i;
			}
		}

		return c;
	}

	public static void main(String[] args) {
		int a, b;
		a = 5;
		b = 10;
		InstanceMem c = new InstanceMem();
		System.out.println(c.sum(a, b));
	}

}
