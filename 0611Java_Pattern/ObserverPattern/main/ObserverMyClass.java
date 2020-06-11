package main;

import java.util.Observable;

public class ObserverMyClass extends Observable{//==Human
	
	private String preArg = null;
	private String id;
	private String pw;

	//일반 메소드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override //source-override-notify~
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		
		String str = (String)arg;
		//변화가 없었을때 ->감시안함
		if(str.equals(preArg)) return;
		
		//변화가 있는 경우
		preArg = str;
		
		//Process
		
		this.setChanged(); //reset
		super.notifyObservers(arg);
		
		clearChanged();
	}


	
	
	
	
}
