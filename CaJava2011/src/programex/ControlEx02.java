package programex;

import java.util.Scanner;

import methodex.Population;

public class ControlEx02{
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		Scanner sc = new Scanner(System.in);
		Population po = new Population();

		//po.pop();
		
		while (true) {
			a = po.menu(sc);
			if (a == 1) {
				po.inPut(sc);
			} else if (a == 2) {
				po.outPut();
			} else if (a == 3) {
				System.out.println("감사합니다!");
				break;
			}
		}
		sc.close();

		/*
		 * while (true) { System.out.println("메인 메뉴");
		 * System.out.println("----------------"); System.out.println("메뉴를 선택해 주세요.");
		 * System.out.println("1.인구입력"); System.out.println("2.인구출력");
		 * System.out.println("3.종료"); System.out.printf(">"); a = sc.nextInt();
		 * 
		 * if (a == 1) {
		 * 
		 * System.out.println("인구 입력 (단위: 만명)");
		 * System.out.println("-----------------");
		 * System.out.println("1000~3000 사이로 입력하세요"); System.out.printf("세대1: "); b =
		 * sc.nextInt(); System.out.printf("세대2: "); c = sc.nextInt();
		 * System.out.printf("세대3: "); d = sc.nextInt(); while (b < 1000 || c < 1000 ||
		 * d < 1000 || b > 3000 || c > 3000 || d > 3000) {
		 * System.out.println("다시 입력해주세요");
		 * System.out.println("1000~3000 사이의 수로 입력하셔야 합니다.");
		 * System.out.printf("세대1: "); b = sc.nextInt(); System.out.printf("세대2: "); c =
		 * sc.nextInt(); System.out.printf("세대3: "); d = sc.nextInt(); }
		 * 
		 * } else if (a == 2) {
		 * 
		 * System.out.println("인구 입력 (단위: 만명)");
		 * System.out.println("-----------------"); System.out.println("세대1 : " + b);
		 * System.out.println("세대2 : " + c); System.out.println("세대3 : " + d);
		 * System.out.println("총인구 : " + (b + c + d)); System.out.printf("평균 : %.2f\n",
		 * (float) ((b + c + d) / 3.0));
		 * 
		 * } else if (a == 3) { System.out.println("감사합니다!"); break; } } sc.close();
		 */

		/*
		 * switchs: while (true) { System.out.println("메인 메뉴");
		 * System.out.println("----------------"); System.out.println("메뉴를 선택해 주세요.");
		 * System.out.println("1.인구입력"); System.out.println("2.인구출력");
		 * System.out.println("3.종료"); System.out.printf(">"); a = sc.nextInt(); switch
		 * (a) { case 1: System.out.println("인구 입력 (단위: 만명)");
		 * System.out.println("-----------------");
		 * System.out.println("1000~3000 사이로 입력하세요"); System.out.printf("세대1: "); b =
		 * sc.nextInt(); System.out.printf("세대2: "); c = sc.nextInt();
		 * System.out.printf("세대3: "); d = sc.nextInt(); do {
		 * System.out.println("다시 입력해주세요");
		 * System.out.println("1000~3000 사이의 수로 입력하셔야 합니다.");
		 * System.out.printf("세대1: "); b = sc.nextInt(); System.out.printf("세대2: "); c =
		 * sc.nextInt(); System.out.printf("세대3: "); d = sc.nextInt();
		 * 
		 * } while (b < 1000 || c < 1000 || d < 1000 || b > 3000 || c > 3000 || d >
		 * 3000); break; case 2: System.out.println("인구 입력 (단위: 만명)");
		 * System.out.println("-----------------"); System.out.println("세대1 : " + b);
		 * System.out.println("세대2 : " + c); System.out.println("세대3 : " + d);
		 * System.out.println("총인구 : " + (b + c + d)); System.out.printf("평균 : %.2f\n",
		 * (float) ((b + c + d) / 3.0)); break; case 3: System.out.println("감사합니다!");
		 * sc.close(); break switchs; } }
		 */

		/*
		 * for (int i = 0; i < 12; i++) { System.out.println("메인 메뉴");
		 * System.out.println("----------------"); System.out.println("메뉴를 선택해 주세요.");
		 * System.out.println("1.인구입력"); System.out.println("2.인구출력");
		 * System.out.println("3.종료"); System.out.printf(">"); a = sc.nextInt(); if (a
		 * == 1) { System.out.println("인구 입력 (단위: 만명)");
		 * System.out.println("-----------------");
		 * System.out.println("1000~3000 사이로 입력하세요"); System.out.printf("세대1: "); b =
		 * sc.nextInt(); System.out.printf("세대2: "); c = sc.nextInt();
		 * System.out.printf("세대3: "); d = sc.nextInt(); } else if (a == 2) {
		 * System.out.println("인구 입력 (단위: 만명)");
		 * System.out.println("-----------------"); System.out.println("세대1 : " + b);
		 * System.out.println("세대2 : " + c); System.out.println("세대3 : " + d);
		 * System.out.println("총인구 : " + (b + c + d)); System.out.println("평균 : " + (b +
		 * c + d) / 3.0); } else if (a == 3) { System.out.println("감사합니다!"); sc.close();
		 * break; } continue; }
		 */
	}
}