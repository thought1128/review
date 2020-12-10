package awt_swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddSungjuk implements ActionListener {
	JTable table;
	//JTextField[] tf = new JTextField[4];
	JTextField[] tf;

	String[] data = new String[4];

	AddSungjuk(JTable table, JTextField[] tf) {
		this.table = table;
		this.tf = tf;

		/*
		 * for (int i = 0; i < tf.length; i++) { this.tf[i] = tf[i]; }
		 */

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		for (int i = 0; i < data.length; i++) {
			data[i] = tf[i].getText();
		}
		model.addRow(data);
		for (int i = 0; i < tf.length; i++) {
			tf[i].setText(null);
		}
	}

}
