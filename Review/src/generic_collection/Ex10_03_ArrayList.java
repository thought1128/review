package generic_collection;

import java.util.ArrayList;

import java.util.Scanner;

class Person {
	private String id;
	private String pw;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	Person(String id, String pw){
		this.id=id;
		this.pw=pw;
	}
	@Override
	public String toString() {
		return id+":"+pw;
	}
}
public class Ex10_03_ArrayList //extends AbstractCollection{
{
	public static void main(String[] args) {

		Person p1 = new Person("kim","1234");
		Person p2 = new Person("park","5678");
		Person p3 = new Person("choi","9876");
		
		System.out.println(p1);
		System.out.println(p1.toString());
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		System.out.println("list:" + list.toString());
		
		System.out.println(list.size());
		
//		length:배열의 길이
//		length():문자열의 길이(갯수)
//		size():컬렉션안의 요소의 갯수
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ID:");
			String id = sc.next();
			
			System.out.print("PW:");
			String pw = sc.next();
			
			Person p = new Person(id,pw);
			list.add(p);
			
			System.out.print("계속?");
			String retry = sc.next(); // "y" or "a,b,c,n"
			
			if(!retry.equals("y")) {
				break;
			}
			
		} // while

		System.out.println("list:" + list);
		
		for(int i=0;i<list.size();i++) {
			Person ps = list.get(i);
			System.out.println("ps:"+ps);
		}
		
		boolean flag = false;
		System.out.print("찾는 ID 입력 : ");
		String searchId = sc.next();
		
		for(int i=0;i<list.size();i++) {
			Person ps = list.get(i);
			if(ps.getId().equals(searchId)) {
				System.out.println("찾는 PW:"+ps.getPw());
				flag = true;
			}
//			else {
//				System.out.println("찾는 ID 없습니다.");
//			}
		} // for
		
		// 여기
		if(flag == false) {
			System.out.println("찾는 ID가 없습니다.");
		}
		sc.close();
	} // main

} // class 

