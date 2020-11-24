package ifelseex;

import java.util.Scanner;

public class IfelseEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		for(int i=0; i<4; i++ ) {
			System.out.print("년도 입력: ");
			a = sc.nextInt();
			if(a%(a%25!=0?4:16)==0) {
				System.out.println("윤년");
			}else {
				System.out.println("평년");
			}
		}
	}
}