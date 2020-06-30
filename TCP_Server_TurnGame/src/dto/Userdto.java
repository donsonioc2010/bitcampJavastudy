package dto;

import java.io.Serializable;
import java.net.Socket;

public class Userdto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private	static Userdto udto = null;
	int UserNumber;
	int Play;
	String UserName;
	Socket sc;
	public Userdto() {
		// TODO Auto-generated constructor stub
	}
	/*
	public static Userdto getInstance() {
		if(udto==null) {
			udto = new Userdto();
		}
		return udto;
	}
	 */
	public int getUserNumber() {
		return UserNumber;
	}

	public void setUserNumber(int userNumber) {
		UserNumber = userNumber;
	}

	public int getPlay() {
		return Play;
	}

	public void setPlay(int play) {
		Play = play;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	@Override
	public String toString() {
		return "[UserNumber=" + UserNumber + ", Play=" + Play + ", UserName=" + UserName + "]";
	}
	public Socket getSc() {
		return sc;
	}
	public void setSc(Socket sc) {
		this.sc = sc;
	}
	
	
	
}

