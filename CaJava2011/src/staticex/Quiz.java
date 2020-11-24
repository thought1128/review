package staticex;

public class Quiz {
	static int x;
	int y;
	static {
		x=0;
		System.out.println("static 초기화 블록 x값은 "+x);
	}
	{
		y=1;
		System.out.println("초기화 블록 y값은 "+y);
	}
	Quiz(){
		x=x+1;
		y=y+1;
		System.out.println("생성자 x의 값은 "+x);
		System.out.println("생성자 y의 값은 "+y);
	}
	public static int x() {
		return x=3;
	}
	public int y() {
		return y=4;
	}
	public static void main(String[] args) {
		Quiz q= new Quiz();
		System.out.println("x의 값"+x);
		System.out.println("x의 값"+x());
		System.out.println("x의 값"+x);
		System.out.println("y의 값"+q.y);
		System.out.println("y의 값"+q.y());
		System.out.println("y의 값"+q.y);
	}
}
