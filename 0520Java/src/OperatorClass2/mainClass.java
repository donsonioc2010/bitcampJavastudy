package OperatorClass2;

public class mainClass {

	public static void main(String[] args) {
		/*
		  	��������(true/false)
		  	
		 	&& 	AND����
		 			false(0) false(0) -> false(0)
		 			false(0) True(1)  -> false(0)
		 			True(1)  false(0) -> false(0)
		 			True(1)  True(1)  -> True(1)
		 		
		 	|| 	OR����
		 			false(0) false(0) -> false(0)
		 			false(0) True(1)  -> True(1)
		 			True(1)  false(0) -> True(1)
		 			True(1)  True(1)  -> True(1)
		 			
		 	!	NOT����
					����ǹݴ�
		 			0 -> 1 , 1 -> 0
		 	����� ���� ����� ���̵�
		 	��� (if, while, do ~while)
		 	
		 	> , < , <= , >= , == �񱳿�����
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
		 	���׿�����
		 	���ǿ� ���� ���� ����
		 	value = (����) ? '��1' : '��2';
		 */
		char c ;
		c = (number > 0 )? 'Y':'N';
		System.out.println("c = "+c);
		
		int n;
		n = (number < 5)? 10:20;
		System.out.println(n);
		
		String str;
		str = (number > 3)? "3���� ũ��":"3���� �۴�";
		System.out.println(str);
	}

}
