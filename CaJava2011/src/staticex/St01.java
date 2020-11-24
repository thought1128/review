package staticex;

public class St01 {
	private static St01 singleton=new St01();
	
	private St01(){}
	
	public static St01 getSt() {
		return singleton;
	}
}
