package homeWork;

import java.util.Scanner;

public class gwaje16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean key= true;
		String num1 = null,num2=null;				//숫자를 문자와 대조하기 위해 문자열로 받는다.
		char mark = 0;
		System.out.print("첫번째 수를 입력하세요");		//첫번째 숫자를 입력
		while(key) {
			num1 = sc.next();		//첫번째 숫자 문자열로 받기
			for(int i = 0; i<num1.length();i++ ) {	// 문자열 검사
				char tmp = num1.charAt(i);			// 첫번째숫자의 i번째 방에 있는 단어를 tmp에 넣음
				if(!('0'<=tmp && tmp>'9')) {		// tmp에있는 단어를 숫자인지 비교
					key = false;					// 만약 숫자이면 무한루프 끝
				}else {								// 숫자가 아니면 재입력
					System.out.println("숫자를 입력해주세요");
				}
			}
		}
		key = true;
		while(key) {
			System.out.print("연산자를 입력하세요");			//사용할 연산자 입력
			mark = sc.next().charAt(0);					//연산자를 char로 받음
			if(mark == '+'||mark == '-'||mark == '*'||mark == '/') //연산자인지 비교하기
				key = false;							//연산자이면 루프 종료
			else										//연산자가 아니면 재입력해야한다
				System.out.println("잘못된 문자입니다 연산자를 다시입력하세요");
		}
		key = true;
		System.out.print("두번째 수를 입력하세요");	
		while(key) {								//두번째 숫자를 받기위한 무한루프
			num2 = sc.next();						//두번째 숫자를 입력	
			for(int i = 0; i<num2.length();i++ ) {	//문자열 비교
				char tmp = num2.charAt(i);			//tmp에 두번째 숫자의 i번째 단어(숫자)를 넣음
				if(!('0'<=tmp && tmp>'9')) {		//숫자 문자 비교
					key = false;					//숫자일시에만 값을 false로 무한루프 종료
				}else {								//문자이면재무한루프
					System.out.println("숫자를 입력해주세요");
				}
			}
		}
		
		//계산문항
		System.out.print(num1 + " " + mark + " "+ num2+" = ");
		int numb1 =  Integer.parseInt(num1),numb2 = Integer.parseInt(num2);
		//입력받은값 형변환
		switch (mark) {
			case '+':			//덧셈
				System.out.print(numb1+numb2);
				break;
			case '-':			//뺄샘
				System.out.print(numb1-numb2);
				break;
			case '*':			//곱하기
				System.out.print(numb1*numb2);
				break;
			case '/':			//나누기
				System.out.print(numb1/numb2);
				break;
		}
	}

}
