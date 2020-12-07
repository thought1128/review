package awt_swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
class Sub10 extends JFrame{
	String[] title = {"이름", "직업", "나이"};
	Object[][] data= {{"성시경","가수",38},{"신동엽","개그맨",45},{"김연아","운동선수",22}};
	JFrame jrame;
	JTable table;
	JScrollPane scrollPane;
	Sub10(){
		jrame= new JFrame();
		table = new JTable(data,title);
		scrollPane = new JScrollPane(table);
		
		getContentPane().add(scrollPane);
		setSize(400, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Ex12_10_JTable {

	public static void main(String[] args) {
		
		new Sub10();
	}
}
