package methodex;

public class CarExample02 {

	public static void main(String[] args) {
		int a=1,b=3;
		Car02 myCar = new Car02();
		/*
		 * myCar.start(); myCar.run(); myCar.stop();
		 * 
		 * myCar.runBoolean(myCar.injection(myCar.print(a, b)));
		 */
		myCar.add(a);
		System.out.println(a);
		myCar.add2(myCar);
		System.out.println(myCar.b);
	}

}
