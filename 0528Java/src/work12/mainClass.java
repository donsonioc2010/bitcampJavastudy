package work12;

public class mainClass {

	public static void main(String[] args) {
		//���� ����Ȯ��
		String str = "123";
		boolean b = isNumber(str);
		System.out.println(str+" �� �����Դϱ�?"+b);
		
		str = "1234o";
		b = isNumber(str);
		System.out.println(str+" �� �����Դϱ�?"+b);
		 
	}
	/*
	static boolean isNumber(String num) {
		boolean b = true;
		
		for(int i = 0; i<num.length(); i++) {
			char c = num.charAt(i);
			int n = (int)c;
			if(n<48||n>57) {
				b = false;
				break;
			}
		}
		return b;	
	}
	*/
	static boolean isNumber(String num) {
		//boolean b = true;
		
		for(int i = 0; i<num.length(); i++) {
			char c = num.charAt(i);
			int n = (int)c;
			if(n<48||n>57) {
				return false;
			}
		}
		//return b;
		return true; 
	}


}
