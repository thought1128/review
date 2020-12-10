package awt_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class RemoveSungjuk implements ActionListener{
	JTable table;
	RemoveSungjuk(JTable table){
		this.table=table;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model= (DefaultTableModel)table.getModel();
		int row=table.getSelectedRow();
		model.removeRow(row);
	}

}
