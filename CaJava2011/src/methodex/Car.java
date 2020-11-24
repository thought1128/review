package methodex;

public class Car {
	String car;

	Car(String car) {
		this.car = car;
	}
	public void run() {
		for(int i= 0; i<=100; i+=20) {
			System.out.println(car+"이 달립니다.(시속:"+i+"km/h)");
		}
	}
}
