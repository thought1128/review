package awt_swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.EventListener;

import javax.swing.event.EventListenerList;

class Sub03 extends Frame implements ActionListener{

	Button btn1 = new Button("노랑");
	Button btn2 = new Button("빨강");
	Button btn3 = new Button("파랑");
	
	Sub03(){
		initialize();
	}
	public void initialize() {
		setTitle("Sub03");
		
		setBounds(1920/2-400/2, 1080/2-300/2, 400, 300);
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		add(btn3);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.yellow);
				
			}
		});
		
		btn2.addActionListener(this);
		
		btn3.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==btn2) {
			setBackground(Color.red);
		}else if(e.getSource()==btn3){
			setBackground(Color.blue);
		}
	}
}
public class Ex12_03_ActionEvent {

	public static void main(String[] args) {
		new Sub03().setVisible(true);

	}

}
