package arrayex;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {
		int[] m = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요.");
		for(int i=0; i<m.length; i++) {
			System.out.print("정수:"+(i+1)+">");
			m[i] = sc.nextInt();
		}
		for(int a:m) {
			System.out.print(a+" ");
		}
		System.out.println();
		int max = m[0];
		int min = m[0];
		for(int i=0; i<m.length; i++) {
			if(max < m[i]) max = m[i];
			if(min > m[i]) min = m[i];
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		sc.close();
	}

}
