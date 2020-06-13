package dao;

import java.util.ArrayList;

import File.FileProc;
import dto.Batter;
import dto.*;

public class BaseBallDao {
	private static BaseBallDao dao = null;
	
	public ArrayList<Human> HumanList = new ArrayList<Human>();
	private int memberNumber= 1000;
	FileProc fp;
	//전체출력은 frame 에서 구현
	//SaveFile Frame에서 구현
	
	private BaseBallDao() {
		fp = new FileProc("baseball");
		fp.createFile();
	}
	public void insert(int pos,String name, int age, double height,int a,int b,double c) {
		Human h = null;
		if(pos ==1) {//투수
			h = new Pitcher(memberNumber, name, age, height, a,b,c);
		}else if(pos==2) { //타자
			h = new Batter(memberNumber, name, age, height, a,b,c);
		}
		HumanList.add(h);
		memberNumber ++;
	}
	
	public String delete(String name) {
		String str="";
		//비정상입력
		if(name.equals("")) {
			str = "이름이 정상적으로 입력되지 않았습니다";
			return str;
		}
		//정상입력
		int index = search(name);
		if(index == -1) {
			str = "선수 명단에 없습니다. 삭제가 불가능합니다";
			return str;
		}
		
		//이름이 존재할때
		if(HumanList.get(index) instanceof Pitcher) 
			HumanList.remove(index);
		else if(HumanList.get(index) instanceof Batter)
			HumanList.remove(index);

		str = name+"선수의 정보가 정상적으로 삭제되었습니다";
		return str;
		
	}
	public String select(String name) {
		String str = null;
		//비정상입력
		if(name.equals("")) {
			str = "이름이 정상적으로 입력되지 않았습니다";
			return str;
		}
		//정상입력
		int index = search(name);
		if(index == -1) {
			str = "선수 명단에 없습니다. 삭제가 불가능합니다";
			return str;
		}
		
		//찾았을때
		
		if(HumanList.get(index) instanceof Pitcher) 
			str = ((Pitcher)HumanList.get(index)).toString();
		else if(HumanList.get(index) instanceof Batter) 
			str = ((Batter)HumanList.get(index)).toString();
		return str;
	}
	public int search(String name) {
		int index = -1;
		for(int i = 0; i<HumanList.size();i++) {
			if(name.equals(HumanList.get(i).getName())){
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public static BaseBallDao getInstance() {
		if(dao==null) {
			dao = new BaseBallDao();
		}
		return dao;
	}
	
	
}
