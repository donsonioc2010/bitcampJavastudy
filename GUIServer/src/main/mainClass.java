package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import thread.ServerThread;

public class mainClass {

	public static void main(String[] args) {

		Socket clientsocket = null;
		
		List<Socket> list = new ArrayList<Socket>();
		
		try {
			// 문지기 소켓
			// 192.168.7.66			
			ServerSocket serSocket = new ServerSocket(9000);
			// IP, Port 설정 
			// binding(적용)
			// listen
			
			while(true) {
				// client를 기다림
				System.out.println("접속 대기중...");
				clientsocket = serSocket.accept();
				
				list.add(clientsocket);
				
				System.out.println("client IP:" + clientsocket.getInetAddress() 
									+ " Port:" + clientsocket.getPort());				
					
				
				new ServerThread(clientsocket, list).start();
				
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

















