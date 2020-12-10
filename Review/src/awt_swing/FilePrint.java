package awt_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;

public class FilePrint implements ActionListener{
	JTable table;
	BufferedWriter bw = null;

	FilePrint(JTable table){
		this.table = table;
	}
	// JTable의 내용을 화일에 출력
	@Override
	public void actionPerformed(ActionEvent e) {

		File file = new File("table.txt");

		try {
			bw = new BufferedWriter(new FileWriter(file));

			int rowNum = table.getRowCount();
			int columnNum = table.getColumnCount();

			for(int i=0;i<columnNum;i++) {
				String title = table.getColumnName(i);

				if(i != columnNum-1) {
					bw.write(title+"/");
				}
				else {
					bw.write(title);
					bw.newLine();
				}
			} // for
			
			for(int i=0;i<rowNum;i++) {
				for(int j=0;j<columnNum;j++) {
					Object obj = table.getValueAt(i, j);
					if(j != columnNum-1) {
						bw.write((String)obj+"/");
					}else {
						bw.write((String)obj);
						bw.newLine();
					}
				}
				System.out.println();
			}

		} catch (IOException e1) {
			e1.printStackTrace();

		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}