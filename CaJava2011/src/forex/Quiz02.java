package forex;

public class Quiz02 {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		for(int i=1; i<=100; i++) {
			if(i%3!=0 && i%2 !=0) {
				b++;
				a += i;
			}
		}
		System.out.println(b);
		System.out.println(a);
	} 

}
