package polymorphism;

public class ChildEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child= (Child) parent;
			System.out.println("method - Child로 변환 성공");
		}else {
			System.out.println("method - Child로 변환되지 않음");
		}
	}
	public static void method2(Parent parent) {
		Child child= (Child)parent;
		System.out.println("method - Child로 변환 성공");
	}
	public static void main(String[] args) {
		Parent parent= new Child();
		parent.field1= "data1";
		parent.method1();
		parent.method2();
		Child child= new Child();
		child.field2="yyy";
		child.method3();
		Child parent2=(Child)parent;
		parent2.field2="yyy";
		parent2.method3();
		
		Parent parentA= new Child();
		method1(parentA);
		method2(parentA);
		Parent parentB= new Parent();
		method1(parentB);
		//method2(parentB);

	}

}
