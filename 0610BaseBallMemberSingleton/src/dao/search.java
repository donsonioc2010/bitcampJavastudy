package dao;

import Singleton.Singleton;

public class search {
	int index;
	public search(String name) {
		index = -1;
		Singleton single = Singleton.getInstance();
		for(int i =0; i<single.h.size();i++) {
			if(name.equals(single.h.get(i).getName())) {
				index = i;
				break;
			}
		}
	}
	
}
