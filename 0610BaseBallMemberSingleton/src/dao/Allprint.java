package dao;

import Singleton.Singleton;
import dto.*;

public class Allprint {
	
	public Allprint() {

		Singleton single = Singleton.getInstance();
		for(int i = 0 ;i<single.h.size();i++) {
			if(single.h.get(i) instanceof Pitcher) 
				System.out.println(((Pitcher)single.h.get(i)).toString());
			else
				System.out.println(((Batter)single.h.get(i)).toString());
		}
	}
}
