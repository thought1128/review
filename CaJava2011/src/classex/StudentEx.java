package classex;

public class StudentEx extends Student{

	public static void main(String[] args) {
		Student s3 = new Student() {
			@Override
			public void dd() {
				System.out.println("됨?");
			}
		};
		s3.dd();
		Student s1= new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		Student s2= new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		if(s1==s2) {
			System.out.println("서로 다른 객체");
		}
	}

}

class Student1 {

}
