package interfaceex;

public class Audio implements RemoteCon,RemoteCon02{
	@Override
	public void setVolume(int volume) {

	}

	@Override
	public void trunOn() {
		System.out.println("Audio를 끕니다.");

	}

	@Override
	public void trunOff() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void setMute(boolean mute) {
		RemoteCon.super.setMute(mute);
	}

}
