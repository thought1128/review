package awt_swing;


import java.awt.Button;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


@SuppressWarnings("serial")
class Sub02 extends Frame {
	Button east =new Button("동쪽");
	Button west =new Button("서쪽");
	Button south =new Button("남쪽");
	Button north =new Button("북쪽");
	Button center =new Button("중앙");
	
	Sub02(String title){
		super(title);
		setBounds(1920/2-400/2, 1080/2-300/2, 400, 300);
		//setLayout(new FlowLayout());
		
		/*
		 * setLayout(new BorderLayout()); add(east,BorderLayout.EAST);
		 * add(west,BorderLayout.WEST); add(south,BorderLayout.SOUTH);
		 * add(north,BorderLayout.NORTH); Frame의 기본 레이아웃이 BorderLayout이다.
		 */
		
		setLayout(new GridLayout(3,2));
		add(east);
		add(west);
		add(south);
		add(north);
		//add(center,BorderLayout.CENTER);
		add("Center",center);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
}
public class Ex12_02_Layout {

	public static void main(String[] args) {
		
		new Sub02("Sub02");
	}

}
