package OperatorClass2;

public class mainClass {

	public static void main(String[] args) {
		/*
		  	논리연산자(true/false)
		  	
		 	&& 	AND연산
		 			false(0) false(0) -> false(0)
		 			false(0) True(1)  -> false(0)
		 			True(1)  false(0) -> false(0)
		 			True(1)  True(1)  -> True(1)
		 		
		 	|| 	OR연산
		 			false(0) false(0) -> false(0)
		 			false(0) True(1)  -> True(1)
		 			True(1)  false(0) -> True(1)
		 			True(1)  True(1)  -> True(1)
		 			
		 	!	NOT연산
					결과의반대
		 			0 -> 1 , 1 -> 0
		 	제어문과 같이 사용이 많이됨
		 	제어문 (if, while, do ~while)
		 	
		 	> , < , <= , >= , == 비교연산자
		 */
		int number = 0;
		System.out.println(number>0);
		System.out.println(number==0);
		System.out.println(number>0 && number<10);
		System.out.println(number>0 || number<10);
		number = 5;
		System.out.println(number == 5  );
		System.out.println(number != 5  );
		System.out.println(!(number > 5 && number < 10));
		System.out.println(!(number<5));
		
		/*
		 	삼항연산자
		 	조건에 따라서 값을 대입
		 	value = (조건) ? '값1' : '값2';
		 */
		char c ;
		c = (number > 0 )? 'Y':'N';
		System.out.println("c = "+c);
		
		int n;
		n = (number < 5)? 10:20;
		System.out.println(n);
		
		String str;
		str = (number > 3)? "3보다 크다":"3보다 작다";
		System.out.println(str);
	}

}
