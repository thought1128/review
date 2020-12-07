package threadex;

public class BeepPrintExample01 {
	public static void main(String[] args) {
		Thread click=new BeepThread01();
		click.start();
		try {
			click.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Thread beep=new BeepThread02();
		beep.start();
		try {
			beep.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0; i<5; i++) {
			System.out.println("print");
			try {
				//Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		System.out.println("end");
	}
}
