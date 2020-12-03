package iofile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex11_04_FileReader {

	public static void main(String[] args) {
		try {
			FileWriter fw =new FileWriter("write.txt");
			fw.write("가");
			fw.write("\n가");
			fw.close();
			FileReader fr= new FileReader("write.txt");
			int i;;
			while((i=fr.read())!=-1) {
				System.out.print((char)i+"\s");
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
