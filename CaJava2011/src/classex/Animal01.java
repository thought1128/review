package classex;

public class Animal01 {
	String name;
	
	Animal01(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		Animal01 cat=new Animal01("야옹이");
		Animal01 dog=new Animal01("멍뭉이");
		System.out.println(cat.name);
		System.out.println(dog.name);

	}

}
