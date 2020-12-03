package review;
class Baseball extends Sports {
	String name;
	int inwon;
	double ta;

	Baseball(String name, int inwon, double ta) {
		super(name, inwon);
		// this.name=name;
		// this.inwon=inwon;
		this.ta = ta;
	}

	Baseball() {

	}
	void display() {
		super.display();
		System.out.println(ta);
	}
}

class Football extends Sports {
	double goal;

	Football(String name, int inwon, double goal) {
		super(name, inwon);
		//this.name = name;
		//this.inwon = inwon;
		this.goal = goal;
	}
	void display() {
		super.display();
		System.out.println(goal);
	}

}

class Sports {
	//private String name;
	String name;
	private int inwon;

	Sports() {
	}

	Sports(String name, int inwon) {
		this.name = name;
		this.inwon = inwon;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(inwon);
	}
}

public class Ex05_inheritance {

	public static void main(String[] args) {
		Baseball bb = new Baseball("야구", 9, 0.345);
		bb.display();
		Football ff = new Football("축구", 11, 6);
		ff.display();
		Sports ss = bb;
		System.out.println();
		if (ss instanceof Baseball) {
			System.out.println(ss.name);
		}
		System.out.println();
		Sports sbb = new Baseball("야구", 9, 0.345);
		sbb.display();
		Sports sff = new Football("축구", 11, 6);
		sff.display();

		
	}
}