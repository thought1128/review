package classex;

public class ClassEx02 {
	private String color;
	private int speed;
	
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setSpeed(int speed) {

		this.speed=speed;
	}
	public void setUp(int up) {
		this.speed=this.speed+up;
	}
	public void setDown(int douwn) {
		this.speed=this.speed-douwn;
	}
	public static void main(String[] args) {
		ClassEx02 classEx02=new ClassEx02();
		classEx02.setColor("빨강색");
		classEx02.setSpeed(100);
		System.out.println("색상: "+classEx02.getColor());
		System.out.println("속도: "+classEx02.getSpeed());
		classEx02.setUp(10);
		System.out.println("속도: "+classEx02.getSpeed());
		classEx02.setDown(20);
		System.out.println("속도: "+classEx02.getSpeed());
		
	}

}
