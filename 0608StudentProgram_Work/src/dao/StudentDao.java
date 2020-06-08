package dao;

import java.util.ArrayList;
import java.util.Scanner;
import File.StudentFile;
import dto.StudentDto;

public class StudentDao {
	ArrayList<StudentDto> Student = new ArrayList<StudentDto>();
	Scanner sc= new Scanner(System.in);
	StudentFile fp = new StudentFile();
	
	public void insert() {
		System.out.println("추가할 학생의 정보를 입력하세요.");
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.print("영어:");
		int eng = sc.nextInt();
		
		System.out.print("수학:");
		int math = sc.nextInt();
		
		Student.add(new StudentDto(name, age, eng, math));
		Student.get(Student.size()-1).setAvg();
		System.out.println("입력완료 : "+Student.get(Student.size()-1).getName());
		
	}
	public void loadData() {
		ArrayList<String> datas = (new StudentFile()).loadData();
		for(int i = 0; i<datas.size();i++) {
			String str[] = datas.get(i).split("-");
			int age = Integer.parseInt(str[1]);
			int eng = Integer.parseInt(str[2]);
			int math = Integer.parseInt(str[3]);
			double avg = Double.parseDouble(str[4]);
			Student.add(new StudentDto(str[0], age, eng, math, avg));
		}
	}
	public void delete() {
		String name = inputName();
			
		boolean result = true;
		for(int i = 0; i < Student.size();i++) {
			if(Student.get(i).getName().equals(name)) {
				Student.remove(i);
				System.out.println("학생의 정보가 모두 삭제되었습니다.");
				result = false;
				break;
			}
		}
		if(result)
			System.out.println("찾는 학생의 정보가 없습니다");
	}

	public void search() {
		String name = inputName();
		
		for(int i = 0; i<Student.size();i++) {
			if(Student.get(i).getName().equals(name)) {
				printInfo(i);
			}
		}
	}

	public void update() {
		String name = inputName();
		boolean KEY = true;
		for(int i = 0; i<Student.size();i++) {
			if(Student.get(i).getName().equals(name)) {
				System.out.println("수정할 점수를 입력해주세요");
				System.out.print("영어:");
				Student.get(i).setEng(sc.nextInt());
				
				System.out.print("수학:");
				Student.get(i).setMath(sc.nextInt());
				
				Student.get(i).setAvg();
				System.out.println("데이터가 수정되었습니다");
				KEY = false;
			}
		}
		if(KEY)
			System.out.println("데이터를 찾을 수 없습니다");		
	}
	
	public void allPrint() {
		for (int i = 0; i<Student.size(); i++) {
			System.out.println(Student.get(i).toString());
		}
	}
	
	public void chapSum() {
		int Select = selectSub();
		int sum = WantSum(Select);
		
		if(Select == 1)	System.out.print("영어의 합계는 ");
		else			System.out.print("수학의 합계는 ");
			
		System.out.println(sum + "점입니다");		
	}
	
	public void chapAvg() {
		int Select = selectSub();
		int sum = WantSum(Select);
		double avg  =  (double)sum / Student.size();
		
		if(Select == 1)	System.out.print("영어의 합계는 ");
		else			System.out.print("수학의 합계는 ");
			
		System.out.println(avg + "점입니다");	
	}
	
	public void sorting() {
		ArrayList<StudentDto> SortingCopy = new ArrayList<StudentDto>();
		for(int i = 0 ; i<Student.size();i++) {
			SortingCopy.add(Student.get(i));
		}
		int SelectNum;
		System.out.println("무엇을 기준으로 정렬하시겠습니까?");
		while(true) {
			System.out.print("평균(1)/영어(2)/수학(3)>>");
			SelectNum = sc.nextInt();
			if(SelectNum>=1 && SelectNum<=3)
				break;
			else {
				System.out.println("정상범위를 입력하세요");
			}
		}
		if(SelectNum ==1) {
			for(int i =0; i<SortingCopy.size()-1;i++) {
				for(int j = i+1;j<SortingCopy.size();j++) {
					if(SortingCopy.get(i).getAvg()<SortingCopy.get(j).getAvg()) {
						SortingCopy = swap(SortingCopy, i, j);
					}
				}
			}
		}else if(SelectNum==2) {
			for(int i =0; i<SortingCopy.size()-1;i++) {
				for(int j = i+1;j<SortingCopy.size();j++) {
					if(SortingCopy.get(i).getEng()<SortingCopy.get(j).getEng()) {
						SortingCopy = swap(SortingCopy, i, j);
					}
				}
			}
		}else if(SelectNum==3) {
			for(int i =0; i<SortingCopy.size()-1;i++) {
				for(int j = i+1;j<SortingCopy.size();j++) {
					if(SortingCopy.get(i).getMath()<SortingCopy.get(j).getMath()) {
						SortingCopy =swap(SortingCopy, i, j);
					}
				}
			}
		}
		for(int i = 0; i<SortingCopy.size();i++) {
			System.out.println(SortingCopy.get(i).toString());
		}
		
	}
	
	public void dataSave() {
		fp.saveData(Student);
	}
	
	public ArrayList<StudentDto> swap(ArrayList<StudentDto> swap,int i,int j) {
		StudentDto temp = swap.get(i);
		swap.set(i, swap.get(j));
		swap.set(j, temp);
		return swap;
	}
	public int WantSum(int Select) {
		int sum= 0;
		for(int i = 0; i<Student.size(); i++) {
			if(Select == 1) {	//영어
				sum = sum+ Student.get(i).getEng();
			}else if(Select == 2){	//수학
				sum = sum+ Student.get(i).getMath();
			}
		}
		return sum;
	}
	public int selectSub() {
		int n=0;;
		while(true) {
			System.out.print("합계를 구할 과목을 선택,  영어(1), 수학(2) = ");
			n = sc.nextInt();
			if(n==1||n==2) {
				break;
			}else {
				System.out.println("정상적으로 입력하십시오 ");
			}
		}
		return n;
	}
	
	public String inputName() {
		System.out.print("원하는 작업의 학생이름을 입력하세요 >>");
		String name = sc.next();
		return name;
	}
	public void printInfo(int i) {
		System.out.println(Student.get(i).toString());
	}
}
