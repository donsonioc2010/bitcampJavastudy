package thread;

import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {
	Socket clientSocket;
	ArrayList<Socket> list;
	public ServerThread(Socket clientSocket,ArrayList<Socket> list) {
		this.clientSocket = clientSocket;
		this.list = list;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		try {
			while(true) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
				String packetStr = reader.readLine();
				
				
				System.out.println("클라이언트로부터 패킷 : "+ packetStr);
				
				//Send
				for(int i = 0; i<list.size();i++){
					Socket soc = list.get(i);
					if(soc!=clientSocket) {
						PrintWriter pw = new PrintWriter(soc.getOutputStream());
						pw.println(packetStr);
						pw.flush();	
					}
				}
				Thread.sleep(100);
			}
		}catch (Exception e) {
			System.out.println("연결이 끊긴 IP : "+clientSocket.getInetAddress());
			
			list.remove(clientSocket); //object를 통해 list의 같은 값을 지움
			
			
			//남은 client를 확인
			for (Socket s : list) {
				System.out.println("접속중인 클라이언트 IP: "+ s.getInetAddress()+" portNum : "+s.getPort());
			}
			try {
				clientSocket.close();
			}catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
