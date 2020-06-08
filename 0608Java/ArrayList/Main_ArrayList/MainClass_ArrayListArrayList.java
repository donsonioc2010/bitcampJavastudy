package Main_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import dto_ArrayList.MemberDto_ArrayList;

public class MainClass_ArrayListArrayList {

	public static void main(String[] args) {
		/*
		 	Collection : 수집
		 	
		 	
		 	List : 목록
		 			데이터의 관리를 유동적으로 할수 있는 배열
		 			
		 			1. ArrayList (==Vector)
		 			배열처럼 사용할수 있는 목록
		 			선형 구조(o-o-o-o-o-o)
		 			검색 속도가 빠르다
		 			index Number로 관리가 된다 0 ~ n-1
		 				
		 			2. LinkedList(Game에서 주로 사용)
		 			빈번하게 추가, 삭제가 되는경우에 적합한구조
		 			이외에는 ArrayList와 차이점이 없다	
		 				
		 			3.Map(Collection)
		 				HashMap(필수)
		 					Key, Value로 관리가 됨
		 					Key로 접근
		 					key값의 중복을 허용하지 않는다, Key는 하나만 존재한다.
		 					
		 					Tree구조로 이루어져 있슴.
		 				TreeMap(선택)
		 					Hash맵과 동일한구조에서 Sorting이 추가되어있다.
		 */
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//==Integer arrInt[]; 할당이 필요없고 계쏙추가해주면됨
		
		//추가
			arrList.add(111);
			Integer in = new Integer(222);
			arrList.add(in);
			
			arrList.add(new Integer(333));
			
		//list size()
			int len = arrList.size();
			System.out.println("len : "+len);
			
		//데이터를 산출 get
			Integer getVal = arrList.get(0);
			System.out.println("getVal = "+getVal);
			
			//
			for(int i = 0; i<arrList.size(); i++) {
				Integer n = arrList.get(i);
				System.out.println(i+" indexNum = "+ n);
			}
			
			//리스트에 담겨져있는 value값 만큼 for문이 돔 for each
			for(Integer inte : arrList) {
				System.out.println(inte);
			}
		//원하는 위치에 추가
			Integer inum = new Integer(200);
			arrList.add(1, inum);
			//사용하는 번지수 안에서만 추가를 해라
			for(int i = 0; i<arrList.size(); i++) {
				Integer n = arrList.get(i);
				System.out.println(i+" indexNum = "+ n);
			}
		//삭제
			arrList.remove(2);
			for(int i = 0; i<arrList.size(); i++) {
				Integer n = arrList.get(i);
				System.out.println(i+" indexNum = "+ n);
			}
		//검색
			//arrList.indexOf(new Integer(333));
			int index = arrList.indexOf(333); //wrapper class여서 가능
			System.out.println(index);	//값이 없으면 -1을 리턴
			System.out.println(arrList.get(index));
			/*
			index = -1;
			for(int i = 0; i<arrList.size(); i++) {
				Integer var = arrList.get(i);
				if(var ==200) {
					index = i;
					break;
				}
			}
			*/
		//수정
			Integer updateData = new Integer(555);
			arrList.set(2, updateData);
			
			for(int i = 0; i<arrList.size(); i++) {
				Integer n = arrList.get(i);
				System.out.println(i+" indexNum = "+ n);
			}
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(000);
		a.add(111);
		a.add(111);
		a.add(111);
		int b = a.indexOf(111);
		System.out.println(a);
		
		/*	
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i<5; i++) {
			System.out.print("입력 : ");
			String str = (new Scanner(System.in).next());
			list.add(str);
		}
		
		for(int i = 0; i <list.size(); i++)
			System.out.println(list.get(i));
		*/
		ArrayList<MemberDto_ArrayList> memList = new ArrayList<>();
		//추가
			//뒤에
			MemberDto_ArrayList dto = new MemberDto_ArrayList(101,"홍길동");
			memList.add(dto);
			
			memList.add(new MemberDto_ArrayList(102,"일지매"));
			
			//원하는 위치
			memList.add(1,new MemberDto_ArrayList(111,"성춘향"));
			
		for (int i = 0; i < memList.size(); i++) {
			//MemberDto_ArrayList mem = memList.get(i); //옵젝으로 넘겨받음
			//System.out.println(i+":"+mem.toString());
			System.out.println(memList.get(i).toString());
		}	

			System.out.println(memList.toString());

			
		//삭제
		memList.remove(2);
		for (MemberDto_ArrayList mem : memList) {
			System.out.println(mem.toString());
		}
		//검색
		String findName = "성춘향";
		int findInNum = -1 ;
			//찾는 데이터가 한개일시
		for(int i =0; i<memList.size();i++) {
			MemberDto_ArrayList mem = memList.get(i);
			if(findName.equals(mem.getName())) {
				findInNum = i;
				break;
			}
		}
		System.out.println();
		System.out.println(memList.get(findInNum).toString());
		
		
			//다수의 데이터를 찾을때
			memList.add(new MemberDto_ArrayList(103,"성춘향"));
			findName = "성춘향";
			ArrayList<MemberDto_ArrayList> findList = new ArrayList<MemberDto_ArrayList>();
			for(int i = 0; i<memList.size();i++) {
				String str= memList.get(i).getName();
				
				if(findName.equals(str)) {
				//if(findName.equals(memList.get(i).getName())) {
					findList.add(memList.get(i));
				}
			}
			System.out.println("================================");
			for(int i = 0; i<findList.size();i++) {
				//MemberDto_ArrayList mem = findList.get(i);
				//System.out.println(mem.toString());
				
				System.out.println(findList.get(i).toString());
			}
		//수정
			MemberDto_ArrayList updateMem = new MemberDto_ArrayList(104,"향단");
			
			memList.set(2, updateMem);
			for (MemberDto_ArrayList mem : memList) {
				System.out.println(mem.toString());
			}
	}

}