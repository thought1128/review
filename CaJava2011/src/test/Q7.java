package test;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("상품명 입력\n----------");
		System.out.printf("상품명> ");
		String cellP= input.next();
		System.out.println("\n판매수량 입력\n----------");
		System.out.printf("수량> ");
		int quantity= input.nextInt();
		System.out.println("\n상품가격\n----------");
		System.out.printf("가격> ");
		double price= input.nextDouble();
		System.out.println("\n상품내역 출력\n----------");
		System.out.println("상품명: "+cellP+"\n판매수량: "+quantity+"\n상품가격: "+price);
		input.close();
	}

}
