package arrayex;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class ArrayEx41 {

	public static void main(String[] args) {
		Integer[] m = new Integer[5];
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
		Arrays.sort(m,Collections.reverseOrder());
		for(int i=0; i<m.length; i++) {
			System.out.printf("m["+i+"] 등수 :"+m[i]+" \n");
		}
		System.out.println();
		for(int i=0; i<m.length; i++) {
			System.out.printf("m["+i+"] 등수 :"+m[i]+" \n");
		}
		sc.close();
	}
}