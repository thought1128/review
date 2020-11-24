package arrayex;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			//sum1 = sum1+scores[i];
			sum1 += scores[i];
		}
		System.out.println("총합 : "+sum1);
		/*
		 * int[] scores2 = new int[3]; scores2[0] = 83; scores2[1] = 90; scores2[2] =
		 * 87;
		 */
		ArrayEx3 ex = new ArrayEx3();
		int sum2 = ex.add(scores);
		//int sum3 = add(scores2);
		System.out.println("총합 : "+sum2);
		//System.out.println("총합 : "+sum3);
			
	}
	public int add(int[] scores) {
		int sum=0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;	
	}
}
