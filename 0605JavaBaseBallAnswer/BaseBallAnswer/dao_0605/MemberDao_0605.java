package dao_0605;

import java.util.Scanner;

import File_0605.FileProc_0605;
import dto_0605.Batter_0605;
import dto_0605.Human_0605;
import dto_0605.Pitcher_0605;

// Data Access Object	= model == back end
public class MemberDao_0605 {
	
	Scanner sc = new Scanner(System.in);
	
	// 배열
	//private Pitcher pitcher[];
	//private Batter batter[];
	private Human_0605 human[]=new Human_0605[20];;
	
	private int memberNumber;
	private int memberCount;
	private Human_0605 ha[];
	FileProc_0605 fp;
	public void copy() {
		
	}
	
	public MemberDao_0605() {
		fp = new FileProc_0605("baseball");
		fp.createFile();
		//human = new Human[20];	// 변수 20개 생성

		// human = new Human();	// 객체 생성
		
		memberNumber = 1000;
		memberCount = 0;
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
		
		Human_0605 h = null;	
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
			
			h = new Pitcher_0605(memberNumber, name, age, height, win, lose, defence);
			
		}		
		// 타자  2000 ~ 
		else if(pos == 2) {
			
			Batter_0605 bat = new Batter_0605();
			
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
		
		human[memberCount] = h;
		
		memberNumber++;
		memberCount++;		
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
		if(human[findIndex] instanceof Pitcher_0605) {
			Pitcher_0605 p = (Pitcher_0605)human[findIndex];
			p.setNumber(0);
			p.setName("");
			p.setAge(0);
			p.setHeight(0.0);
			p.setWin(0);
			p.setLose(0);
			p.setDefence(0.0);
		}
		else if(human[findIndex] instanceof Batter_0605) {
			Batter_0605 b = (Batter_0605)human[findIndex];
			b.allClean();
		}		
	}	
		
	public void select() {		
		System.out.print("검색하고 싶은 선수명 = ");
		String name = sc.next();
		
		int findIndex = search(name);
		if(findIndex == -1) {
			System.out.println("선수 명단에 없습니다.");
		}
		else {
			System.out.println("번호:" + human[findIndex].getNumber());
			System.out.println("이름:" + human[findIndex].getName());
			System.out.println("나이:" + human[findIndex].getAge());
			System.out.println("신장:" + human[findIndex].getHeight());
			
			if(human[findIndex] instanceof Pitcher_0605) {
				System.out.println("승리:" + ((Pitcher_0605)human[findIndex]).getWin() );
				System.out.println("패전:" + ((Pitcher_0605)human[findIndex]).getLose() );
				System.out.println("방어율:" + ((Pitcher_0605)human[findIndex]).getDefence() );
			}
			else if(human[findIndex] instanceof Batter_0605) {
				System.out.println("타수:" + ((Batter_0605)human[findIndex]).getBatcount() );
				System.out.println("안타수:" + ((Batter_0605)human[findIndex]).getHit() );
				System.out.println("타율:" + ((Batter_0605)human[findIndex]).getHitAvg() );
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
		
		if(human[findIndex] instanceof Pitcher_0605) {
			System.out.print("승 = ");
			int win = sc.nextInt();
			
			System.out.print("패 = ");
			int lose = sc.nextInt();
			
			System.out.print("방어율 = ");
			double defence = sc.nextDouble();
			
			Pitcher_0605 pit = (Pitcher_0605)human[findIndex];
			pit.setWin(win);
			pit.setLose(lose);
			pit.setDefence(defence);			
		}
		else if(human[findIndex] instanceof Batter_0605) {
			System.out.print("타수 = ");
			int batcount = sc.nextInt();
			
			System.out.print("안타수 = ");
			int hit = sc.nextInt();
			
			System.out.print("타율 = ");
			double hitAvg = sc.nextDouble();
			
			Batter_0605 bat = (Batter_0605)human[findIndex];
			bat.setBatcount(batcount);
			bat.setHit(hit);
			bat.setHitAvg(hitAvg);			
		}		
	}
	
	public void allprint() {	
		
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null && !human[i].getName().equals("")) {
				System.out.println(human[i].toString());				
			}
		}		
	}	
	
	public int search(String name) {
		int index = -1;
		
		for (int i = 0; i < human.length; i++) {
			if(human[i] != null) {
				if(name.equals(human[i].getName())) {
					index = i;
					break;
				}
			}
		}
		return index;
	}
	public void saveData() {
		int len=0;
		for(int i = 0; i<human.length; i++) {
			if(human[i] != null)
				len++;
		}
		String datas[] = new String[len];
		
		for(int i = 0; i<datas.length;i++) {
			datas[i] = human[i].toString();
		}
		fp.saveData(datas);
	}
	public void loadData() {
		String datas[] = fp.loadData();
		/*
		 	datas : pitcher , Batter 
		 			객체 생성
		 			값을 저장
		 */
		for(int i =0; i<datas.length; i++) {
			String data[]  = datas[i].split("-");
			int title = Integer.parseInt(data[0]);
			
			if(title<2000) {
				human[i] = new Pitcher_0605(Integer.parseInt(data[0]),
										data[1],
										Integer.parseInt(data[2]),
										Double.parseDouble(data[3]),
										Integer.parseInt(data[4]),
										Integer.parseInt(data[5]),
										Double.parseDouble(data[6]));
			}else {
				human[i] = new Batter_0605(Integer.parseInt(data[0]),
										data[1],
										Integer.parseInt(data[2]),
										Double.parseDouble(data[3]),
										Integer.parseInt(data[4]),
										Integer.parseInt(data[5]),
										Double.parseDouble(data[6]));
			}
		}
		
	}
	//타율 순위를 출력하도록 1~n
	public void batterHitRanking() {
		//타자만을 위해 수집한 배열
		int batterCount = 0;
		for(int i = 0 ;i<human.length; i++) {
			if(human[i] instanceof Batter_0605) {
				batterCount ++;
			}
		}
		Human_0605 batSorting[] = new Human_0605[batterCount];
		
		int w = 0;
		
		for(int i = 0; i<human.length; i++) {
			if(human[i] instanceof Batter_0605) {
				batSorting[w] = human[i];
				w++;
			}
		}
		for(int i = 0; i<batSorting.length-1; i++) {
			for(int j = i+1; j<batSorting.length;j++) {
				if(((Batter_0605)batSorting[i]).getHitAvg()>((Batter_0605)batSorting[j]).getHitAvg()) {
					swap(batSorting,i,j);
				}
			}	
		}
		for(int i = 0 ; i<batSorting.length;i++) {
			printSorting(batSorting[i]);
		}
	}
	//방어율 순위 출력
	public void pitcherDefenseRanking() {
		int pitCount = 0;
		for(int i = 0; i<human.length; i++)
			if(human[i] instanceof Pitcher_0605) 
				pitCount ++;
		Human_0605 pitSorting[] = new Human_0605[pitCount];
		int w= 0;
		for(int i = 0; i<human.length;i++){
			if(human[i] instanceof Pitcher_0605) {
				pitSorting[w] = human[i];
				w++;
			}
		}
		for(int i = 0; i<pitSorting.length; i++) {
			for(int j = i+1; j<pitSorting.length;j++) {
				double num1 = ((Pitcher_0605)pitSorting[i]).getDefence();
				double num2 = ((Pitcher_0605)pitSorting[j]).getDefence();
				if(num1<num2) {
					swap(pitSorting,i,j);
					Human_0605 temp = pitSorting[i];
					pitSorting[i] = pitSorting[j];
					 pitSorting[j] = temp;
				}
			}	
		}
		for(int i = 0 ; i<pitSorting.length;i++) {
			System.out.println(((Pitcher_0605)pitSorting[i]).toString());
		}
		
	}
	
	
	public void printSorting(Human_0605 h) {
		if(h instanceof Batter_0605) {
			System.out.println(((Batter_0605)h).toString());
		}else if(h instanceof Pitcher_0605) {
			System.out.println(((Pitcher_0605)h).toString());
		}
	}
	
	public void swap(Human_0605[] h,int i,int j) {
		Human_0605 temp = h[i];
		h[i] = h[j];
		h[j] = temp;
		
	}
}








