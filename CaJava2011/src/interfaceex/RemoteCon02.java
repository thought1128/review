package interfaceex;

public interface RemoteCon02 {
	public static final int MAX_VOLUME= 10;
	public int MIN_VOLUME= 0;
	
	void trunOn();
	void trunOff();
	void setVolume(int volume);
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거");
		}else {
			System.out.println("음소거 해제");
		}
	}
	
	static void changeBattey() {
		System.out.println("건전지를 교환");
	}
}
