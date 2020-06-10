package dao;

import Singleton.Singleton;

public class DeleteClass {
	public DeleteClass() {
		Singleton single = Singleton.getInstance();
		String name = new getName().name;
		int index = new search(name).index;
		
		if(index==-1) {
			System.out.println("선수 명단에 없습니다. 삭제할 수 없습니다");
			return;
		}else {
			single.h.remove(index);
		}
	}
}
