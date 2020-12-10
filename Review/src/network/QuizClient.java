package network;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class QuizClient {
	public static void main(String[] args) {

		Socket clientSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		BufferedReader br = null;
		try {
			clientSocket = new Socket("localhost",7777);
			
			out = new PrintWriter(clientSocket.getOutputStream(),true);       
			
			in = new BufferedReader(
					new InputStreamReader(
							clientSocket.getInputStream()));
			
			br = new BufferedReader(
					new InputStreamReader(System.in));
			
			String fromServer;
			String fromUser;
			
			while( (fromServer = in.readLine()) != null ) {
				System.out.println("���� : " + fromServer);
//				���� :�������y or n
				if(fromServer.equals("quit")) {
					break;
				}
				
				fromUser = br.readLine(); // Ŭ���̾�Ʈ�� �Է�(y or n)
				System.out.println("Ŭ���̾�Ʈ:" + fromUser);
				out.println(fromUser);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
