package test;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.net.ServerSocket;

import java.net.Socket;

public class Test00 {

	ServerSocket serversocket = null;

	Socket socket = null;

	PrintWriter writer = null;

	BufferedReader reader = null;

	String lineStr;

	public Test00() {

		try {

			serversocket = new ServerSocket(2000);

			while (true) {

				socket = serversocket.accept();

				System.out.println("클라이언트 요청");

				writer = new PrintWriter(socket.getOutputStream(), true);

				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				while ((lineStr = reader.readLine()) != null) {

					writer.write(lineStr);

					System.out.println("input:" + lineStr);

				}

				writer.close();

				reader.close();

				socket.close();

			}

		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {

		new Test00();

	}

}