package test;

public class Test2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int[] scores2 = new int[3]; 
		scores2[0] = 83; 
		scores2[1] = 90; 
		scores2[2] = 87;

		int sum = add(scores);
		System.out.println("총합 : "+sum);
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총합 : "+sum2);
		int sum3 = add(scores2);
		System.out.println("총합 : "+sum3);
			
	}
	public static int add(int[] scores) {
		int sum=0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;	
	}

}
