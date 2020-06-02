package stringClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	String : wrapper class 다른사람이 만들어놓은 클래스
		 			문자열저장, 편집, 정보취득
		 */
		
		String str;
		//class명 : String
		// str : Object(객체), instance(주체) == class의 변수
		
		str = "안녕하세요";
		System.out.println("str = "+str);
		
		//첫번쨰 사용법
		String str1 = new String("하이");
		//두번째 사용법
		String str2 = "반갑습니다";
		
		//문자열을 결합
		String str3;
		
		str3 = str1 + str2;
		System.out.println(str3);
		
		String str4;
		str4 = str1.concat(str2);
		System.out.println(str4);
		
		//비교 함수 equals
		String str5 = "hello";
		String str6 = "hell";
		
		str6 = str6 + "o";
		if(str5 == str6) {
			System.out.println("str5와 str6는 같은 문자열 입니다");
		}else {
			System.out.println("str5와 str6는 다른 문자열 입니다");
		}
		
		if(str5.equals(str6)) {
			System.out.println("str5와 str6는 같은 문자열 입니다");
		}else {
			System.out.println("str5와 str6는 다른 문자열 입니다");
		}
		
		boolean b = str5.equals(str6);
		if(b==true) {
			System.out.println("str5와 str6는 같은 문자열 입니다");
		}else {
			System.out.println("str5와 str6는 다른 문자열 입니다");
		}
		
		//indexOf : 지정문자의 위치
		//lastIndexOf
		char cArr[]= {'a','b','c'};
		
		String str7 = "abcdefghabcd";
		int n;
		n = str7.indexOf("d");
		System.out.println("indexOf = " + n);
		n = str7.lastIndexOf("d");
		System.out.println("lastIndexOf = "+n);
		
		//길이 length-> len
		int Array[] = {1,2,3,4,5};
		System.out.println("배열의 길이 : "+ Array.length);
		
		str7 = "I can do it";
		int len = str7.length();
		System.out.println("문자열 길이 : "+len);
		
		//replace(수정)
		String str8 = "A*B**C";
		String repStr = str8.replace("*", "");
		System.out.println(repStr);
		repStr = str8.replace("*", "+");
		System.out.println(repStr);
		
		//split 중요하대...
		/*
		 	split : token을 활용하여 문자열을 자른다.
		 	aaa-bbb-ccc      - : 토큰
		 	
		 	저장매체 : 파일, database(oracle)
		 	
		 	홍길동
		 	24
		 	2001/10/12
		 	180 =>
		 	홍길동-24-2001/10/12-180 =>이런식으로 표기를 함. 토큰은 다른걸로 사용해도 가능함
		 */
		String str9 = "홍길동-24-2001/10/12-180.2";
		String splitArr[] = str9.split("-");
		for(int i = 0; i<splitArr.length; i++)
			System.out.println(splitArr[i]);
		
		// 범위를 통해서 문자열을 취득 subString
		String str10 = "abcdefghij";
		String subStr = str10.substring(4, 7); //4번지부터 7번지 전까지
		System.out.println(subStr);
		subStr = str10.substring(4); //4번지부터 끝까지
		System.out.println(subStr);
		
		//toUpperCase  모든 문자를 대문자로 변경
		//toLowerCase  모든 문자를 소문자로 변경
		String str11 = "abcDEF";
		String upStr = str11.toUpperCase();
		System.out.println(upStr);
		String loStr = str11.toLowerCase();
		System.out.println(loStr);
		
		//trim 문자를 입력받을시 맨앞과 맨뒤의 공백을 제거해주는 함수
		String str12 = "                 김치           C언어   JAVA PYTHON            ";
		String trStr = str12.trim();
		System.out.println(str12);
		System.out.println(trStr);
		
		//valueOf
		/*
		 	문자열 -> 숫자		"123" -> 123
		 	숫자 -> 문자		123 -> "123"
		 */
		int num = 123;
		long lo = 1212L;
		double d = 123.457;
		String is = String.valueOf(num);
		String ls = String.valueOf(lo);
		String ds = String.valueOf(d);
		
		System.out.println(is + " " + ls + " " + ds);		
		
		int number = 234;
		String numStr = number+"";
		
		//contains 탐색
		String str13 = "강릉시 강남구";
		boolean b1 = str13.contains("서울");
		System.out.println(b1);
		
		// charAt		
		// String str = "hello" ; == charArray[5];
		String str14 = "가나다라마";
		for(int i = 0; i<str14.length();i++) {
			char ch = str14.charAt(i);
			System.out.println(i+"번지 " + ch );
		}
	}
}
