package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex13_03_Client {
	
	public static void main(String[] args) throws IOException{
		Socket sk=null;
		try {
			sk= new Socket("localhost",5555); //127.0.0.1 localhost 아이피주소를 내 컴퓨터의 주소를 사용할때 사용된다.
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String clientLine= br.readLine();
		
		PrintWriter pw =new PrintWriter(sk.getOutputStream());
		pw.println(clientLine);
		pw.close();
		br.close();
	}
}
