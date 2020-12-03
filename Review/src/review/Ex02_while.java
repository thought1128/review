package review;
import java.util.Scanner;

public class Ex02_while {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		i = 1;
		while (true) {
			System.out.println(i);
			i++;
			if (i == 10) {
				break;
			}
		}
		Scanner input=new Scanner(System.in);
		i = 1;
		int sum=0;
		while (true) {
			i=input.nextInt();
			if (i < 0) {
				input.close();
				break;
			}
			sum+=i;
		}
		System.out.println(sum);
	}

}
