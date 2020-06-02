package homeWork;

import java.util.Scanner;

public class homeWork02 {

	public static void main(String[] args) {
		/*
		 	입력 : 모두 숫자로 되어있는지 확인하는 코드
		 		-> String 	"문자열로 입력을 받기" , "12345","123e5"
		 		모두 숫자로 되어있으면 
		 			"숫자로 되어있습니다" 		-> 숫자로 변환
				아니면
					"숫자로 되어 있지 않습니다."
				
				
				HINT => ASCII사용
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		String inNum1 = sc.next();
		
		int answer= 0;	//문자인지 숫자인지 구분하는 변수
		for(int i = 0; i<inNum1.length(); i++) {
			char point = inNum1.charAt(i);	//문자열의 한문자씩 가져오기
			byte num = (byte)point;	//문자->ascii확인을 위한 숫자화
			if(num>=48 &&num<=57) {	//ascii로 바꿔서 숫자일시에만 
				answer = 1;
			}	
		}
		if(answer == 1) {	//정수일경우에 실행하고 숫자가 아니면 밑에값 (answer을 boolean설정해도됨)
			int j = Integer.parseInt(inNum1);
			System.out.println("숫자로 되어있습니다");
			System.out.println("입력받은 숫자는"+j +"입니다");
		}else {//숫자가아닌경우
			System.out.println("숫자로 되어있지 않습니다");
		}
		
		/*
		 	입력 : 정수인지 실수인지 판별할 코드를 작성	(숫자로 가정할시)
		 		->String	"123.456", "123456"
		 		실수면 실수입니다 정수면 정수입니다.
		 		
		 		'.'
		 */
		System.out.println();
		inNum1 = "";
		System.out.println("숫자를 입력해주세요 : ");
		inNum1 = sc.next();		//문자입력받기
		answer = 0;		//answer값 초기화
		for(int i = 0; i<inNum1.length();i++) {	
			char point = inNum1.charAt(i);	//입력받은 문자열 한문자씩 분해
			byte num = (byte)point;			//분해한 문자를 정수로 변환
			if(num == 46) {					//입력받은 숫자에 소수점이있는경우
				answer = 1;
				break;
			}else if(num>=48 &&num<=57){	//숫자만있는경우
				answer = 2;
			}else {							//문자가 포함된경우
				break;						//answer = 0(문자포함),1(소수/실수),2(자연수,정수)
			}
		}
		if(answer==1) {						//맞는 answer값에 맞게 표현
			double j = Double.parseDouble(inNum1);
			System.out.println("실수입니다. 입력받은 숫자는 : "+j+ " 입니다.");
		}
		else if(answer==2) {
			int j = Integer.parseInt(inNum1);
			System.out.println("정수입니다. 입력받은 숫자는 : "+j +" 입니다.");
		}
		else
			System.out.println("문자는빼주세요");
		
		// 대문자로 입력 -> 소문자로 변환해서 출력되도록....
		// toLowerCase 사용하지말고 구현
	}

}
