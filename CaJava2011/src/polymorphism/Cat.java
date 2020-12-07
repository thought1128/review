package polymorphism;

public class Cat extends Animal {
	int b=1;
	public static void main(String[] args) {
		Cat cat= new Cat();
		Animal animal= cat;
		Animal animal2= new Cat();
		if(cat == animal) {
			System.out.println("자동타입변환");
		}else {
			System.out.println(" ");
		}
		int x=animal2.a;
		int y=animal.a;
		int z=cat.b;
		Cat cat2=(Cat)animal2;
		int i=cat2.b;
		System.out.println(x+y+z+i);
		
		System.out.println(cat.a+"<< 이게 왜 자동 캐스팅인것인가?");

	}

}
