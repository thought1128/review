package staticex;

public class SingletonEx01 {

	public static void main(String[] args) {
		St01 obj1= St01.getSt();
		St01 obj2= St01.getSt();
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}

	}

}
