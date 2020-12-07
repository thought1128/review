package iofile;

import java.io.File;

public class Ex11_01_File {
	public static void main(String[] args) {
		File win = new File("c:\\windows");// 파일의 경로를 입력 받아서 객체생성
		System.out.println(win.toString());
		System.out.println(win);

		String result = win.isDirectory() ? "폴더" : "파일";
		String result2 = win.isFile() ? "파일" : "폴더";
		System.out.println(result);
		System.out.println(result2);
		String[] list = win.list();
		System.out.println(list.length);
		File win3 = new File("김민우입니다");
		String[] list2 = win3.list();
		System.out.println("\n");
		boolean isfile = win3.isFile();
		System.out.println(isfile);

		for (int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}

		for (int i = 0; i < list.length; i++) {
			File win2 = new File(win, list[i]);
			if (win2.isFile()) {
				System.out.println("파일" + list[i]);
			} else {
				System.out.println("폴더" + list[i]);
			}

		}

		for (int i = 0; i < list.length; i++) {
			File win2 = new File(list[i]);
			if (win2.isFile()) {
				System.out.println("파일" + list[i]);
			} else {
				System.out.println("폴더" + list[i]);
			}
		}
	}
}
