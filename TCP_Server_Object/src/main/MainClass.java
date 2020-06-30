package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import dto.MemberDto;

public class MainClass {
//object 로 서버,클라이언트 받는법
	public static void main(String[] args) throws Exception{
		ServerSocket serSocket = new ServerSocket(9000);
		
		System.out.println("서버 대기중...");
		Socket socket = serSocket.accept();
		System.out.println("Client IP:" + socket.getInetAddress()+ "Port : "+socket.getPort());
		
		
		
		// obj recv
		ObjectInputStream ois= new ObjectInputStream(socket.getInputStream());
		//MemberDto dt = (MemberDto)ois.readObject();
		Object obj =ois.readObject();
		//System.out.println(dt.toString());
		
		//send
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		//oos.writeObject(dt);
		oos.writeObject(obj);
		oos.flush();
	}

}
