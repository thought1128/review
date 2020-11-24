package methodex;

public class Car03 {
	private String myCar, yourCar;
	private String myWheel, mySize, myTransmission, myModel;
	private String yourWheel, yourSize, yourTransmission, yourModel;

	Car03(String maCar, String yourCar) {
		this.myCar = maCar;
		this.yourCar = yourCar;
	}

	public void mySetWheel(String wheel) {
		this.myWheel = wheel;
	}

	public void mySetSize(String size) {
		this.mySize = size;
	}

	public void mySetTransmission(String transmission) {
		this.myTransmission = transmission;
	}

	public void mySetModel(String model) {
		this.myModel = model;
	}

	public String myGetWheel() {
		return myWheel;
	}

	public String myGetSize() {
		return mySize;
	}

	public String myGetTransmission() {
		return myTransmission;
	}

	public String myGetModel() {
		return myModel;
	}

	public void myCar() {
		System.out.println("내차는 " + myCar + " 입니다.");
		myPrintWhell();
		myPrintSize();
		myPrintTransmission();
		myPrintModel();
		System.out.println();
	}

	public void myCar(String wheel, String size, String transmission, String model) {
		mySetWheel(wheel);
		mySetSize(size);
		mySetTransmission(transmission);
		mySetModel(model);
		System.out.println("내차는 " + myCar + " 입니다.");
		myPrintWhell();
		myPrintSize();
		myPrintTransmission();
		myPrintModel();
		System.out.println();
	}

	public void myPrintWhell() {
		System.out.println("나의 차 타이어 휠은 " +  myWheel + " 입니다.");
	}

	public void myPrintSize() {
		System.out.println("나의 차 크기는 " + mySize + " 입니다.");
	}

	public void myPrintTransmission() {
		System.out.println("나의 차는 " +myTransmission + "구동 방식 입니다.");
	}

	public void myPrintModel() {
		System.out.println("나의 차는 " +myModel + " 입니다.");
	}

	public void yourSetWheel(String wheel) {
		this.yourWheel = wheel;
	}

	public void yourSetSize(String size) {
		this.yourSize = size;
	}

	public void yourSetTransmission(String transmission) {
		this.yourTransmission = transmission;
	}

	public void yourSetModel(String model) {
		this.yourModel = model;
	}

	public String yourGetWheel() {
		return yourWheel;
	}

	public String yourGetSize() {
		return yourSize;
	}

	public String yourGetTransmission() {
		return yourTransmission;
	}

	public String yourGetModel() {
		return yourModel;
	}

	public void yourCar(String wheel, String size, String transmission, String model) {
		yourSetWheel(wheel);
		yourSetSize(size);
		yourSetTransmission(transmission);
		yourSetModel(model);
		System.out.println("너의 차는 " + yourCar + " 입니다.");
		yourPrintWhell();
		yourPrintSize();
		yourPrintTransmission();
		yourPrintModel();
		System.out.println();
	}
	

	public void yourCar() {
		System.out.println("너의 차는 " + yourCar + " 입니다.");
		yourPrintWhell();
		yourPrintSize();
		yourPrintTransmission();
		yourPrintModel();
		System.out.println();
	}
	public void yourPrintWhell() {
		System.out.println("너의 차 타이어 휠은 " + yourWheel + " 입니다.");
	}

	public void yourPrintSize() {
		System.out.println("너의 차 크기는 " + yourSize + " 입니다.");
	}

	public void yourPrintTransmission() {
		System.out.println("너의 차는 " + yourTransmission + "구동 방식 입니다.");
	}

	public void yourPrintModel() {
		System.out.println("너의 차는 " + yourModel + " 입니다.");
	}

}
