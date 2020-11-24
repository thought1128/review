package classex;

public class Car {

	String company="기아", model="V80", color="검정색";
	public int maxSpeed=250, speed=0;
	
	Car()	{
	}
	Car(String company, String model){
		this.company = company;
		this.model= model;
	}
	public int setSpeed() {
		return this.speed=0;
	}

}