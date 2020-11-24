package continueex;

public class ContinueEx03 {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			i++;
			if(i>10)break;
			if(i%2==0&&i%3==0)continue;
			System.out.println(i);
		}
		for(int j=0; j<11; j++) {
			if(j%2==0&&j%3==0)continue;
			System.out.println(j);
		}

	}

}