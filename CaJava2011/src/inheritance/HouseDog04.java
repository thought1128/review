package inheritance;

public class HouseDog04 extends Dog{
	public HouseDog04(String name) {
		this.name=name;
	}
	public HouseDog04(int kind) {
		if(kind==1) {
			this.name="yorkshire";
		}else if(kind==2) {
			this.name="bulldog";
		}
	}
	
	public void sleep() {
		System.out.println(this.name+" zzz in house");
		
	}
	public void sleep(int hour) {
		System.out.println(this.name+" zzz in house for"+hour+" hours");
		
	}
	public static void main(String[] args) {
		HouseDog04 happy=new HouseDog04("happy");
		HouseDog04 yorkshire=new HouseDog04(1);
		HouseDog04 bulldog=new HouseDog04(2);
		System.out.println(happy.name);
		System.out.println(yorkshire.name);
		System.out.println(bulldog.name);
		happy.sleep();
		happy.sleep(2);
		yorkshire.sleep();
		bulldog.sleep(2);

	}
}