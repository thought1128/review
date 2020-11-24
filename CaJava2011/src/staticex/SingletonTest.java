package staticex;

public class SingletonTest {

	static class Singleton{
		private static Singleton one;
		private Singleton() {
			
		}
		public static Singleton getSingleton() {
			if (one==null) {
				one= new Singleton();
			}
			return one;
		}
		public void x() {
			System.out.println("x");
		}
	}
	public static void main(String[] args) {
		Singleton singleton1= Singleton.getSingleton();
		singleton1.x();
	}

}
