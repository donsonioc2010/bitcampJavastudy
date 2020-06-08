package dao_0605;

import java.util.ArrayList;
import java.util.Scanner;

import File_0605.FileProc_0608;
import dto_0605.Batter_0608;
import dto_0605.Human_0608;
import dto_0605.Pitcher_0608;

// Data Access Object	= model == back end
public class MemberDao_0608 {
	
	Scanner sc = new Scanner(System.in);
	
	// 배열
	//private Pitcher pitcher[];
	//private Batter batter[];
//	private Human_0605 human[]=new Human_0605[20];;
	//ArrayList 
	//Generic == Human
	
	private ArrayList<Human_0608> HumanList = new ArrayList<Human_0608>();
	private int memberNumber= 1000;
//	private int memberCount;
	private Human_0608 ha[];
	FileProc_0608 fp;
	public void copy() {
		
	}
	
	public MemberDao_0608() {
		fp = new FileProc_0608("baseball");
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
		
		Human_0608 h = null;	
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
			
			h = new Pitcher_0608(memberNumber, name, age, height, win, lose, defence);
			
		}		
		// 타자  2000 ~ 
		else if(pos == 2) {
			
			Batter_0608 bat = new Batter_0608();
			
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
			
			h = bat;
		}		
		
		HumanList.add(h);
		
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
		if(HumanList.get(findIndex) instanceof Pitcher_0608) {
			HumanList.remove(findIndex);
		}
		else if(HumanList.get(findIndex) instanceof Batter_0608) {
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
			
			if(HumanList.get(findIndex) instanceof Pitcher_0608) {
				System.out.println("승리:" + ((Pitcher_0608)HumanList.get(findIndex)).getWin() );
				System.out.println("패전:" + ((Pitcher_0608)HumanList.get(findIndex)).getLose() );
				System.out.println("방어율:" + ((Pitcher_0608)HumanList.get(findIndex)).getDefence() );
			}
			else if(HumanList.get(findIndex) instanceof Batter_0608) {
				System.out.println("타수:" + ((Batter_0608)HumanList.get(findIndex)).getBatcount() );
				System.out.println("안타수:" + ((Batter_0608)HumanList.get(findIndex)).getHit() );
				System.out.println("타율:" + ((Batter_0608)HumanList.get(findIndex)).getHitAvg() );
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
		
		if(HumanList.get(findIndex) instanceof Pitcher_0608) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			Pitcher_0608 pit = (Pitcher_0608)HumanList.get(findIndex);
			pit.setWin(win);
			pit.setLose(lose);
			pit.setDefence(defence);			
		}
		else if(HumanList.get(findIndex) instanceof Batter_0608) {
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			Batter_0608 bat = (Batter_0608)HumanList.get(findIndex);
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
		
		for (int i = 0; i < HumanList.size(); i++) {
			if(name.equals(HumanList.get(i).getName())) {
				index = i;
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
				HumanList.add(new Pitcher_0608(Integer.parseInt(data[0]),
										data[1],
										Integer.parseInt(data[2]),
										Double.parseDouble(data[3]),
										Integer.parseInt(data[4]),
										Integer.parseInt(data[5]),
										Double.parseDouble(data[6])));
			}else {
				HumanList.add(new Batter_0608(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),
										Integer.parseInt(data[5]),
										Double.parseDouble(data[6])));
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
		ArrayList<Human_0608> batSorting = new ArrayList<Human_0608>();
		for(int i = 0 ;i<HumanList.size(); i++) {
			if(HumanList.get(i) instanceof Batter_0608) {
				batSorting.add(HumanList.get(i));
			}
		}
		

		for(int i = 0; i<batSorting.size()-1; i++) {
			for(int j = i+1; j<batSorting.size();j++) {
				double num1 = ((Batter_0608)batSorting.get(i)).getHitAvg();
				double num2 = ((Batter_0608)batSorting.get(j)).getHitAvg();
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
		ArrayList<Human_0608> pitSorting  = new ArrayList<Human_0608>();
		for(int i = 0; i<HumanList.size(); i++)
			if(HumanList.get(i) instanceof Pitcher_0608) 
				pitSorting.add(HumanList.get(i));
	
		for(int i = 0; i<pitSorting.size()-1; i++) {
			for(int j = i+1; j<pitSorting.size();j++) {
				double num1 = ((Pitcher_0608)pitSorting.get(i)).getDefence();
				double num2 = ((Pitcher_0608)pitSorting.get(j)).getDefence();
				if(num1<num2) {
					swap(pitSorting,i,j);
				}
			}	
		}
		for(int i = 0 ; i<pitSorting.size();i++) {
			System.out.println(((Pitcher_0608)pitSorting.get(i)).toString());
		}
		
	}

	public void printSorting(ArrayList<Human_0608> h, int i) {
		if(h.get(i) instanceof Batter_0608) {
			System.out.println(((Batter_0608)h.get(i)).toString());
		}else if(h.get(i) instanceof Pitcher_0608) {
			System.out.println(((Pitcher_0608)h.get(i)).toString());
		}
	}
	
	public void swap(ArrayList<Human_0608> h,int i,int j) {
		Human_0608 temp = h.get(i);
		h.set(i, h.get(j));
		h.set(j, temp);
		
	}
}