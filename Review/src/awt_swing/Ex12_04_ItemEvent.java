package awt_swing;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class Sub04 extends Frame implements ItemListener,ActionListener{
	
	List list;
	Choice ch;
	Button btn;
	
	Sub04(){
		setTitle("ItemEvent");
		setSize(300,200);
		setVisible(true);
		
		setLayout(new FlowLayout());
		
		list = new List(3,true); // 
		ch = new Choice();
		btn = new Button("빨간색");
		
		list.add("지리산");
		list.add("한라산");
		list.add("금강산");
		list.add("덕유산");
		list.add("속리산");		
		
		ch.add("진달래");
		ch.add("벚꽃");
		ch.add("장미");
		ch.add("국화");
		ch.add("개나리");
		
//		List, Choice : ItemEvent
		
		add(list);
		add(ch);
		add(btn);
		
		list.addItemListener(this); // new ItemEvent()
		ch.addItemListener(this);
		btn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}// 생성자

	@Override
//	ItemEvent e = new ItemEvent()
	public void itemStateChanged(ItemEvent e) {
		//System.out.println("itemStateChanged");
		
		Object obj = e.getSource();
		if(obj == list) {
			//System.out.println("list이벤트 발생");
			int[] indexs = list.getSelectedIndexes();
			String[] items = list.getSelectedItems();
			
			for(int i=0;i<indexs.length;i++) {
				System.out.print(indexs[i]+"/"+items[i]+", ");
			}
			System.out.println();
		}
		else if(obj == ch) {
			//System.out.println("choice 이벤트 발생");
			
			int index = ch.getSelectedIndex();
			String item = ch.getSelectedItem();
			System.out.println(index+":"+item);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(Color.red);
	}
	
} // Sub04

public class Ex12_04_ItemEvent {
	public static void main(String[] args) {
		new Sub04();
	}

}
