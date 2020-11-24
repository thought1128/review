package whileex;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int x=1;
		int a=(int)(Math.random()*10);
		while(true) {
			System.out.println(a);
			int b=0;
			System.out.printf("찍어봐(0~9): ");
			b=sc.nextInt();
			if(a<b && b<=9) {
				System.out.println("크다");
				x++;
			}else if(a>b && b>=0){
				System.out.println("작다");
				x++;
			}else if(a==b){
				System.out.println(x+"번만에 맞추었습니다");
				break;
			}else if(b<0||b>9) {
				System.out.println("0~9사이의 숫자를 입력해주세요");
			}
		}
		sc.close();

	}

}
