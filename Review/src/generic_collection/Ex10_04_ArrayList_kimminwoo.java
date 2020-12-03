package generic_collection;

import java.util.ArrayList;
import java.util.Scanner;

class Music {
	private String title;
	private String singer;
	private int price;

	Music(String title, String singer, int price) {
		this.title = title;
		this.singer = singer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return title + "/" + singer + "/" + price;

	}
}

public class Ex10_04_ArrayList_kimminwoo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Music music = new Music("다이너마이트", "BTS", 3000);
		Music music2 = new Music("단발머리", "조용필", 5000);
		ArrayList<Music> list = new ArrayList<Music>();
		list.add(music);
		list.add(music2);
		while (true) {
			System.out.print("제목:");
			String title = input.next();
			input.nextLine();
			System.out.print("가수:");
			String singer = input.next();
			input.nextLine();
			System.out.print("가격:");
			int price = input.nextInt();
			Music musiclist = new Music(title, singer, price);
			list.add(musiclist);

			System.out.print("계속?");
			String retry = input.next();
			input.nextLine();
			if (!retry.equals("y")) {
				break;
			}

		}

		System.out.println(list);
		while (true) {
			System.out.print("찾는 제목 입력 : ");
			String searchId = input.next();
			input.nextLine();
			for (int i = 0; i < list.size(); i++) {
				Music ps = list.get(i);
				if (ps.getTitle().equals(searchId)) {
					System.out.println(ps.getTitle() + "의 가수명은" + ps.getSinger());
				}
			}
			System.out.print("계속?");
			String retry = input.next();
			if (!retry.equals("y")) {
				break;
			}

		}
		input.close();
		System.out.println("프로그램이 종료");

	}

}
