package kmw.menu;

import java.util.Scanner;

public class Main {
	int menu;
	public int menu(Scanner user) {
		System.out.println("----------------");
		System.out.println("|\s\s\s숫자 외우기\s\s\s\s\s\s|");
		System.out.println("----------------");
		System.out.println("|\s\s1.\s암기하기\s\s\s\s\s\s|");
		System.out.println("|\s\s2.\s숫자개수\s\s\s\s\s\s|");
		System.out.println("|\s\s3.\s시간/초\s\s\s\s\s\s\s|");
		System.out.println("|\s\s4.\s도전모드\s\s\s\s\s\s|");
		System.out.println("|\s\s5.\s도전기록\s\s\s\s\s\s|");
		System.out.println("|\s\s6.\s설명서\s\s\s\s\s\s\s\s\s|");
		System.out.println("|\s\s7.\s종료\s\s\s\s\s\s\s\s\s\s\s\s|");
		System.out.println("----------------");
		System.out.print(">\s");
		menu = user.nextInt();
		user.nextLine();
		
		user.nextLine();
		System.out.println("문자는 입력이 되지 않습니다.");
		System.out.println("1 ~ 7 사이의 숫자를 입력하셔야 합니다");
		menu(user);
	return menu;
}
}
