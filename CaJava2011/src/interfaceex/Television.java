package interfaceex;

public class Television implements RemoteCon {
	private int volume;
	
	@Override
	public void trunOn() {
		System.out.println("Tv를 켭니다.");

	}

	@Override
	public void trunOff() {
		System.out.println("Tv를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		
		if(volume>RemoteCon.MAX_VOLUME) {
			this.volume= RemoteCon.MAX_VOLUME;
		}else if(volume<RemoteCon.MIN_VOLUME) {
			this.volume= RemoteCon.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println(this.volume);
	}

}
