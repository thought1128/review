package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Ex13_02_Ip {
	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String url= br.readLine();
			InetAddress[] address= InetAddress.getAllByName(url);
			/*
			 * for(InetAddress i:address) { System.out.println(i); }
			 */
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
