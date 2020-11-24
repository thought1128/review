package kimminwoo;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers implements NumberFace {
	Scanner user = new Scanner(System.in);

	int[] random = new int[5];
	int[] userNumber = new int[5];
	int menu = 0;
	boolean run = true;
	int seconds = 29;

	@Override
	public void manual() {
		System.out.println("--------------------------------------------");
		System.out.println("| 1 ~ 100 사이의 숫자가 나옵니다                                  |");
		System.out.println("| 기본은 숫자 5개 시간은 30초입니다                                 |");
		System.out.println("| 숫자개수는 암기할 숫자의 개수를 설정할 수 있습니다          |");
		System.out.println("| 시간을 설정할 수 있습니다(초 단위)                |");
		System.out.println("| 암기한 숫자는 하나씩 입력하셔야 합니다                           |");
		System.out.println("--------------------------------------------");
	}

	@Override
	public int menu() {
		System.out.println("----------------");
		System.out.println("|   숫자 외우기      |");
		System.out.println("----------------");
		System.out.println("|  1. 암기하기      |");
		System.out.println("|  2. 숫자개수      |");
		System.out.println("|  3. 시간/초       |");
		System.out.println("|  4. 도전모드      |");
		System.out.println("|  5. 설명서         |");
		System.out.println("|  6. 종료            |");
		System.out.println("----------------");
		System.out.print("> ");
		menu = user.nextInt();
		user.nextLine();
		return menu;
	}

	@Override
	public int[] level(int lv) {
		return new int[lv];
	}

	@Override
	public void levelMenu() {
		System.out.println("몇개의 숫자를 외울지 입력해주세요");
		System.out.print("> ");
		int lv = user.nextInt();
		random = level(lv);
		userNumber = level(lv);
		System.out.println("이제 " + lv + "개의 숫자가 나옵니다.");
	}

	@Override
	public int time(int sec) {
		return seconds = sec;
	}

	@Override
	public void timeMenu() {
		System.out.println("시간을 정해주세요");
		System.out.print("> ");
		int sec = user.nextInt();
		seconds = sec - 1;
		System.out.println("시간이 " + sec + "초로 설정 되었습니다.");
	}

	@Override
	public void random() {

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100) + 1;
			for (int j = 0; j < i; j++) {
				if (random[i] == random[j]) {
					i--;
					break;
				}
			}
		}
	}

	@Override
	public void memorization(int seconds) {
		random();
		System.out.println("암기 시간은 " + (seconds+1) + "초 입니다.");
		System.out.println(Arrays.toString(random));

		int countdownSeconds = seconds;
		for (int i = countdownSeconds; i >= 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
		userSet();
		result();
		result(userNumber);

	}

	@Override
	public void userSet() {
		System.out.println("암기한 숫자를 입력해주세요.");

		for (int i = 0; i < userNumber.length; i++) {
			while (true) {
				System.out.printf("> ");
				userNumber[i] = user.nextInt();
				user.nextLine();
				if (userNumber[i] < 1 || userNumber[i] > 100) {
					System.out.println("1 ~ 100 사이의 숫자만 입력 가능합니다.");
					System.out.println((i + 1) + "번째 숫자를 다시 입력해주세요.");
				} else {
					break;
				}
			}
			for (int j = 0; j < i; j++) {

				if (userNumber[i] == userNumber[j]) {
					System.out.println("중복된 숫자를 입력할 수 없습니다.");
					System.out.println(i + 1 + "번째 숫자를 다시 입력해주세요.");
					i--;
				}
			}
		}

	}

	@Override
	public void result() {
		System.out.println("정답");
		System.out.printf("[ ");
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println("]");

	}

	@Override
	public void result(int[] array) {
		System.out.println("입력한 숫자");
		System.out.printf("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}

	@Override
	public void rank() {

		int x = 0;
		for (int i = 0; i < random.length; i++) {
			for (int j = 0; j < userNumber.length; j++) {
				if (random[i] == userNumber[j]) {
					x++;
				}
			}
		}
		if (x > 0) {
			System.out.println(x + "개를 맞았습니다.");
		} else {
			System.out.println("맞은 수가 없습니다.");
		}
		System.out.println();
	}

	@Override
	public boolean rank(int challenge, boolean ok) {
		int x = 0;
		for (int i = 0; i < random.length; i++) {
			for (int j = 0; j < userNumber.length; j++) {
				if (random[i] == userNumber[j]) {
					x++;
				}
			}
		}
		if (x == random.length) {
			System.out.println("성공했습니다.\n다음 단계로 넘어갑니다.");
			System.out.println();
			return true;
		} else {
			System.out.println(challenge + "단계 도전에 실패하였습니다.");
			System.out.println();
			return false;
		}
	}

	@Override
	public void challenge() {
		int lv = 1;
		int time = 1;
		int challenge = 1;
		boolean challengeTrue = true;
		while (challengeTrue) {
			random = level(lv);
			userNumber = level(lv);
			time(time);
			memorization(seconds);
			challengeTrue = rank(challenge, challengeTrue);
			challenge++;
			lv++;
			time = time + 2;
		}

	}

	@Override
	public void run() {

		while (run) {
			menu = menu();
			if (menu == 1) {
				memorization(seconds);
				rank();
			} else if (menu == 2) {
				levelMenu();
			} else if (menu == 3) {
				timeMenu();
			} else if (menu == 4) {
				challenge();
			} else if (menu == 5) {
				manual();
			} else if (menu == 6) {
				System.out.println("종료되었습니다.");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("1 ~ 6 사이의 숫자만 입력해주세요.");
			}
		}

	}

}
