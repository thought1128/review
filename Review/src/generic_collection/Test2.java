package generic_collection;


public class Test2 {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		String s = "F--F--F";
		String replace = "F";
		String with = "F+F--F+F";

		for (int i = 0; i < N; i++) {
			s = s.replaceAll(replace, with);
			System.out.println(s);
		}
			
	}

}