package continueex;

public class ContinueEx01 {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			if(i%2 == 1)continue;
				System.out.println(i);

		}
		 
		int i=0;
		while(true) {
			i++;
			if(i>10)break;
			if(i%2 == 1)continue;
			System.out.println(i);
		}
	}

}
