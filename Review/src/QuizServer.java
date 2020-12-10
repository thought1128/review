

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
		} catch (IOException e) {
			System.out.println("7777은 이미 사용중인 포트번호임");
			System.exit(1);
		}
		
		System.out.println("Server ready..");
		try {
			clientSocket = serverSocket.accept();
			System.out.println("접속됨");
			
		} catch (IOException e) {
			System.out.println("accept 실패");
			System.exit(1);
		}
		
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);   
		
		BufferedReader in = new BufferedReader(
								new InputStreamReader(
										clientSocket.getInputStream()));
		String outputLine;
		String inputLine;
		
		QuizBank bank = new QuizBank();
		
		outputLine = bank.process(null);
//		outputLine : 퀴즈시작
		
		out.println(outputLine);
		
		while( (inputLine = in.readLine()) != null) {
			//inputLine : y or n
			// inputLine : 클라이언트가 보내온 정답
			
			outputLine = bank.process(inputLine);
//			outputLine : 0번 문제
			
			out.println(outputLine);
			
			if(outputLine.equals("quit")) {
				break;
			}
		}
		in.close();
		out.close();
	}
}
