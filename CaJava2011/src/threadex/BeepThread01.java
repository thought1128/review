package threadex;

public class BeepThread01 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("click");
			try {
				//Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
