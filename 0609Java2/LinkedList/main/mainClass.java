package main;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class mainClass {

	public static void main(String[] args) {
		/*
		ArrayList == Vector
				검색에 매우 유용
		LinkedList 
				실시간 추가,삭제의 처리가 빠르다
				
		*/
		/*
		java.util.List<String> elist = new ArrayList<String>();
		List<String> alist = new LinkedList<String>();
		*/
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("aaa");
		alist.add("ccc");
		alist.add("bbb");
		
		LinkedList<String> blist = new LinkedList<String>(alist);
		//데이터의 복수
		alist.add("eee");
		for (String str : blist) {
			System.out.println(str);
		}
		if(blist.isEmpty()) {
			//리스트에 데이터가 아얘 존재하지 않을시
			// ==(list.size()==0) 일경우
		}
		//ArrayList에는 없는것
		//맨 앞에 element를 추가
		blist.addFirst("ggg");
		//맨 뒤에 element를 추가
		blist.addLast("hhh");
		for (String str : blist) {
			System.out.println(str);
		}
		
		//iterator : 반복자 == Pointer(포인터 주소로 이동)
		Iterator<String> it;
		it = blist.iterator();
		while(it.hasNext()) {
			//그 다음이 있는지 없는지 Boolean 으로 자료반환받음
			String value = it.next();
			System.out.println("it:"+value);
		}
		Integer k = 5;
		System.out.println(k);

	}

}
