package classex;

public class Animal02 {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Animal02 lion=new Animal02();
		Animal02 tiger=new Animal02();
		Animal02 leopard=new Animal02();
		lion.setName("사자");
		tiger.setName("호랑이");
		leopard.setName("표범");
		System.out.println(lion.getName());
		System.out.println(tiger.getName());
		System.out.println(leopard.getName());

	}

}
