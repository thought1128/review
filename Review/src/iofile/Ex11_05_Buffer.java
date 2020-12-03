package iofile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11_05_Buffer {

	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("data.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos,1);
			
			FileInputStream fis=new FileInputStream("data.txt");
			BufferedInputStream bis=new BufferedInputStream(fis,1);
			for(int i=1; i<=9;i++) {
				bos.write(i+48);
			}
			bos.flush();
			int i;
			while((i=fis.read())!=-1) {
				System.out.print((char)i+"\s");
			}
			System.out.println("\n??");
			while((i=bis.read())!=-1) {
				System.out.print((char)i+"\s");
			}
			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		}

	}

}
