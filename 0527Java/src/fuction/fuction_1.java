package fuction;

public class fuction_1 {

	public static void main(String[] args) {
		/*
			function : �Լ�, �������� ���μ���
			method : �Լ�, class�� ���ԵǾ� �ִ� �Լ�
		
					C��� : function
					Java : class
			���� : �ڵ��� ����ȭ.
				   ������(���� ó��) �ڵ带 ���������� ����.		
			
			������ : �����ϱ� ���� �ۼ��ϴ� ����	 
			
			����					 �μ�, ����, �Ű�����, parameter
			return ��(�ڷ���) �Լ���(�ڷ��� �����μ�, ...){
				
				ó��
				
				return ��;	<- ���� ���� ����				
			}
			 	
			return ��(�ڷ���) : char int double int[] String void(return���� ����)
			
			int funcName(char c, double d){			
				ó��			
				return ��; <- ����(int)
			}			 	
		*/

		function();
		
		function1( 12 );
		
		function2("My World", 123.456);
		
		function2("You World", 123);
		
		int returnValue = function3(333.4444);	// value�� ���� �Ҵ�
		System.out.println("main() returnValue = " + returnValue);
		
		int asc = getASCIIcode('A');
		System.out.println("asc = " + asc);
		System.out.println( getASCIIcode('a') );
		
		
		int num = function4();
		System.out.println("num = " + num);		
		
		// random �Լ�
		int r = (int)(Math.random() * 10);		
		String str = "hello";
		
		int len = str.length();		
		
		String aaa = "ABCdef";
		String result = aaa.toUpperCase();
		
		
		int arrNum[] = { 1, 2, 3, 4, 5 }; 
		arrProcess( arrNum );	// address�� ���� �Ҵ�
		
	}
	
	static void function( ) {		
		System.out.println("function() ȣ��");		
	}
	
	static void function1(int n) {
		System.out.println("function1(int n) ȣ��");
		System.out.println("�Ű������� ���� ���μ� n = " + n);
	}
	
	static void function2(String str, double d) {
		System.out.println("function2(String str, double d) ȣ��");
		System.out.println("str = " + str);
		System.out.println("d = " + d);
	}
	
	static int function3(double d) {
		System.out.println("function3(double d) ȣ��");
		System.out.println("d = " + d);
		
		return (int)d;		
	}
	
	static int function4( ) {
		System.out.println("function4() ȣ��");		
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












