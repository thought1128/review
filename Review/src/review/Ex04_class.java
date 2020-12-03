package review;
class Person {
		private String name;
		public int age;
		double height;
		static String nation;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
}

public class Ex04_class {

	public static void main(String[] args) {

		/*
		 * Person p1=new Person(); p1.name= "홍길동"; p1.age= 25; p1.height=149.8;
		 * p1.nation="대한민국"; Person.nation="대한민국"; Person p2=new Person(); p2.name=
		 * "윤아"; p2.age= 35; p2.height=189.8; System.out.println(p2.nation);
		 * System.out.println(Person.nation);
		 */
		Person.nation = "";
		
	}

}
