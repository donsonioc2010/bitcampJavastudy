package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
	/*
	 	HashMap : 사전
	 				"사과":""apple"
	 	저장되는방식	key		value =>1pair =>web에서 json이 키를 쓰는방식
	 				
	 				List : 선형구조
	 				Map : 2진 Tree 구조
	 				
	 		TreeMap = HashMap + Sorting(Key 값을 가지고 Sorting)(ASC//DASC둘다가능)
	 		
	 */
	public static void main(String[] args) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		//Map<Integer, String> map = new HashMap<Integer,String>();
		//TreeMap<Integer,String> tmap = new TreeMap<Integer,String>(map);
		
		//추가 		키값은 중복되지 않는다 순서는(key,value)
		hmap.put(111,"백십일");			
		hmap.put(222,"이백이십이");
		hmap.put(333,"삼백삼십삼");
		
			//getValue
			String str = hmap.get(111);
			System.out.println(str);
			
		//삭제
		/*
		String remstr = hmap.remove(222);
		System.out.println(remstr);
		
		str = hmap.get(222);
		System.out.println(str);
		*/
		//검색
			//검색시 True/false만 확인
			boolean b = hmap.containsKey(222);
			System.out.println(b);
			
			//value를 취득해서  서치하는 방법
			if(hmap.containsKey(333)) {
				str = hmap.get(333);
				System.out.println(str);
			}
		
		//수정
		hmap.put(111, "100+10+1");
		System.out.println(hmap.get(111));
		
		hmap.replace(222, "200+22");
		System.out.println(hmap.get(222));
		
		//모두출력 != 0~n-1 그냥 소유중인 모든 데이터 출력
			//순서대로 출력되는게 아니다. 데이터가 순서대로 저장되어 있지 않는다.
		//key 값을 모두 취득을 해야함 =>이때 사용되는게 Iterator
		Iterator<Integer> it = hmap.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			
			System.out.println(key+" : "+hmap.get(key));
		}
		
		HashMap<String, String> haMap = new HashMap<String, String>();
		haMap.put("apple", "사과");
		haMap.put("pear", "배");
		haMap.put("banana", "바나나");
		haMap.put("orange", "오레엔지");
		haMap.put("grape", "포도");
		
		//취득
		str = haMap.get("grape");
		//전체출력
		Iterator<String> sit = haMap.keySet().iterator();
		while(sit.hasNext()) {
			String key = sit.next();
			System.out.println("key:"+key+"  value:"+haMap.get(key));
		}
		
		
		//Sorting
			//TreeMap <-->HashMap 두개가 서로 호환이 된다 ArrayList와 LinkedList처럼
			TreeMap<String, String> treeMap = new TreeMap<String,String>(haMap);
			//haMap의 데이터가 전부 이동됨 맵을 복사시엔 두개를 같은 자료형으로 맞춰줘야함
			//숫자소팅은 당연히 가능함
				//오름차순
				System.out.println();
				//Iterator<String> itKey = treeMap.keySet().iterator();  //오름차순정렬
				
				//내림차순
				Iterator<String> itKey = treeMap.descendingKeySet().iterator();	//내림차순정렬
					
				while(itKey.hasNext()) {
					String key = itKey.next();
					System.out.println("key:"+key+"  value:"+treeMap.get(key));
				}
				
				
				System.out.println("=======================================");
				HashMap<Integer, MyData> dMap = new HashMap<Integer, MyData>();
				//추가
				dMap.put(1, new MyData(3,"1번 눕"));
				dMap.put(2, new MyData(2,"2번 눕"));
				dMap.put(3, new MyData(1,"3번 눕"));
				
				//삭제
				str = dMap.remove(3).toString();
				System.out.println(str);
				//검색
				if(dMap.containsKey(2)) {
					str = dMap.get(2).toString();
					System.out.println(str);
				}
				//수정
				dMap.replace(1,new MyData(5,"5번눕"));
				System.out.println("=======================================");
				//출력
				Iterator<Integer> dMapit = dMap.keySet().iterator();
				while(dMapit.hasNext()) {
					int intkey = dMapit.next();
					System.out.println(dMap.get(intkey).toString());
				}
	}
}
