package forClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	loop ��, ��ȯ��
		 	������ Ƚ����ŭ �ݺ��� �ϴ� ���
				for
				while
				do while
				
				for(�ʱ�ȭ;����;�����)
					ó��
				for(�ʱ�ȭ(1);����(4)(7);�����(3)(6))
					ó��(2)(5)
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
		System.out.println("2���� �� ��" + sum);
		
		sum = 0;
		int num2 =2;
		for(int i = 0; i<10; i++) {
			sum  +=num2;
			num2 = num2 + 2;
		}System.out.println("2���� ���� "+sum);
		
		
		for(int i = 0;i<10; i++){
			System.out.print("i= "+i+" j= ");
			for(int j = 0; j<5; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		

	}

}
