package work6;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			�Է�: ��� ���ڷ� �Ǿ� �ִ��� Ȯ��
			
				-> String 		"12345"	"123e5"	    
				��� ���ڷ� �Ǿ� ������,
				 			"���ڷ� �Ǿ� �ֽ��ϴ�"	-> ���ڷ� ��ȯ
				 			"���ڷ� �Ǿ� ���� �ʽ��ϴ�"
				ASCII ���
		*/
		// char c = '0';
		// System.out.println("c = " + c + " c = " + (int)c);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� = ");
		String str = sc.next();
		
		boolean numTrue = true;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
		//	System.out.println("c = " + c);
			
			// ASCII code
			int asccode = (int)c;
			if(asccode < 48 || asccode > 57) {	// ������ �ƽ�Ű �ڽ� ���� ���´�
				numTrue = false;
				break;
			}			
		}
		
		if(numTrue) {
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("���ڿ��Դϴ�");
		}
				
		
		/*
			�Է�: ����, �Ǽ��� �Ǻ��� �ڵ带 �ۼ�
			 	-> String 		"123.456" "123456"
			 		�Ǽ��� �Ǽ� �Դϴ�.
			 		������ ���� �Դϴ�.
			 	'.'	
		*/
		
		System.out.print("�����Է� = ");
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
			System.out.println("�Ǽ��Դϴ�");
		}else {
			System.out.println("�����Դϴ�");
		}
		
		// �빮�ڷ� �Է� -> �ҹ��ڷ� ��ȯ�ؼ� ��� �ǵ���...
		// toLowerCase ������� ���� ����
		// ABC -> abc
		// ABCdef -> abcdef
		// A -> 65
		// a -> 97
		//	   +32
		System.out.print("���ڿ��Է� = ");
		String _str = sc.next();
		String result = "";		// String result = new String();
		
		// �ѹ��ھ� ����
		for (int i = 0; i < _str.length(); i++) {
			char c = _str.charAt(i);	// <=> indexOf 
			if((int)c >= 65 && (int)c <= 90) {	// �빮���� ���
				int n = (int)c + 32;	// �빮�ڷ� ��ȯ�ϴ� �κ�
				result = result + (char)n;
			}else {								// �ҹ����� ���
				result = result + c;
			}
		}
		System.out.println("���� ���ڿ�:" + _str);
		System.out.println("��ȯ ���ڿ�:" + result);
		
	}

}






