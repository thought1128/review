package generic_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex10_07_HashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		System.out.println(hm.size());
		
		hm.put("슬기", 20);
		hm.put("조이", 30);
		hm.put("웬디", 30);
		hm.put("아이유", 30);
		hm.put("조이", 40);
		
		System.out.println(hm);
		System.out.println(hm.get("조이"));
		
		if(hm.get("윤아")==null) {
			System.out.println("해당 키는 없음");
		}
		
		Set<String> ks= hm.keySet();
		System.out.println(ks);
		Iterator<String> iterator = ks.iterator();
		String x=iterator.next();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		while(iterator.hasNext()) {
			x=iterator.next();
			System.out.println(x+hm.get(x));
		}
	}
}
