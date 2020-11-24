package test;

public class Q1 {
public static int add(int[] scores) {
	int sum=0;
	for(int sumF: scores) {
		sum += sumF;
	}
	return sum;
}
public static double avg(int[] scores) {
	double avg= add(scores)/scores.length;
	return avg;
}
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		System.out.println("점수 총합= "+add(scores));
		System.out.printf("점수 평균= %.2f",avg(scores));
	}

}
