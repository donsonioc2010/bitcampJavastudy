package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import File.FileProc;
import dto.Batter;
import dto.Human;
import dto.Pitcher;

// Data Access Object	= model == back end
public class MemberDao {
	
	Scanner sc = new Scanner(System.in);
	
	//private ArrayList<Human> HumanList = new ArrayList<Human>();
	HashMap<Integer, Human> HumanList = new HashMap<Integer, Human>();
	//Human 대신 Object도 가능
	private int memberNumber= 1000;
	private int memberNumCopy;
	private Human ha[];
	FileProc fp;
	
	public void copy() {
		
	}
	
	public MemberDao() {
		fp = new FileProc("baseball");
		fp.createFile();
		//human = new Human[20];	// 변수 20개 생성

		// human = new Human();	// 객체 생성
	}	
	public void insert() {	
		// 투수/타자 ?
		System.out.print("투수(1)/타자(2) = ");
		int pos = sc.nextInt();
		
		// human
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("나이 = ");
		int age = sc.nextInt();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		Human h = null;	
		// 투수	1000 ~ 
		if(pos == 1) {
			// win
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			// lose
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			// defense
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			h = new Pitcher(memberNumber, name, age, height, win, lose, defence);
			memberNumCopy = memberNumber;
		}		
		// 타자  2000 ~ 
		else if(pos == 2) {
			
			Batter bat = new Batter();
			
			// 선수 등록 번호
			bat.setNumber(memberNumber + 1000);
			bat.setName(name);
			bat.setAge(age);
			bat.setHeight(height);			
						
			// 타수
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			bat.setBatcount(batcount);
						
			// 안타수
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			bat.setHit(hit);
			
			// 타율
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			bat.setHitAvg(hitAvg);
			memberNumCopy = memberNumber+1000;
			h = bat;
		}		
		
		HumanList.put(memberNumCopy,h);
		
		memberNumber++;		
	}	
	
	public void delete() {
		
		System.out.print("삭제하고 싶은 선수명 입력 = ");
		String name = sc.next();
		
		if(name.equals("")) {
			System.out.println("이름을 정확히 입력해 주십시오.");
			return;		// continue
		}
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다. 삭제할 수 없습니다");
			return;
		}
		
		// 삭제
		if(HumanList.get(findIndex) instanceof Pitcher) {
			HumanList.remove(findIndex);
		}
		else if(HumanList.get(findIndex) instanceof Batter) {
			HumanList.remove(findIndex)
;		}		
	}	
		
	public void select() {		
		System.out.print("검색하고 싶은 선수명 = ");
		String name = sc.next();
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
		}
		else {
			System.out.println("번호:" + HumanList.get(findIndex).getNumber());
			System.out.println("이름:" + HumanList.get(findIndex).getName());
			System.out.println("나이:" + HumanList.get(findIndex).getAge());
			System.out.println("신장:" + HumanList.get(findIndex).getHeight());
			
			if(HumanList.get(findIndex) instanceof Pitcher) {
				System.out.println("승리:" + ((Pitcher)HumanList.get(findIndex)).getWin() );
				System.out.println("패전:" + ((Pitcher)HumanList.get(findIndex)).getLose() );
				System.out.println("방어율:" + ((Pitcher)HumanList.get(findIndex)).getDefence() );
			}
			else if(HumanList.get(findIndex) instanceof Batter) {
				System.out.println("타수:" + ((Batter)HumanList.get(findIndex)).getBatcount() );
				System.out.println("안타수:" + ((Batter)HumanList.get(findIndex)).getHit() );
				System.out.println("타율:" + ((Batter)HumanList.get(findIndex)).getHitAvg() );
			}
		}		
	}	
	
	public void update() {		
		System.out.print("수정하고 싶은 선수명 = ");
		String name = sc.next();
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
			return;
		}
		
		if(HumanList.get(findIndex) instanceof Pitcher) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			Pitcher pit = (Pitcher)HumanList.get(findIndex);
			pit.setWin(win);
			pit.setLose(lose);
			pit.setDefence(defence);			
		}
		else if(HumanList.get(findIndex) instanceof Batter) {
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			Batter bat = (Batter)HumanList.get(findIndex);
			bat.setBatcount(batcount);
			bat.setHit(hit);
			bat.setHitAvg(hitAvg);			
		}		
	}
	
	public void allprint() {	
		
		for (int i = 0; i < HumanList.size(); i++) {
			System.out.println(HumanList.get(i).toString());				

		}		
	}	
	
	public int search(String name) {
		int index = -1;
		
		Iterator<Integer> sit = HumanList.keySet().iterator();
		while(sit.hasNext()) {
			int key = sit.next();
			if(name.equals(HumanList.get(key).getName())) {
				index = key;
				break;
			}
		}

		return index;
	}
	public void saveData() {
		int len=HumanList.size();
		
		ArrayList<String> datas = new ArrayList();
		
		for(int i = 0; i<HumanList.size();i++) {
			datas.add(HumanList.get(i).toString());
		}
		fp.saveData(datas);
	}
	public void loadData() {
		ArrayList<String> datas = fp.loadData();
		/*
		 	datas : pitcher , Batter 
		 			객체 생성
		 			값을 저장
		 */
		for(int i =0; i<datas.size(); i++) {
			String data[]  = datas.get(i).split("-");
			int title = Integer.parseInt(data[0]);
			
			if(title<2000) {
				HumanList.put(Integer.parseInt(data[0]),(new Pitcher(Integer.parseInt(data[0]),
										data[1],
										Integer.parseInt(data[2]),
										Double.parseDouble(data[3]),
										Integer.parseInt(data[4]),
										Integer.parseInt(data[5]),
										Double.parseDouble(data[6]))));
			}else {
				HumanList.put(Integer.parseInt(data[0]),(new Batter(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),
										Integer.parseInt(data[5]),
										Double.parseDouble(data[6]))));
			}
		}
		int x = HumanList.size()-1;
		if(HumanList.get(x).getNumber() <2000) {
			memberNumber = HumanList.get(x).getNumber()+1;
		}else if(HumanList.get(x).getNumber()>2000){
			memberNumber = (HumanList.get(x).getNumber())-999;
		}else {
			memberNumber = 1000;
		}
	}
	//타율 순위를 출력하도록 1~n
	public void batterHitRanking() {
		//타자만을 위해 수집한 배열
		ArrayList<Human> batSorting = new ArrayList<Human>();
		for(int i = 0 ;i<HumanList.size(); i++) {
			if(HumanList.get(i) instanceof Batter) {
				batSorting.add(HumanList.get(i));
			}
		}
		

		for(int i = 0; i<batSorting.size()-1; i++) {
			for(int j = i+1; j<batSorting.size();j++) {
				double num1 = ((Batter)batSorting.get(i)).getHitAvg();
				double num2 = ((Batter)batSorting.get(j)).getHitAvg();
				if(num1<num2) {
					swap(batSorting,i,j);
				}
			}	
		}
		for(int i = 0 ; i<batSorting.size();i++) {
			printSorting(batSorting,i);
		}
	}
	//방어율 순위 출력
	public void pitcherDefenseRanking() {
		ArrayList<Human> pitSorting  = new ArrayList<Human>();
		for(int i = 0; i<HumanList.size(); i++)
			if(HumanList.get(i) instanceof Pitcher) 
				pitSorting.add(HumanList.get(i));
	
		for(int i = 0; i<pitSorting.size()-1; i++) {
			for(int j = i+1; j<pitSorting.size();j++) {
				double num1 = ((Pitcher)pitSorting.get(i)).getDefence();
				double num2 = ((Pitcher)pitSorting.get(j)).getDefence();
				if(num1<num2) {
					swap(pitSorting,i,j);
				}
			}	
		}
		for(int i = 0 ; i<pitSorting.size();i++) {
			System.out.println(((Pitcher)pitSorting.get(i)).toString());
		}
		
	}

	public void printSorting(ArrayList<Human> h, int i) {
		if(h.get(i) instanceof Batter) {
			System.out.println(((Batter)h.get(i)).toString());
		}else if(h.get(i) instanceof Pitcher) {
			System.out.println(((Pitcher)h.get(i)).toString());
		}
	}
	
	public void swap(ArrayList<Human> h,int i,int j) {
		Human temp = h.get(i);
		h.set(i, h.get(j));
		h.set(j, temp);
		
	}
}
