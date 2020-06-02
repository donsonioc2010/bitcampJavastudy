package stringClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	String : wrapper class �ٸ������ �������� Ŭ����
		 			���ڿ�����, ����, �������
		 */
		
		String str;
		//class�� : String
		// str : Object(��ü), instance(��ü) == class�� ����
		
		str = "�ȳ��ϼ���";
		System.out.println("str = "+str);
		
		//ù���� ����
		String str1 = new String("����");
		//�ι�° ����
		String str2 = "�ݰ����ϴ�";
		
		//���ڿ��� ����
		String str3;
		
		str3 = str1 + str2;
		System.out.println(str3);
		
		String str4;
		str4 = str1.concat(str2);
		System.out.println(str4);
		
		//�� �Լ� equals
		String str5 = "hello";
		String str6 = "hell";
		
		str6 = str6 + "o";
		if(str5 == str6) {
			System.out.println("str5�� str6�� ���� ���ڿ� �Դϴ�");
		}else {
			System.out.println("str5�� str6�� �ٸ� ���ڿ� �Դϴ�");
		}
		
		if(str5.equals(str6)) {
			System.out.println("str5�� str6�� ���� ���ڿ� �Դϴ�");
		}else {
			System.out.println("str5�� str6�� �ٸ� ���ڿ� �Դϴ�");
		}
		
		boolean b = str5.equals(str6);
		if(b==true) {
			System.out.println("str5�� str6�� ���� ���ڿ� �Դϴ�");
		}else {
			System.out.println("str5�� str6�� �ٸ� ���ڿ� �Դϴ�");
		}
		
		//indexOf : ���������� ��ġ
		//lastIndexOf
		char cArr[]= {'a','b','c'};
		
		String str7 = "abcdefghabcd";
		int n;
		n = str7.indexOf("d");
		System.out.println("indexOf = " + n);
		n = str7.lastIndexOf("d");
		System.out.println("lastIndexOf = "+n);
		
		//���� length-> len
		int Array[] = {1,2,3,4,5};
		System.out.println("�迭�� ���� : "+ Array.length);
		
		str7 = "I can do it";
		int len = str7.length();
		System.out.println("���ڿ� ���� : "+len);
		
		//replace(����)
		String str8 = "A*B**C";
		String repStr = str8.replace("*", "");
		System.out.println(repStr);
		repStr = str8.replace("*", "+");
		System.out.println(repStr);
		
		//split �߿��ϴ�...
		/*
		 	split : token�� Ȱ���Ͽ� ���ڿ��� �ڸ���.
		 	aaa-bbb-ccc      - : ��ū
		 	
		 	�����ü : ����, database(oracle)
		 	
		 	ȫ�浿
		 	24
		 	2001/10/12
		 	180 =>
		 	ȫ�浿-24-2001/10/12-180 =>�̷������� ǥ�⸦ ��. ��ū�� �ٸ��ɷ� ����ص� ������
		 */
		String str9 = "ȫ�浿-24-2001/10/12-180.2";
		String splitArr[] = str9.split("-");
		for(int i = 0; i<splitArr.length; i++)
			System.out.println(splitArr[i]);
		
		// ������ ���ؼ� ���ڿ��� ��� subString
		String str10 = "abcdefghij";
		String subStr = str10.substring(4, 7); //4�������� 7���� ������
		System.out.println(subStr);
		subStr = str10.substring(4); //4�������� ������
		System.out.println(subStr);
		
		//toUpperCase  ��� ���ڸ� �빮�ڷ� ����
		//toLowerCase  ��� ���ڸ� �ҹ��ڷ� ����
		String str11 = "abcDEF";
		String upStr = str11.toUpperCase();
		System.out.println(upStr);
		String loStr = str11.toLowerCase();
		System.out.println(loStr);
		
		//trim ���ڸ� �Է¹����� �Ǿհ� �ǵ��� ������ �������ִ� �Լ�
		String str12 = "                 ��ġ           C���   JAVA PYTHON            ";
		String trStr = str12.trim();
		System.out.println(str12);
		System.out.println(trStr);
		
		//valueOf
		/*
		 	���ڿ� -> ����		"123" -> 123
		 	���� -> ����		123 -> "123"
		 */
		int num = 123;
		long lo = 1212L;
		double d = 123.457;
		String is = String.valueOf(num);
		String ls = String.valueOf(lo);
		String ds = String.valueOf(d);
		
		System.out.println(is + " " + ls + " " + ds);		
		
		int number = 234;
		String numStr = number+"";
		
		//contains Ž��
		String str13 = "������ ������";
		boolean b1 = str13.contains("����");
		System.out.println(b1);
		
		// charAt		
		// String str = "hello" ; == charArray[5];
		String str14 = "�����ٶ�";
		for(int i = 0; i<str14.length();i++) {
			char ch = str14.charAt(i);
			System.out.println(i+"���� " + ch );
		}
	}
}
