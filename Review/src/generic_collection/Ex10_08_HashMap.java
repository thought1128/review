package generic_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10_08_HashMap {
	public static void main(String[] args) {
		Map<String,String> dic=new HashMap<String,String>();
		
		dic.put("pencil","연필");
		dic.put("sky","하늘");
		dic.put("desk","책상");
		dic.put("face","얼굴");
		
		System.out.println(dic);
		Scanner sc=new Scanner(System.in);
		for(;;) {
			System.out.println("찾는 단어는?(q입력시 종료)");
			String x= sc.next();
			sc.nextLine();
			if(x.equals("q")) {
				sc.close();
				System.out.println("종료합니다.");
				break;
			}
			if(dic.containsKey(x)==false) {
				System.out.println("찾는 단어가 없습니다");
			}
			System.out.println(dic.get(x));
		}
	}
}
