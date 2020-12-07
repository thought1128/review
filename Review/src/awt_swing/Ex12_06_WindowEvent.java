package awt_swing;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Sub06 extends Frame implements WindowListener {

	private static final long serialVersionUID = 1L;

	Sub06() {
		setBounds(1920 / 2 - 300 / 2, 1080 / 2 - 200 / 2, 300, 200);
		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}

public class Ex12_06_WindowEvent {

	public static void main(String[] args) {
		new Sub06().setVisible(true);
		;

	}

}
