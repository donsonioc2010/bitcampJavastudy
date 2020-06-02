package fuction;

public class fuction_1 {

	public static void main(String[] args) {
		/*
			function : 함수, 독립적인 프로세스
			method : 함수, class에 포함되어 있는 함수
		
					C언어 : function
					Java : class
			목적 : 코드의 간략화.
				   동일한(같은 처리) 코드를 집약적으로 설정.		
			
			가독성 : 이해하기 쉽게 작성하는 성질	 
			
			형식					 인수, 인자, 매개변수, parameter
			return 값(자료형) 함수명(자료형 가상인수, ...){
				
				처리
				
				return 값;	<- 없을 수도 있음				
			}
			 	
			return 값(자료형) : char int double int[] String void(return값이 없음)
			
			int funcName(char c, double d){			
				처리			
				return 값; <- 정수(int)
			}			 	
		*/

		function();
		
		function1( 12 );
		
		function2("My World", 123.456);
		
		function2("You World", 123);
		
		int returnValue = function3(333.4444);	// value에 의한 할당
		System.out.println("main() returnValue = " + returnValue);
		
		int asc = getASCIIcode('A');
		System.out.println("asc = " + asc);
		System.out.println( getASCIIcode('a') );
		
		
		int num = function4();
		System.out.println("num = " + num);		
		
		// random 함수
		int r = (int)(Math.random() * 10);		
		String str = "hello";
		
		int len = str.length();		
		
		String aaa = "ABCdef";
		String result = aaa.toUpperCase();
		
		
		int arrNum[] = { 1, 2, 3, 4, 5 }; 
		arrProcess( arrNum );	// address에 의한 할당
		
	}
	
	static void function( ) {		
		System.out.println("function() 호출");		
	}
	
	static void function1(int n) {
		System.out.println("function1(int n) 호출");
		System.out.println("매개변수를 통한 가인수 n = " + n);
	}
	
	static void function2(String str, double d) {
		System.out.println("function2(String str, double d) 호출");
		System.out.println("str = " + str);
		System.out.println("d = " + d);
	}
	
	static int function3(double d) {
		System.out.println("function3(double d) 호출");
		System.out.println("d = " + d);
		
		return (int)d;		
	}
	
	static int function4( ) {
		System.out.println("function4() 호출");		
		return 12;
	}
	
	static int getASCIIcode(char c) {
		return (int)c;
	}
	
	static void arrProcess(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}		
	}
}












