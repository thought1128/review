package methodex;

public class CarEx03 {

	public static void main(String[] args) {
		Car03 car=new Car03("승용차", "트럭");
		car.myCar("강철", "중형", "전륜", "제네시스");
		car.yourCar("알로이", "대형", "후륜", "탑차");
		car.mySetWheel("카본");
		car.yourSetSize("초대형");
		car.myCar();
		car.yourCar();
		car.mySetTransmission("마그네슘");
		car.myPrintTransmission();
		car.yourSetModel("덤프트럭");
		car.yourPrintModel();
		
	}
}
