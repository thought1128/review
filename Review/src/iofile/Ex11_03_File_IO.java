package iofile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_03_File_IO {

	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("from.txt");
			
			FileOutputStream fos= new FileOutputStream("to.txt",true);
			//false or default : 파일이 없으면 생성, 파일이 있어도 새로 생성
			//true : 파일이 없으면 생성, 파일이 있으면 추가
			int i;
			/*
			 * while(true) { i= fis.read(); System.out.print(i+"\s"); if(i==-1) { break;
			 * }else { //fos.write(i); } }
			 */
			while((i=fis.read())!=-1) {
				System.out.print(i+"\s");
				fos.write(i);
			}

			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
