package awt_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Sub08 extends JFrame{
	private static final long serialVersionUID = -8504250133082577642L;
	Container contentPane;
	JPanel p1,p2;
	JTextField text1,text2,text3;
	JButton btn1,btn2;
	int width,height;
	OkButton ok;
	CancelButton cancel;
	Sub08(String title){
		super(title);
		//setBounds(1920 / 2 - 600 / 2, 1080 / 2 - 600 / 2, 600, 600);

		
		contentPane = getContentPane();
		
		p1= new JPanel();
		p1.setBackground(Color.yellow);
		p2 = new JPanel();
		p2.setBackground(Color.cyan);
		text1= new JTextField(5);
		text2= new JTextField(5);
		text3= new JTextField(5);
		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,BorderLayout.SOUTH);
		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);
		btn1 = new JButton("확인");
		btn2 = new JButton("취소");

		ok=new OkButton(text1,text2,text3);
		cancel=new CancelButton(text1,text2,text3);
		btn1.addActionListener(ok);
		btn2.addActionListener(cancel);
		p2.add(btn1);
		p2.add(btn2);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class OkButton implements ActionListener{
	JTextField text1,text2,text3;
	public OkButton(JTextField text1,JTextField text2,JTextField text3) {
		this.text1=text1;
		this.text2=text2;
		this.text3=text3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		int num1 = Integer.parseInt(text1.getText());
//		int num2 = Integer.parseInt(text2.getText());
//		text3.setText(String.valueOf(num1+num2));
		try {
			text3.setText(String.valueOf(Integer.parseInt(text1.getText())+Integer.parseInt(text2.getText())));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "숫자만 입력가능");
			text1.setText(null);
			text2.setText(null);
			text3.setText(null);

		}
	
	}
	
}
class CancelButton implements ActionListener{
	JTextField text1,text2,text3;
	public CancelButton(JTextField text1,JTextField text2,JTextField text3) {
		this.text1=text1;
		this.text2=text2;
		this.text3=text3;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		text1.setText(null);
		text2.setText(null);
		text3.setText(null);
	}
	
}
public class Ex12_08_Add {

	public static void main(String[] args) {
		new Sub08("덧셈").setBounds(1920 / 2 - 500 / 2, 1080 / 2 - 300 / 2, 500, 300);;

	}

}
