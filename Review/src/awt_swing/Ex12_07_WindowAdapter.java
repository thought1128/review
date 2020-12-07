package awt_swing;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class Sub07 extends Frame{
	private static final long serialVersionUID = -2751893142994978193L;
	Sub07(){
		setBounds(1920 / 2 - 300 / 2, 1080 / 2 - 200 / 2, 300, 200);
		addWindowListener(new MyAdapter());
		setVisible(true);
	}
	Sub07(int zero){
		setBounds(1920 / 2 - 300 / 2, 1080 / 2 - 200 / 2, 300, 200);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(zero);
			}

		});

		setVisible(true);
	}
}

class MyAdapter extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
public class Ex12_07_WindowAdapter {

	public static void main(String[] args) {
		//new Sub07();
		new Sub07(0);

	}

}
