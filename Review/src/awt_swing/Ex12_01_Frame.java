package awt_swing;

import java.awt.Frame;


public class Ex12_01_Frame {

	public static void main(String[] args) {
		Frame f= new Frame();
		f.setTitle("abc");
		f.setSize(400, 300);
		f.setLocation(1920/2-400/2, 1080/2-300/2);
		//f.setBounds(1920/2-400/2, 1080/2-300/2, 400, 300);
		f.setVisible(true);
		
	}

}
