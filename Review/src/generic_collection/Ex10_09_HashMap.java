package generic_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
	private String title;
	private int price;

	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return title + "/" + price;
	}
}

public class Ex10_09_HashMap {

	public static void main(String[] args) {
		Map<String, Book> hm = new HashMap<String, Book>();
		Book bk1 = new Book("자바", 3000);
		Book bk2 = new Book("오라클", 2000);
		Book bk3 = new Book("JSP", 1000);
		hm.put("교보문고", bk1);
		hm.put("영풍문고", bk2);
		hm.put("알라딘", bk3);
		hm.put("yes24", new Book("SPRING", 4000));
		System.out.println(hm);

		Scanner sc = new Scanner(System.in);
		System.out.print("서점 입력:");
		String bookstore = sc.next();
		sc.nextLine();

		if (hm.get(bookstore) == null) {
			System.out.println("키 값이 잘못됨");
		} else {
			System.out.println(hm.get(bookstore));
		}
		System.out.println(hm.size());
		hm.clear();
		System.out.println(hm.size());

	}

}