package iofile;

import java.io.File;
import java.io.IOException;

public class Ex11_02_File {

	
	public static void main(String[] args) {
		
		//패스를 정해놓지 않으면 프로젝트 주소(C:\ca_java_2011\Review )가 기본 주소이다.
		File f1= new File("A");
		File f2= new File("B");
		File f3= new File("C");
		
//		File f4= new File("A","ab.txt");
		File f4= new File(f1,"ab.txt");
		
		if(f1.exists()) {
			f1.renameTo(f2);
		}else {
			f1.mkdir();
			try {
				f4.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		if(f3.exists()) {
			f3.delete();
		}
		
	}
}
