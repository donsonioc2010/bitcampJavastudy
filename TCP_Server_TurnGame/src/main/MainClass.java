package main;
import java.util.*;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import Thread.ReadThread;
import dto.Userdto;

public class MainClass {

	public static void main(String[] args) {
		Socket clientSocket =null;
		List<Userdto> list = new ArrayList<Userdto>();
		
		int i = 1;
		try {
			ServerSocket serSocket = new ServerSocket(9005);
			
			while(true) {
			System.out.println("접속대기중...");
				clientSocket = serSocket.accept();
							
				System.out.println("client IP:" + clientSocket.getInetAddress() 
				+ " Port:" + clientSocket.getPort());				
				
				ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
				Userdto info = (Userdto)ois.readObject();
				info.setSc(clientSocket);
				info.setUserNumber(i);
				i++;
				info.setPlay(info.getUserNumber());
				list.add(info);
				
				new ReadThread(clientSocket,list).start();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
