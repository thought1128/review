package iofile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex11_06_InputStreamReader {

	public static void main(String[] args) {
		InputStream is=System.in;
		
		InputStreamReader isr=new InputStreamReader(is);
		
		BufferedReader br=new BufferedReader(isr);
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=br.readLine();
			System.out.println(str);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
