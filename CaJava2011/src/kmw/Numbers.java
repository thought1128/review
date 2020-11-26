package kmw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
	Scanner user = new Scanner(System.in);
	
	private int[] random = new int[5];
	private int[] userNumber = new int[5];
	private int menu = 0;
	private boolean run = true;
	private int seconds = 29;
	private int challenge = 1;
	private int save = 1;
	private String textValue;
	


	public void manual() {
		System.out.println("-----------------------------------------");
		System.out.println("|\s1 ~ 100 사이의 숫자가 나옵니다\t\t|");
		//System.out.println("|\s기본 설정은 숫자가 5개, 시간은 30초입니다\t|");
		System.out.println("|\s숫자개수는 암기할 숫자의 개수를 설정할 수 있습니다\t|");
		System.out.println("|\s시간을 설정할 수 있습니다(초 단위)\t\t|");
		System.out.println("|\s암기한 숫자는 하나씩 입력하셔야 합니다\t\t|");
		System.out.println("-----------------------------------------");
	}


	public int menu() {
		try {
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
		} catch (Exception e) {
			user.nextLine();
			System.out.println("문자는 입력이 되지 않습니다.");
			System.out.println("1 ~ 7 사이의 숫자를 입력하셔야 합니다");
			menu();
		}

		return menu;
	}

	public int menu2() {
		try {
			System.out.println("-----------------");
			System.out.println("|\s\s저장 및 불러오기\s\s\s|");
			System.out.println("-----------------");
			System.out.println("|\s\s1.\s저장하기\s\s\s\s\s\s\s\s|");
			System.out.println("|\s\s2.\s불러오기\s\s\s\s\s\s\s\s|");
			System.out.println("-----------------");
			System.out.print("> ");
			menu = user.nextInt();
			user.nextLine();
		} catch (Exception e) {
			user.nextLine();
			System.out.println("문자는 입력이 되지 않습니다");
			System.out.println("1과 2로 메뉴를 선택해야 합니다");
			menu2();
		}
		return menu;

	}


	public int[] level(int lv) {
		return new int[lv];
	}


	public void levelMenu() {
		try {
			System.out.println("몇개의 숫자를 외울지 입력해주세요");
			System.out.print(">\s");
			int lv = user.nextInt();
			random = level(lv);
			userNumber = level(lv);
			System.out.println("이제\s" + lv + "개의 숫자가 나옵니다.");
		} catch (Exception e) {
			user.nextLine();
			System.out.println("문자는 입력할 수 없습니다.");
			levelMenu();
		}

	}


	public int time(int sec) {
		return seconds = sec;
	}


	public void timeMenu() {
		try {
			System.out.println("시간을 정해주세요(단위: 초)");
			System.out.print("> ");
			int sec = user.nextInt();
			seconds = sec - 1;
			System.out.println("시간이\s" + sec + "초로 설정 되었습니다.");
		} catch (Exception e) {
			user.nextLine();
			System.out.println("문자는 입력할 수 없습니다.");
			timeMenu();
		}

	}


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


	public void memorization(int seconds) {
		random();
		System.out.println("암기 시간은\s" + (seconds + 1) + "초 입니다.");
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


	public void userSet() {
		try {
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

		} catch (Exception e) {
			user.nextLine();
			System.out.println("문자는 입력할 수 없습니다.");
			System.out.println("처음부터 다시 입력해주세요.");
			userSet();
		}

	}


	public void result() {
		System.out.println("정답");
		System.out.printf("[ ");
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
		}
		System.out.println("]");

	}


	public void result(int[] array) {
		System.out.println("입력한 숫자");
		System.out.printf("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}


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


	public void challenge() {
		int lv = 1;
		int time = 1;
		challenge = 1;
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

	public void challenge(int challenge) {

			int lv = challenge;
			int time = challenge;
			this.challenge = challenge;
			boolean challengeTrue = true;
			while (challengeTrue) {
				random = level(lv);
				userNumber = level(lv);
				time(time);
				memorization(seconds);
				challengeTrue = rank(this.challenge, challengeTrue);
				this.challenge++;
				lv++;
				time = time + 2;
			}
			this.save=this.challenge;
			this.challenge=1;

	}


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
				challenge(challenge);
			} else if (menu == 5) {
				menu2();
				if (menu == 1) {
					save(save);
				} else if (menu == 2) {
					System.out.print("파일명을 입력해주세요>\s");
					String name = user.next();
					user.nextLine();
					load(name);
				} else {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("1 이나 2를 입력해주세요.");
				}

			} else if (menu == 6) {
				manual();
			} else if (menu == 7) {
				System.out.println("종료되었습니다.");
				run = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("1 ~ 8 사이의 숫자만 입력해주세요.");
			}
		}

	}

	public String save(int score) {
		int scores = score;
		String name = "김민우";
		System.out.print("이름을 입력해주세요>\s");
		name = user.next();

		try {
			OutputStream record = new FileOutputStream("C:/Users/admin/Desktop/" + name + ".txt");
			if (score == 0) {
				scores = 1;
			}
			String lv = scores + "";
			byte[] by = lv.getBytes();
			record.write(by);
			record.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		System.out.println("저장 완료");
		return name;
	}

	public void load(String name) {
		StringBuffer contentValue = new StringBuffer();
		try {
			File file = new File("C:/Users/admin/Desktop/" + name + ".txt");
			FileReader file_reader = new FileReader(file);
			int cur = 0;
			while ((cur = file_reader.read()) != -1) {
				contentValue.append((char) cur);
			}
			textValue = contentValue.toString();
			challenge = Integer.parseInt(textValue);
			if (challenge == 0) {
				challenge = 1;
			}
			System.out.println(challenge + "\s단계부터 도전모드를 시작합니다.");
			file_reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일명을 정확히 입력하셔야 합니다");
			System.out.println("저장한 기록이 없다면 저장을 먼저 해주셔야합니다");
			e.getStackTrace();
		} catch (IOException e) {
			System.out.println("파일명을 정확히 입력해주세요");
			e.getStackTrace();
		}
	}

}
