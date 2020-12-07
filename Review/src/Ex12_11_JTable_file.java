import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex12_11_JTable_file {
	
	public static void main(String[] args) {
		new Sub11();

	}

}
class Sub11 extends JFrame{
	int cnt=1;
	int width=500;
	int height=200;
	int x = 1920/2-width/2;
	int y = 1080/2-height/2;
	private static final long serialVersionUID = -5739961659105063218L;
	
	Vector<String> columnNames;
	Vector<Vector<String>> rowData;
	Sub11(){
		//setSize(width, height);
		columnNames = new Vector<String>();
		rowData=new Vector<Vector<String>>();
		setBounds(x, y, width, height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFile();
		component();
		setVisible(true);
	}
	public void getFile() {
		FileReader fr;
		BufferedReader br;
		File file= new File("table.txt");
		
		try {
			br = new BufferedReader(new FileReader(file));
			String tableLine;
			while((tableLine=br.readLine())!=null) {
				tableMake(tableLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void tableMake(String tableLine) {
		String[] tuple=tableLine.split("/");
		if(cnt==1) {
			cnt++;
			for(String value:tuple) {
				columnNames.add(value);
			}

		}else {
			Vector<String> data= new Vector<String>();
			for(int i=0; i<tuple.length; i++) {
				data.add(tuple[i]);
			}
			rowData.add(data);
		}
	}
	public void component() {
		Container ct= getContentPane();
		JTable table= new JTable(rowData,columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		ct.add(scrollPane);
		
	}
}