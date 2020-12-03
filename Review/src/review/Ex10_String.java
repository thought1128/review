package review;


public class Ex10_String {
	public static void main(String[] args) {
		String s1= "Hello";
		String s2= new String("hello");
		
		boolean result1 = s1.equals(s2);
		System.out.println(result1);
		System.out.println(s1==s2);
		boolean result2 = s1.equalsIgnoreCase(s2);
		System.out.println(result2);
		System.out.println(s1);
		System.out.println(s1.toString());
		
		String s3 = "apple,banana/orange,melon#pear";
		String[] s =s3.split(",");
		System.out.println();
		for(String i:s) {
			System.out.println(i);
		}
	}
}
