package iofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_07_InputStreamReader {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String con,con2;
		try {
			System.out.println("파일의 이름을 입력하시오");
			String fileName = br.readLine();
			System.out.println("파일에 저장할 내용을 입력하시오");
			BufferedWriter bw= new BufferedWriter(new FileWriter(fileName));
			while ((con = br.readLine()) != null) { //ctrl+z null 값을 반환한다.
				bw.write(con);
				//bw.write("\r\n");
				bw.newLine();
			}
			br.close();
			bw.close();
			System.out.println("입력이 끝났습니다.");
			BufferedReader br2=new BufferedReader(new FileReader(fileName));
			while((con2=br2.readLine())!=null) {
				System.out.println(con2);
			}
			br2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
