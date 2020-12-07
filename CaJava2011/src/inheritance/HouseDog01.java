package inheritance;

public class HouseDog01 extends Dog{
	public void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for"+hour+" hours");
	}
	public static void main(String[] args) {
		HouseDog01 houseDog = new HouseDog01();
		houseDog.setName("happy");
		houseDog.sleep();
		houseDog.sleep(3);

	}

}
