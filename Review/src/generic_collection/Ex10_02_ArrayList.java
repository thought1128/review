package generic_collection;

import java.util.ArrayList;

public class Ex10_02_ArrayList {

	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		int size=list.size();
		System.out.println(size);
		System.out.println(list.toString());
		
		list.add(1234);
		list.add("sdf");
		list.add("자바");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.toString());
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("sdf");
		list2.add("sdffsf");
		list2.add("eorfj");
		System.out.println(list2);
		System.out.println(list2.toString());
		
		list.add(1, "element");
		System.out.println(list.get(1));
		System.out.println(list);
		list2.remove(1);
		System.out.println(list2);
		list2.remove("sdf");
		System.out.println(list2);
		list2.set(0, "java");
		System.out.println(list2);
	}

}
