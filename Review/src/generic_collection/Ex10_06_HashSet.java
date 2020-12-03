package generic_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


public class Ex10_06_HashSet {
	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		System.out.println(hs.size());
		
		hs.add("aa");
		hs.add("bb");
		hs.add("cc");
		hs.add("dd");
		hs.add("aa");
		hs.add("bb");
		hs.add("cc");
		hs.add("dd");
		hs.add("ee");
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.toString());
		Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(hs.contains("bb"));
		System.out.println(hs.contains("xy"));
		
		Random random= new Random();
		int r= random.nextInt(10)+1;
		int r2= (int)(Math.random()*10)+1;
		System.out.println(r);
		System.out.println(r2);
		int i=0;
		HashSet<Integer> inths= new HashSet<Integer>();
		while(true) {
			i++;
			int num=(int)(Math.random()*10)+1;
			inths.add(num);
			if(inths.size()==6) {
				break;
			}
		}
		System.out.println(inths.toString());
	}
}
