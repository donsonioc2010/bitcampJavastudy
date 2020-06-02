package work9;

public class mainClass {

	public static void main(String[] args) {
		
		/*
			함수 : 두 수를 나눈 몫, 나머지를 구하는 함수 
					num1, num2
					value(몫), tag(나머지)
		*/
		int num1, num2;
		int value, tag[];		
		tag = new int[1];
		num1 = 10;
		num2 = 3;
		
		value = div(num1, num2, tag);
		System.out.println("몫 = " + value + " 나머지 = " + tag[0]);
		
		
		/*
			toUpperCase 
				문자열 -> 대문자로 변경되서 return					
		*/
		String str = "abcDEF";
		String rStr = toUpperCase(str);
		System.out.println("rStr = " + rStr);
		
	}
	
	static int div(int n1, int n2, int t[]) {
		int v;
		v = n1 / n2;
		t[0] = n1 % n2;
		
		return v;
	}
	
	static String toUpperCase(String str) {
		String rStr = "";
		
		// ASCII code	A = 65 a = 97
		for (int i = 0; i < str.length(); i++) {
			int asc = (int)str.charAt(i);
			if(asc > 90) {
				asc = asc - 32;
				rStr = rStr + (char)asc;
			}else {
				rStr = rStr + (char)asc;
			}			
		}
		return rStr;
	}
	
	

}




