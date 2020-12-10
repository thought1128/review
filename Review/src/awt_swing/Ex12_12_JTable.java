package awt_swing;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ex12_12_JTable extends JFrame implements ActionListener{

	private static final long serialVersionUID = 3864103175245580763L;

	int cnt=1;

	Vector<String> columnNames;
	Vector<Vector<String>> rowData ;
	
	JButton btnAdd, btnRemove, btnFout, btnExit;

	Ex12_12_JTable(String str){
		super(str);

		columnNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();

		getFile(); // 화일에서 읽어서 JTable만들 준비
		compose(); // JTable 작성

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,300);
		setVisible(true);
	} // 생성자

	public void compose() {

		Container ct = getContentPane();
		
		setLayout(null);
		JTable table = new JTable(rowData,columnNames);
		JScrollPane scroll = new JScrollPane(table);
		ct.add(scroll);

		scroll.setBounds(250,30,400,200);
		
		JTextField[] tf = new JTextField[4];
		
		String[] title = {"이름:", "국어:", "영어:", "수학:"};
		for(int i=0;i<4;i++) {
			JLabel lb = new JLabel();
			lb.setText(title[i]);
			lb.setBounds(10,(i+1)*30,50,20);
			
			ct.add(lb);
			
			tf[i] = new JTextField();
			tf[i].setBounds(80,(i+1)*30,90,20);
			ct.add(tf[i]);
		}
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(new AddSungjuk(table,tf));
		btnAdd.setBounds(10, 160, 100, 20);
		ct.add(btnAdd);
		
		btnRemove = new JButton("삭제");
		btnRemove.addActionListener(new RemoveSungjuk(table));
		btnRemove.setBounds(120, 160, 100, 20);
		ct.add(btnRemove);
		
		btnFout = new JButton("화일출력");
		btnFout.addActionListener(new FilePrint(table));
		btnFout.setBounds(10, 190, 100, 20);
		ct.add(btnFout);
		
		btnExit = new JButton("종료");
		btnExit.addActionListener(this);
		btnExit.setBounds(120, 190, 100, 20);
		ct.add(btnExit);
		
//		11시에 사진
		
	}//compose

	public void getFile(){
		FileReader fr ;
		BufferedReader br;
		File file = new File("table.txt");
		// 글자가 깨져 나올 때 : 

		try {
			br = new BufferedReader(new FileReader(file));
			String str;
			while((str = br.readLine()) != null) {

				tableMake(str);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} // getFile

	public void tableMake(String str) {
		//str:이름/국어/영어/수학
		//str:써니/33/44/55
		String[] item = str.split("/");
		if(cnt == 1) { // 제목
			cnt++; // 2
			for(int i=0;i<item.length;i++) {
				columnNames.add(item[i]);
			}
		}else { // 내용

			Vector<String> one = new Vector<String>();
			for(int i=0;i<item.length;i++) {
				one.add(item[i]);
			}
			rowData.add(one);
		}
	} // tableMake

	public static void main(String[] args) {
		new Ex12_12_JTable("JTable 프로그램");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}