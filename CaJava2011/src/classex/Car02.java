package classex;

public class Car02 {
	String model;
	String color;
	int maxSpeed;

	Car02(String model) {
		super();
		//this("응아니야","지정된 생성자를 호출하는 메소드 this(매개변수) 생성자가 다른 생성자를 불러올때 사용된다.");
		this.model= model;
		System.out.println("모델: "+this.model);
	}

	Car02(int maxSpeed) {
		this.maxSpeed=maxSpeed;
		System.out.println("최고속도: " + this.maxSpeed);
	}

	Car02(String color, int maxSpeed) {
		this.color=color;
		this.maxSpeed=maxSpeed;
		System.out.println("색깔: " + this.color);
		System.out.println("최고속도: " + this.maxSpeed);
	}

	Car02(String model, String color) {
		this.model= model;
		this.color=color;

		System.out.println("모델: " + this.model);
		System.out.println("색깔: " + this.color);

	}

	Car02(String model, String color, int maxSpeed) {
		this.model= model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		System.out.println("모델: " + this.model);
		System.out.println("색깔: " + this.color);
		System.out.println("최고속도: " + this.maxSpeed);
	}
}
