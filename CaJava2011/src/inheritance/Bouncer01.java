package inheritance;

public class Bouncer01 {


	public static void main(String[] args) {
		Tiger tiger=new Tiger();
		System.out.println(tiger.name);
		tiger.bark();
		Lion lion=new Lion();
		System.out.println(lion.name);
		lion.bark();

	}

}
