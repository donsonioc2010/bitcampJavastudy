package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import thread.ServerThread;

public class example {
	public example() {
		ArrayList<Socket> list = new ArrayList<Socket>();
		Socket clientSocket = null;
		try {

			ServerSocket serSocket = new ServerSocket(9000);//서버의 문지기

			while(true) {
				System.out.println("접속대기중...");
				clientSocket = serSocket.accept();

				list.add(clientSocket);
				System.out.println("Client IP "+clientSocket.getInetAddress()+" Port : "+clientSocket.getPort());
			
				new ServerThread(clientSocket,list).start();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
