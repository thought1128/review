package strdpgex;

import java.util.Scanner;

public class Lotto {
	int range = 99;
	int menu;
	int[] randomLottoAarray = new int[6];
	Scanner user = new Scanner(System.in);

	public void randomLotto() {
		for (int i = 0; i < randomLottoAarray.length; i++) {
			randomLottoAarray[i] = (int) (Math.random() * this.range) + 1;
			for (int j = 0; j < i; j++) {
				if (randomLottoAarray[i] == randomLottoAarray[j]) {
					i--;
				}
			}
		}
	}

	Lotto(int menu) {
		this.menu = menu;
	}

	public int menu() {
		System.out.println("메인 메뉴");
		System.out.println("----------------");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 번호 입력");
		System.out.println("2. 번호 출력");
		System.out.println("3. 종료");
		System.out.printf(">");
		menu = user.nextInt();
		return menu;
	}

	public void userNumber(int[] array) {
		System.out.println("번호 입력");
		System.out.println("--------------------");
		System.out.println("1 ~ 99사이에서 선택하세요");
		for (int i = 0; i < array.length; i++) {
			range(i, array);
			for (int j = 0; j < i; j++) {

				if (array[i] == array[j]) {
					System.out.println("중복된 숫자를 입력할 수 없습니다.");
					System.out.println(i + 1 + "번째 숫자를 다시 입력해주세요.");
					i--;
				}
			}
		}
	}

	private void range(int index, int[] array) {
		while (true) {
			System.out.printf("번호" + (index + 1) + ": ");
			array[index] = user.nextInt();
			if (array[index] < 1 || array[index] > this.range) {
				System.out.println("1 ~ 99 사이의 숫자만 입력 가능합니다.");
				System.out.println((index + 1) + "번째 숫자를 다시 입력해주세요.");
			} else {
				break;
			}
		}
	}

	public void result() {
		System.out.println("번호 출력");
		System.out.println("----------");
		System.out.println("로또 번호");
		for (int i = 0; i < randomLottoAarray.length; i++) {
			System.out.printf(" " + randomLottoAarray[i]);
		}

	}

	public void result(int[] array) {
		System.out.println();
		System.out.println("입력받은 번호");
		for (int i = 0; i < array.length; i++) {
			System.out.printf(" " + array[i]);
		}

	}

	public void rank(int[] user) {

		int x = 0;
		for (int i = 0; i < randomLottoAarray.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (randomLottoAarray[i] == user[j]) {
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
