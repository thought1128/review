package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex13_03_Server {
	public static void main(String[] args) throws IOException{
		int port=5555;
		ServerSocket ss=null;
		try {
			ss=new ServerSocket(port);
		} catch (IOException e) {
			System.out.println(port+"no port");
			
		}
		System.out.println("Server ready");
		Socket sk=null;
		try {
			sk=ss.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		BufferedReader br= new BufferedReader(new InputStreamReader(sk.getInputStream()));
		
		String line= br.readLine();
		
		System.out.println(line);
		br.close();
		sk.close();
		ss.close();
		
	}
}
