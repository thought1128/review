package awt_swing;


import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Sub05 extends Frame implements ItemListener{

	private static final long serialVersionUID = 1455428523677940928L;
	Label south,north;
	Panel choiceLayout;
	Choice continent,country;
	String[] continentArray= {"아시아", "유럽", "아프리카"};
	String[][] countryArray = {{"한국","일본","중국"},{"영국","스위스","프랑스"},{"이집트","콩고","우간다"}};
	Sub05(){
		setBounds(1920/2-300/2, 1080/2-200/2, 300, 200);
		south= new Label("선택한 대륙과 나라는 : ");
		north= new Label("대륙과 나라를 선택하세요");
		south.setAlignment(Label.CENTER);
		continent=new Choice();
		country=new Choice();
		choiceLayout= new Panel();// 기본 레이아웃은 FlowLayout이다.
		
		add(south,BorderLayout.SOUTH);
		add(north,BorderLayout.NORTH);
		add("Center",choiceLayout);
		
		choiceLayout.setBackground(Color.pink);
		north.setBackground(Color.CYAN);
		south.setBackground(Color.YELLOW);
		
		choiceLayout.add(continent);
		choiceLayout.add(country);
		
		continent.addItemListener(this);
		country.addItemListener(this);
		
		for(String a:continentArray) {
			continent.add(a);
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		Object obj = e.getSource();
		if (obj == continent) {
			
			String item = continent.getSelectedItem();
			int index = continent.getSelectedIndex();
			if (item.equals("아시아")) {
				setSize(300,201);
				setSize(300,200);
				country.removeAll();
				for (String countryName : countryArray[index])
					country.add(countryName);
			} else if (item.equals("유럽")) {
				
				country.removeAll();
				for (String countryName : countryArray[index])
					country.add(countryName);
			} else if (item.equals("아프리카")) {
				
				country.removeAll();
				for (String countryName : countryArray[index])
					country.add(countryName);
			}
		} else if (obj == country) {
			String item = country.getSelectedItem();
			south.setText("선택한 대륙과 나라는 : " + continent.getSelectedItem() + "-" + item);
		}
	}
}
public class Ex12_05_김민우 {

	public static void main(String[] args) {
		new Sub05().setVisible(true);

	}

}
