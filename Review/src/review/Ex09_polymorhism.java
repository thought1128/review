package review;


class Robot{
	public void dance() {
		System.out.println("로봇");
	}
}
class DanceRobot extends Robot{
	public void dance() {
		System.out.println("춤을 춥니다.");

	}
}
class SingRobot extends Robot{
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot{
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
public class Ex09_polymorhism {
	public static void main(String[] args) {
		Robot[] robotAarray= {new DanceRobot(),new SingRobot(),new DrawRobot()};
		int index=robotAarray.length;
		for(int i=0; i<index; i++) {
			action(robotAarray[i]);
		}

	}
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr= (DanceRobot)r;
			dr.dance();
		}else if(r instanceof SingRobot) {
			SingRobot sr= (SingRobot)r;
			sr.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot dr= (DrawRobot)r;
			dr.draw();
		}

	}
}
