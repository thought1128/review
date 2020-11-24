package forex;

import java.util.Scanner;

public class MultiforEx12 {

	public static void main(String[] args) {
		int n=9;
		Scanner sc = new Scanner(System.in);
		/*
		 * while (true) { System.out.println("숫자를 입력하시오(홀수,양수)"); n = sc.nextInt(); if
		 * (n % 2 == 0 || n <= 0) { System.out.println("홀수만 입력해주세요(양수입력해주세요)"); } else {
		 * break; } }
		 */
		int i, j = 0;
		int star = 0;
		// 처음위에 삼각형
		for (i = 0; i < n; i += 2) { // 윗삼각형의 높이는 밑변개수의 1/2를 만들기위해 i를 2씩 증가시킴
			for (j = n; j >= i; j -= 2) {
//            for (j = n-2; j >= i; j -= 2) { 	
				// 아이는 계속 2씩 증가하므로 제이는 밑변개수(n)으로 두고 2씩 감소시키면 줄이 바뀔때마다 공백이 한개씩 줄어들게 됨
				System.out.print("  ");
			}
			for (star = 0; star <= i; star++) { // 찍을 별의 개수를 2개씩증가시킴
				System.out.print("* ");
			}
			System.out.println(); // 줄바꿈
		}
		// 밑역삼각형
		for (i = 0; i <= n - 2; i += 2) { // 윗삼각형에 비해 1줄 적게 출력되고 최대개수가 2개 적으므로 n-2해줌
			System.out.print("  "); // 줄맞춤
			for (j = 0; j <= i; j += 2) { // 제이의 공백이 2개로 시작하여 하나씩 늘어나게함
				System.out.print("  ");
			}
			for (star = n - 2; star > i; star--) {
				// 별의개수는 2개씩 점점 줄어들게찍는다.(입력개수보다 2개 적게시작함) (위에삼각형과 부등호같은건 반대로해주면됨)
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}