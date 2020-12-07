package inheritance;

public class AnimalEx01 {

	public static void main(String[] args) {
		Dog01 dog= new Dog01();
		Cat01 cat= new Cat01();
		dog.sound();
		cat.sound();
		System.out.println("--------");
		Animal01 animal= null;
		animal = new Dog01();
		animal.sound();
		animal = new Cat01();
		animal.sound();
		System.out.println("--------");
		
		animalSound(new Dog01());
		animalSound(new Cat01());
	}
	public static void animalSound(Animal01 animal) {
		animal.sound();
	}
}
