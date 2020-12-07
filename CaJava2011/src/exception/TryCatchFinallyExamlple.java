package exception;

public class TryCatchFinallyExamlple {
	
	public static void main(String[] args) {
		

	}
	public void method() {
		try {
			method02();
		}catch(ClassNotFoundException e) {
			
		}
	}
	public void method02() throws ClassNotFoundException{
		Class cl= Class.forName("java.lang.String2");
	}
}
