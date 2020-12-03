package review;


class Car {
	String color = "white";
	int door = 4;

	void drive() {
		System.out.println("drive");
	}

	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car {
	int door = 6;
	int wheel = 10;

	void drive() {
		System.out.println("FEdrive");
	}

	void water() {
		System.out.println("water");
	}
}

public class Ex08_polymorhism {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;

		if(fe instanceof FireEngine) {
			System.out.println(fe);
			System.out.println(car);
		}
		System.out.println(car.door);
		System.out.println(car.color);
		System.out.println(fe.door);
		System.out.println(fe.wheel);
		System.out.println(fe.color);
		
		car.drive();
		//car.water();
		fe.drive();
		fe.water();
		
		fe2=(FireEngine)car;

		
		
		
	}
}
