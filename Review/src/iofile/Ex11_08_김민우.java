package iofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_08_김민우 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String search, textWord;

		while (true) {
			System.out.print("1.단어입력 2.단어검색 3.종료 >>");
			int menu = br.read();
			br.readLine();
			if (menu == 49) {
				BufferedWriter bw = new BufferedWriter(new FileWriter("word.txt", true));
				System.out.print("단어/뜻 입력>>");
				bw.write(br.readLine());
				bw.newLine();
				bw.flush();
				bw.close();
			} else if (menu == 50) {
				boolean have = false;
				System.out.print("검색 단어 입력>>");
				search = br.readLine();
				BufferedReader br2 = new BufferedReader(new FileReader("word.txt"));
				while ((textWord = br2.readLine()) != null) {
					String[] words = textWord.split("/");
					if (words[0].equals(search)) {
						System.out.println("단어>" + words[0]);
						System.out.print("단어의 뜻>" + words[1] + "\n");
						have = true;
					}
				}
				if (!have) {
					System.out.println("찾는 단어 없음");
				}
				br2.close();
			} else if (menu == 51) {
				System.out.println("프로그램을 종료합니다.");
				br.close();
				break;
			}

		}

	}
}
