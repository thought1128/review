package classex;

public class CarEx01 {

	public static void main(String[] args) {
		Car01 myCar= new Car01();
		myCar.setSpeed(-50);
		System.out.println("현재 속도: "+myCar.getSpeed());
		myCar.setSpeed(60);
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: "+myCar.getSpeed());
	}

}
