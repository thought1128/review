package whileex;

public class WhileEx02 {

	public static void main(String[] args) {
		int i=0;
		int x=0;
		int y=0;
		int z=0;
		
		int x1=0;
		while(i<100) {
			i++;
			x+=i;
			if(i%2==0) {
				y=y+i;
			}
			else {
				z+=i;
			}
			if(i%2==0&&i%3==0) {
				x1+=i;
			}
			//x1=x1+((i%2==0&&i%3==0) ? i:0);
			
		}
		System.out.println(y);
		System.out.println(z);
		System.out.println(x);
		System.out.println(x1);
	}

}
