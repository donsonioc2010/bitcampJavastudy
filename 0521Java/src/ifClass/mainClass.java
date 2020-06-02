package ifClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	제어문
		 		-조건문
		 			if
		 				if
		 				else
		 				else if
		 				
		 				아래의 연산자들과 같이 자주 사용됨
		 				※논리연산자 : &&(AND),||(OR),!(NOT)와 같이 사용함
		 				※ 범위 : > 큼, < 작음 , >= 이상 , <= 이하 , == 같음 , != 같지않음
		 				
		 					형식 : 
		 						조건(조건성립 공식(true/false)){
		 							처리
		 						}
		 						ex) if(number>0){
		 							처리
		 						}
		 						if(number > 0 && number <= 10 && number != 5){
		 							처리
		 						}
		 						if(number < 5 || number > 10){
		 							처리
		 						}
		 						
		 						if(조건1){ 조건1 == true
		 							처리1
		 						}else{	    조건2 == false
		 							처리2
		 						}
		 						
		 						조건 분기 n개만큼의 조건
		 						if(조건1){
		 							처리1
		 						}else if(조건2){
		 							처리2
		 						}else if(조건3){
		 							처리3
		 						}else{ 조건1,2,3 false
		 							처리
		 						}
		 						
		 			switch
		 				case
		 				break
		 		-순환문
		 		-제어절

		 */
		int number = 6;
		
		if(number>5) 
			System.out.println("number는 5보다 크다");
		
		if(number >= 6)
			System.out.println("number는 6이상이다");
		
		if(number == 6)
			System.out.println("number는 6이다");

		if(number != 5)
			System.out.println("number는 5가 아니다");
		
		if(number >= 0 && number < 10)
			System.out.println("number는 0부터 9 사이의 숫자이다");
		if(number < 5 || number >10)
			System.out.println("number는 6부터 9사이의 숫자이다");
	
		if(number>10)
			System.out.println("number는 10보다 크다");
		else
			System.out.println("number는 10 이하이다");
		
		
		String str;
		str = (number>10)? "number는 10보다 크다":"number는 10보다 작거나 같다";
		System.out.println(str);
	
		System.out.println((number>10)? "number는 10보다 크다":"number는 10보다 작거나 같다");
		
		
		//조건분기
		
		number = 81;
		if(number ==100)	System.out.println("100점입니다");
		else if(number >= 90 && number<100) System.out.println("90점  이상입니다");
		else if(number >= 80 && number<90) System.out.println("80점 이상입니다");
		else System.out.println("80점 미만입니다");
		
		if(number ==100)	System.out.println("100점입니다");
		else if(number >= 90 ) System.out.println("90점  이상입니다");
		else if(number >= 80 ) System.out.println("80점 이상입니다");
		else System.out.println("80점 미만입니다");
		
		// 조건문 안에 조건문
		if(number >=80 && number < 90)
			if(number>=85) System.out.println("야탄목걸이 탕탕");
			else System.out.println("불합격 탕탕");
		
		boolean b;
		b = false;
		if(b==false) System.out.println("b == false 입니다");
		if(!b) System.out.println("b == false 입니다");
		
		if(b)System.out.println("b == true 입니다");
	}	

}
