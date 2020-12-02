package interfaceex;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteCon rc1= new Television();
		RemoteCon audio=new Audio();
		rc1.trunOn();
		rc1.setVolume(11);
		rc1.setVolume(-1);
		rc1.setMute(true);
		rc1.setMute(false);
		rc1.trunOff();
		
		audio.trunOn();
		audio.setMute(true);
		audio.trunOff();
		
		RemoteCon.changeBattey();
	}
}
