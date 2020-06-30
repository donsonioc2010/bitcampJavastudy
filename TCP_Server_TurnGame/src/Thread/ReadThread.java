package Thread;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import dto.Userdto;

public class ReadThread extends Thread{
	Socket clientSocket;
	List<Userdto> list;
	
	public ReadThread(Socket clientSocket,List<Userdto> list) {
		this.clientSocket = clientSocket;
		this.list = list;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		try {
			while(true) {
				ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
				
				for(int i = 0; i<list.size();i++) {
					Userdto a = list.get(i);
					if(a.getSc()==clientSocket) {
						//요청자를 찾았을떄
						if(a.getPlay()==1) {
							//플레이어턴이 1일경우
							//전체한테 뿌린다
							for(int j = 0; j<list.size();j++) {
								
							}
						}
					}
					
					
					/*
					if(list.get(i).getSc()==clientSocket) {
						//본인에게만 보낸다 만약 1일떄면 모든숫자를 다 1씩 땡기고
						if(list.get(i).getPlay()==1) {
							oos.writeObject(list.get(i));
							oos.flush();
							for(int j = 0; i<list.size();j++) {
								if(i != j)
								list.get(j).setPlay(list.get(j).getPlay()-1);
							}
							list.get(i).setPlay(list.size());
						}
						else {
							oos.writeObject(list.get(i));
							oos.flush();
						}
					}*/
				}
				Thread.sleep(500);
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
