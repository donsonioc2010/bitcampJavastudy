package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.imageio.IIOException;

import thread.ServerThread;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	Server : TCP, DB(oracle),Web(tomcat)
		 	
		 	TCP: Transmission Control Protocol
		 			전송			제어		규약ㅊ
		 	
		 	통신 : 송신, 수신
		 	종단시스템 : Host
		 			  네트워크 상에서 더 연장되지 않는 기기 마지막기기
		 			  PC , SmartPhone, Scanner, Printer....
		 			  
		 	Router : HardWare
		 			  Host간의 상호 데이터를 교환할수 있도록 하는 장비
		 			  
		 	inter net : 포괄적인 통신
		 	
		 	www : world wide web
		 	URL : Uniform Resource Locator
		 	
		 	통신규약 : 
		 	TCP : Transmission Control Protocol
		 	UDP : User Datagram Protocol
		 	
		 	TCP 
		 	신사적인 프로토콜
		 	전화 -> 상대방 -> 통신
		 	동기화 Send(보낸다) -> recv (받는다) 처리순서가 일치해야한다
		 	데이터의 경계가 없다 / Data용량의 한계까 없다
		 	1:1통신만 가능
		 	채팅, String, Object 등 보낼수있슴
		 	
		 	UDP
		 	비 연결형 프로토콜
		 	편지,지상파방송
		 	1 대 1 (UniCast)
		 	1 대 다(BrodCast)
		 	
		 	7 Layer
		 	1계층-Phsical Layer			물리계층
		 	2계층-Data Link Layer			주소(IP)를 해더에 첨부
		 	3계층-Network Layer			네트워크 IP -> address
		 	4계층-Transport Layer			네트워크 Port
		 	5계층-Session Layer			세션을 동기화
		 	6계층-Presentation Layer		보안,압축,확장
		 	7계층-Application Layer		프로그램
		 	
		 	Packet(묶음)
		 	제어정보, 데이터들이 결합된 형태로 전송이 되는 실제의 데이터
		 	IP, Port, String, Dto(Object)
		 	
		 	IP: Internet Protocol -> address IP v4 v6
		 	IPv4 : 0~255
		 	IPv6 : 0~
		 	
		 	PortNumber
		 	Ip 주소는 Internet 상에 존재하는 host(PC)를 식별할 수 있으나 최종 주체인 Process(프로그램)을 식별하지 못하기 떄문에 프로세스를 구별하기 위해서 지정된
		 	번호의 통신규약 (0~1024 : System Number 사용하면안됨) 외에 수치를 지정한다
		 	
		 	Socket -> 유닉스(FIle)
		 	send recv Write, read
		 	통신의 주체, 통신을 하기 위한 Object
		 	IP,Port,TCP/UDP
		 	
		 	통신순서 : 
		 		Server						Client
		 	1.	Socket버젼확인					1. Socket 버젼확인
		 	2.  Binding : IP,Port설정	
		 	3.  Listen 
		 	4.  Accept	<-----------------	2. Connect
		 	
		 	5.  Recv(리시브,받기),Read	<-----	3. Send(전송),Write
		 	6. 	Send	---------------->	4. Recv
		 	
		 	DNS (Domain Name System) Server
		 	IP -> String
		 	xxx.xxx.xxx.xxx-> www.naver.com
		 	 */
			
			ArrayList<Socket> list = new ArrayList<Socket>();
			Socket clientSocket = null;
			try {

			//문지기소켓				//192.168.7.91
				ServerSocket serSocket = new ServerSocket(52525);//서버의 문지기
				
				//IP,Port설정
				//Binding(적용)
				
				//listen
			
				
				//Client를 기다림
				while(true) {
					System.out.println("접속대기중...");
					clientSocket = serSocket.accept();
					//클라이언트의 정보를 가지고있는다 IP/PortNumber/접속클라이언트 정보
					//서버에 정보가 생성됨
					list.add(clientSocket);
					System.out.println("Client IP "+clientSocket.getInetAddress()+" Port : "+clientSocket.getPort());
				
					new ServerThread(clientSocket,list).start();//들어오는 만큼 돔
				}
				/*
				Goto ServerThread
				
				//Recv(받기) Server <- Client
				BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				String packetStr = reader.readLine();
				
				
				System.out.println("클라이언트로부터 패킷 : "+ packetStr);
				
				//Send
				PrintWriter pw = new PrintWriter(clientSocket.getOutputStream());
				pw.println("Fuck");
				pw.flush();
				
				clientSocket.close();
				serSocket.close();
				*/
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			
	}

}
