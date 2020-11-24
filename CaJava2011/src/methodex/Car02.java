package methodex;



public class Car02 {
	int gas;
	int b;
	boolean runOrStop;

	Car02() {
		gas = 5;
		runOrStop = true;
	}

	public boolean injection(int gas) {
		this.gas = gas;
		if(gas>0) {
			return runOrStop=true;
		}else {
			return runOrStop=false;
		}
	}

	public void start() {
		System.out.println("출발합니다.");
	}

	public void run() {
		for (int i = gas; i > 0; i--) {
			System.out.println("달립니다.(gas잔량:" + gas + ")");
			gas--;
		}
	}

	public boolean run2() {
		System.out.println("달립니다.(gas잔량:" + gas + ")");
		gas--;
		if (gas > 0) {
			runOrStop = true;
		} else {
			runOrStop = false;
		}
		return runOrStop;
	}

	public void stop() {
		if (gas <= 0) {
			System.out.println("멈춥니다.(gas잔량:" + gas + ")");
			System.out.println("gas가 없습니다.\ngas를 주입하세요.");

		}
	}

	public void runBoolean(boolean tF) {
		if(tF==true) {
			start();
			while (runOrStop) {
				run2();
			}
			stop();
		}else {
			stop();
		}
	}
	public int print(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
		return a+b;
	}
	public void add(int a) {
		a++;
	}
	public void add2(Car02 b) {
		b.b++;
	}
}
