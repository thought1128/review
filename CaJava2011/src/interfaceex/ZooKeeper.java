package interfaceex;


public class ZooKeeper {
	/*
	 * public void feed(Tiger tiger) { System.out.println("사과"); } public void
	 * feed(Lion lion) { System.out.println("바나나"); }
	 */
	public void feed(Predator01 predator01) {
		System.out.println(predator01.feed());
	}
	public static void main(String[] args) {
		ZooKeeper zooKeeper=new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion= new Lion();
		Leopard leopard= new Leopard();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(leopard);
	}
}
