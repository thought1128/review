package classex;

public class ClassStudy {
	int a,b,c;
	ClassStudy(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	String pass() {
		if((a+b+c)/3.0>300/2) {
			return "합격";
		}else {
			return "불합격";
		}
		
	}
	float average() {
		
		return (float)((a+b+c)/3.0);
	}
	int total() {
		
		return a+b+c;
	}
	public static void main(String[] args) {
		ClassStudy cs= new ClassStudy(47,55,91);
		System.out.println("총점: "+cs.total());
		System.out.printf("평균: %.2f\n",cs.average());
		System.out.println("당락: "+cs.pass());

	}


}
