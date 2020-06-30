package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import thread.EchoThread;

public class mainClass {
	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket socket =null;		
		
		//클라이언트와 연결된 소켓들을 배열처럼 저장할 벡터객체 생성
		Vector<Socket> vec = new Vector<Socket>();
		
		try{
			server= new ServerSocket(9000);
			
			while(true){
				System.out.println("접속대기중..");				
				
				socket = server.accept();
				
				//클라이언트와 연결된 소켓을 벡터에 담기
				vec.add(socket);
				
				//스레드 구동
				new EchoThread(socket, vec).start();
			}
		}catch(IOException ie){
			System.out.println(ie.getMessage());
		}
	}
}