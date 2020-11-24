package programex;

import java.util.Scanner;

public class PopIOEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인구 입력");
		System.out.printf("-------\n세대1> ");
		int hoh1 = sc.nextInt();
		System.out.printf("\n세대2> ");
		int hoh2 = sc.nextInt();
		System.out.printf("\n세대2> ");
		int hoh3 = sc.nextInt(); 
		System.out.println("\n인구 출력\n------------------------");
		System.out.printf("	세대1: "+hoh1);
		System.out.printf("\n\t세대2 : "+hoh2);
		System.out.printf("\n\t세대3 : "+hoh3);
		System.out.printf("\n\t총인구 : "+(hoh1+hoh2+hoh3));
		System.out.printf("\n\t평균 : %.2f",(double)((hoh1+hoh2+hoh3)/3));
		System.out.println("\n------------------------");
		sc.close();

	}

}
