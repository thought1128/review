package programex;

import java.util.Scanner;

public class Lotto {
	int range;
	/*
	 * public Lotto lotto() { Lotto lotto=new Lotto(); return lotto; }
	 */
	Lotto(){
		
	}
	Lotto(int range){
		this.range=range;
	}
	public void random(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * this.range) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
				}
			}
		}
	}

	public void random(int[] array, Scanner user) {

		for (int i = 0; i < array.length; i++) {
			range(i,array,user);
			for (int j = 0; j < i; j++) {

				if (array[i] == array[j]) {
					System.out.println("중복된 숫자를 입력할 수 없습니다.");
					System.out.println(i + 1 + "번째 숫자를 다시 입력해주세요.");
					i--;
				}
			}
		}
	}
	private void range(int index,int[] array,Scanner user) {
		while (true) {
			array[index] = user.nextInt();
			if (array[index] < 1 || array[index] > this.range) {
				System.out.println("1 ~ 99 사이의 숫자만 입력 가능합니다.");
				System.out.println((index+1)+"번째 숫자를 다시 입력해주세요.");
			} else {
				break;
			}
		}
	}

	public void result(int[] array, String contents) {
		System.out.printf(contents);
		for (int i = 0; i < array.length; i++) {
			System.out.printf(" " + array[i]);
		}

	}

	public void rank(int[] random, int[] user) {

		int x = 0;
		for (int i = 0; i < random.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (random[i] == user[j]) {
					x++;
				}
			}
		}
		switch (x) {
		case 1:
			System.out.println("\n6등");

			break;
		case 2:
			System.out.println("\n5등");

			break;
		case 3:
			System.out.println("\n4등");

			break;
		case 4:
			System.out.println("\n3등");

			break;
		case 5:
			System.out.println("\n2등");

			break;
		case 6:
			System.out.println("\n1등");

			break;
		default:
			System.out.println("\n같은 번호가 없습니다.");
			break;
		}
	}
}