package awt_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
class Sub09 extends JFrame{

	private static final long serialVersionUID = -667001323315390601L;
	int width=350;
	int height=400;
	int x = 1920/2-width/2;
	int y = 1080/2-height/2;
	String[] text= {"사과","배","체리"};
	JRadioButton[] radio= new JRadioButton[3];
	JLabel imageLabel = new JLabel("이미지가 없습니다.");
	ButtonGroup group= new ButtonGroup();
	ImageIcon[] icon = {new ImageIcon("images/apple.jpg"),new ImageIcon("images/pear.jpg"),new ImageIcon("images/cherry.jpg")};
	Sub09(String title){
		super(title);
		Container contentPane = getContentPane();
		
		JPanel p= new JPanel();
		

		
		p.setBackground(Color.GRAY);
		for(int i=0; i<text.length; i++) {
			radio[i]= new JRadioButton(text[i]);
			group.add(radio[i]);
			p.add(radio[i]);
			radio[i].addItemListener(new RadioButtonEvent());
		}
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(p,BorderLayout.NORTH);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		//add(p,BorderLayout.NORTH);
		//add(imageLabel, BorderLayout.CENTER);
		setBounds(x, y, width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//getContentPane().setBackground(Color.green); 적용됨
		//setBackground(Color.green); 적용안됨
		setVisible(true);
	}
	class RadioButtonEvent implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(radio[0].isSelected()) {
				imageLabel.setText(null);
				imageLabel.setIcon(icon[0]);
			}else if(radio[1].isSelected()) {
				imageLabel.setText(null);
				imageLabel.setIcon(icon[1]);
			}else if(radio[2].isSelected()) {
				imageLabel.setText(null);
				imageLabel.setIcon(icon[2]);
			}
			
		}
		
	}
}
public class Ex12_09_fruit {

	public static void main(String[] args) {
		//jframe();
		new Sub09("과일");

	}
	public static void jframe() {
		int width=350;
		int height=400;
		int x = 1920/2-width/2;
		int y = 1080/2-height/2;
		String[] text= {"사과","배","체리"};
		
		JFrame fruit=new JFrame();
		JPanel panel=new JPanel();
		JRadioButton[] radio= new JRadioButton[3];
		JLabel imageLabel = new JLabel("이미지가 없습니다.");
		ButtonGroup group= new ButtonGroup();
		ImageIcon[] icon = {new ImageIcon("images/apple.jpg"),new ImageIcon("images/pear.jpg"),new ImageIcon("images/cherry.jpg")};
				
		
		fruit.setBounds(x, y, width, height);
		panel.setBackground(Color.GRAY);
		for(int i=0; i<text.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			group.add(radio[i]);
			panel.add(radio[i]);
			radio[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(radio[0].isSelected()) {
						imageLabel.setText(null);
						imageLabel.setIcon(icon[0]);
					}else if(radio[1].isSelected()) {
						imageLabel.setText(null);
						imageLabel.setIcon(icon[1]);
					}else if(radio[2].isSelected()) {
						imageLabel.setText(null);
						imageLabel.setIcon(icon[2]);
					}
					
				}
			});
		}

		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fruit.add(panel,BorderLayout.NORTH);
		fruit.add(imageLabel, BorderLayout.CENTER);
		fruit.setVisible(true);
		fruit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
