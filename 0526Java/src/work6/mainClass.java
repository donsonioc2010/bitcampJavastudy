package work6;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			입력: 모두 숫자로 되어 있는지 확인
			
				-> String 		"12345"	"123e5"	    
				모두 숫자로 되어 있으면,
				 			"숫자로 되어 있습니다"	-> 숫자로 변환
				 			"숫자로 되어 있지 않습니다"
				ASCII 사용
		*/
		// char c = '0';
		// System.out.println("c = " + c + " c = " + (int)c);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 = ");
		String str = sc.next();
		
		boolean numTrue = true;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
		//	System.out.println("c = " + c);
			
			// ASCII code
			int asccode = (int)c;
			if(asccode < 48 || asccode > 57) {	// 문자의 아스키 코스 값이 나온다
				numTrue = false;
				break;
			}			
		}
		
		if(numTrue) {
			System.out.println("숫자입니다");
		}else {
			System.out.println("문자열입니다");
		}
				
		
		/*
			입력: 정수, 실수를 판별할 코드를 작성
			 	-> String 		"123.456" "123456"
			 		실수면 실수 입니다.
			 		정수면 정수 입니다.
			 	'.'	
		*/
		
		System.out.print("숫자입력 = ");
		String strNum = sc.next();
		
		boolean floatTrue = false;
		
		for (int i = 0; i < strNum.length(); i++) {
			char c = strNum.charAt(i);
			if(c == '.') {		// ".9485"
				floatTrue = true;
				break;
			}			
		}
		
		if(floatTrue) {
			System.out.println("실수입니다");
		}else {
			System.out.println("정수입니다");
		}
		
		// 대문자로 입력 -> 소문자로 변환해서 출력 되도록...
		// toLowerCase 사용하지 말고 구현
		// ABC -> abc
		// ABCdef -> abcdef
		// A -> 65
		// a -> 97
		//	   +32
		System.out.print("문자열입력 = ");
		String _str = sc.next();
		String result = "";		// String result = new String();
		
		// 한문자씩 산출
		for (int i = 0; i < _str.length(); i++) {
			char c = _str.charAt(i);	// <=> indexOf 
			if((int)c >= 65 && (int)c <= 90) {	// 대문자인 경우
				int n = (int)c + 32;	// 대문자로 변환하는 부분
				result = result + (char)n;
			}else {								// 소문자인 경우
				result = result + c;
			}
		}
		System.out.println("원본 문자열:" + _str);
		System.out.println("변환 문자열:" + result);
		
	}

}






