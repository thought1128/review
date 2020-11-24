package methodex;

import java.util.Scanner;
public class Population {
	
	int a=0,x=0,y=0,z=0;
	Scanner sc = new Scanner(System.in);
	public int menu() {
		System.out.println("메인 메뉴");
		System.out.println("----------------");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1.인구입력");
		System.out.println("2.인구출력");
		System.out.println("3.종료");
		System.out.printf(">");
		a = sc.nextInt();
		return a;
	}
	public int menu(Scanner s) {
		System.out.println("메인 메뉴");
		System.out.println("----------------");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1.인구입력");
		System.out.println("2.인구출력");
		System.out.println("3.종료");
		System.out.printf(">");
		a = s.nextInt();
		return a;
	}
	public void inPut() {
		System.out.println("인구 입력 (단위: 만명)");
		System.out.println("-----------------");
		System.out.println("1000~3000 사이로 입력하세요");
		System.out.printf("세대1: ");
		x = sc.nextInt();
		System.out.printf("세대2: ");
		y = sc.nextInt();
		System.out.printf("세대3: ");
		z = sc.nextInt();
		while (x < 1000 || y < 1000 || z < 1000 || x > 3000 || y > 3000 || z > 3000) {
			System.out.println("다시 입력해주세요");
			System.out.println("1000~3000 사이의 수로 입력하셔야 합니다.");
			System.out.printf("세대1: ");
			x = sc.nextInt();
			System.out.printf("세대2: ");
			y = sc.nextInt();
			System.out.printf("세대3: ");
			z = sc.nextInt();
		}
	}
	public void inPut(Scanner s) {
		System.out.println("인구 입력 (단위: 만명)");
		System.out.println("-----------------");
		System.out.println("1000~3000 사이로 입력하세요");
		System.out.printf("세대1: ");
		x = s.nextInt();
		System.out.printf("세대2: ");
		y = s.nextInt();
		System.out.printf("세대3: ");
		z = s.nextInt();
		while (x < 1000 || y < 1000 || z < 1000 || x > 3000 || y > 3000 || z > 3000) {
			System.out.println("다시 입력해주세요");
			System.out.println("1000~3000 사이의 수로 입력하셔야 합니다.");
			System.out.printf("세대1: ");
			x = s.nextInt();
			System.out.printf("세대2: ");
			y = s.nextInt();
			System.out.printf("세대3: ");
			z = s.nextInt();
		}
	}

	public void outPut() {
		
		System.out.println("인구 입력 (단위: 만명)");
		System.out.println("-----------------");
		System.out.println("세대1 : " + x);
		System.out.println("세대2 : " + y);
		System.out.println("세대3 : " + z);
		System.out.println("총인구 : " + (x + y + z));
		System.out.printf("평균 : %.2f\n", (float) ((x + y + z) / 3.0));
	}
	public void pop() {
		while (true) {
			a = menu();
			if (a == 1) {
				inPut();
			} else if (a == 2) {
				outPut();
			} else if (a == 3) {
				System.out.println("감사합니다!");
				break;
			}
		}
		sc.close();
	}
}
