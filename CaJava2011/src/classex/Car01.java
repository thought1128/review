package classex;

public class Car01 {
	int speed;
	boolean stop;
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
		}else {
			this.speed = speed;
		}
		
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean b) {
		stop=b;
		if(b) {
			speed=0;	
		}
		
	}
}
