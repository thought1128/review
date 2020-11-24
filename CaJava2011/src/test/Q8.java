package test;

public class Q8 {

	public static void main(String[] args) {
		int[] record= {100, 90, 80};
		System.out.println("\n성적 출력\n------------------------");
		System.out.printf("\t영어 : "+record[0]);
		System.out.printf("\n\t국어 : "+record[1]);
		System.out.printf("\n\t수학 : "+record[2]);
		System.out.printf("\n\t총점 : "+Q1.add(record));
		System.out.printf("\n\t평 균 : %.2f",Q1.avg(record));
		System.out.println("\n------------------------");

	}

}
