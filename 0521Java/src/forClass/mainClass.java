package forClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	loop 문, 순환문
		 	지정한 횟수만큼 반복을 하는 제어문
				for
				while
				do while
				
				for(초기화;조건;연산식)
					처리
				for(초기화(1);조건(4)(7);연산식(3)(6))
					처리(2)(5)
		 */
		/*
		int i ;
		System.out.print("i= ");
		for(i = 0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("loop out i = "+i);
		
		int j , num = 0 ; 
		System.out.print("num= ");
		for(j = 1; j<= 10; j++) {
			num +=j;
			System.out.print(num+" ");
		}
		System.out.println();
		*/
		
		for(int i = 0; i<10; i = i+2) {
			System.out.println(i);
		}
		
		int n ;
		for(n = 0; n<10; n++)
			System.out.println(n);
		
		System.out.print("i= ");
		for(int i = 10; i>0;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int count = 0;
		System.out.print("count= ");
		for(; count<10;count++ ) {
			System.out.print(count);
			count++;
		}
		for(int i = 0,j=0; i<10; i++,j++) 
			System.out.println("i= "+i + " j= "+j);
		
		int sum=0;
		for(int i = 2; i<=20; i+=2) 
			sum += i;
		System.out.println("2단의 총 합" + sum);
		
		sum = 0;
		int num2 =2;
		for(int i = 0; i<10; i++) {
			sum  +=num2;
			num2 = num2 + 2;
		}System.out.println("2단의 총합 "+sum);
		
		
		for(int i = 0;i<10; i++){
			System.out.print("i= "+i+" j= ");
			for(int j = 0; j<5; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		

	}

}
