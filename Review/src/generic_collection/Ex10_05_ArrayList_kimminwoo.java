package generic_collection;


import java.util.ArrayList;
import java.util.Scanner;

class Card {
	private String name;
	private String tel;
	Card(String name, String tel){
		this.name=name;
		this.tel=tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}

public class Ex10_05_ArrayList_kimminwoo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Card> list = new ArrayList<Card>();
		
		for (;;) {
			System.out.print("1.명함추가 2.명함삭제 3.명함수정 4.명함보기 5.종료:");
			int menu = input.nextInt();
			if(menu==1) {
				System.out.print("이름을 입력하세요 : ");
				String name= input.next();
				input.nextLine();
				System.out.print("전화번호를 입력하세요 : ");
				String tel= input.next();
				input.nextLine();
				list.add(new Card(name,tel));
			}else if(menu==2) {
				System.out.print("이름을 입력하세요 : ");
				String name= input.next();
				input.nextLine();
				for (int i = 0; i < list.size(); i++) {
					Card ps = list.get(i);
					if (ps.getName().equals(name)) {
						list.remove(i);
					}
				}

			}else if(menu==3) {
				System.out.print("이름을 입력하세요 : ");
				String name = input.next();
				input.nextLine();
				System.out.print("수정하실 전화번호는 : ");
				String tel= input.next();
				input.nextLine();
				for (int i = 0; i < list.size(); i++) {
					Card ps = list.get(i);
					if (ps.getName().equals(name)) {
						list.get(i).setTel(tel);
					}
				}
				System.out.println("수정되었습니다.");
			}else if(menu==4) {
				/*
				 * for(int i=0; i<list.size(); i++) {
				 * System.out.print("이름\t전화번호\n"+list.get(i).getName()+"\t"+list.get(i).getTel()
				 * +"\n"); }
				 */
				for (Card card: list) {
					System.out.print("이름\t전화번호\n"+card.getName()+"\t"+card.getTel()+"\n");
				}
			}else if(menu==5) {
				System.out.println("프로그램을 종료합니다.");
				input.close();
				break;
			}
		}
	}
}