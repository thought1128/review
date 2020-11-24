package breakex;

public class BreakEx02 {

	public static void main(String[] args) {
		int i=0, sum=0;
		while(true) {
			i++;
			sum+=i;
			if(sum>2000) {
				System.out.println("수: "+i);
				System.out.println("합: "+sum);
				break;
			}
		}

	}

}
