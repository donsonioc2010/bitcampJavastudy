package Singleton;

import java.util.ArrayList;

import dto.Human;

public class Singleton {
	private static Singleton sc = null;
	public ArrayList<Human> h = new ArrayList<Human>();
	public int memNum=1000;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(sc==null) {
			sc = new Singleton();
		}
		return sc;
	}
	
}
