package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
	public ClientExample() {
		InetSocketAddress sockAddr = new InetSocketAddress("127.0.0.1", 52525);
		
		Socket sc = new Socket();
		//connect(소켓,timeout(접속이안될시 접속종료))
		try {
			sc.connect(sockAddr,10000);//10초 timeout
			
			InetAddress inetAddr;
			if((inetAddr=sc.getInetAddress())!=null) {
				System.out.println("Server Connect Success! "+inetAddr);
			}else {
				System.out.println("Server Connect Fail");
			}
			
			//Recv(받기)
			//언제든지 Packet을 받을 준비를 해놓는 Thread
			//new ClientThread(sc).start();
			while(true) {
				
				//Send(보내기) Client->Server
				System.out.print("메세지입력:");
				String packetStr =	new Scanner(System.in).next();
				
				PrintWriter pw = new PrintWriter(sc.getOutputStream());
				pw.println(packetStr);
				pw.flush();//전송을 하면 무조건 flush로 끊어야한다
			}
			

		}catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
