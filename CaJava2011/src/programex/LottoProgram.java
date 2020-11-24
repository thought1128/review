package programex;

import java.util.Arrays;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) {
		String s1= "당신이 입력한 숫자는";
		String s2= "로또 당첨 번호는 ";
		char end='y';
		int[] lottoArray= new int[6];
		int[] userArray= new int[6];
		Scanner userPut= new Scanner(System.in);
		Lotto lt= new Lotto(45);
		End: do {
			System.out.println(">> Lotto Program");
			System.out.println("1 ~ 99 사이의 숫자 6개를 입력해 주세요.");
			lt.random(lottoArray);
			lt.random(userArray,userPut);
			Arrays.sort(lottoArray);
			Arrays.sort(userArray);
			lt.result(userArray, s1);
			lt.result(lottoArray, s2);
			lt.rank(lottoArray, userArray);
			
			while(true) {
				System.out.println("계속 진행하시겠습니까? y/n");
				end = userPut.next().charAt(0);
				if(end=='y'||end=='Y') {
					continue End;
					
				}else if(end=='n'||end=='N'){
					System.out.println("프로그램을 종료합니다.");
					break End;
				}else {
					System.out.println("Y이나 N을 입력하셔야합니다.(대소문자는 구분하지 않습니다.)");
				}
			}
		}while(end=='y'||end=='Y');
	}
}