package byteex;

public class Task2 {

	public static void main(String[] args) {
		long pop1;
		long pop2, pop3;
		long total;
		double avg;
		
		pop1 = 1000000000;
		pop2 = 2000000000;
		pop3 = 15001;
		
		total = pop1 + pop2 + pop3;
		avg = total/3.0;
		
		System.out.printf("총점 : %d\n",total);
		System.out.printf("평균 : %1.2f", avg);


	}

}
