package WrapperClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Wrapper Class
		 	일반 자료형(int, char) 를 클래스화 한것
		 	collection : list, map 등등에선 일반자료형을 쓸수가 없다
		 	
		 	일반자료형			class
		 	boolean			Boolean
		 	
		 	byte			Byte
		 	short			Short
		 	integer			Integer (O)----------
		 	long			Long
		 	
		 	float			Float
		 	double			Double (O)------------
		 	
		 	char 			Charactor
		 	char[]			String(******)--------------
		 */
		// 숫자 ->  문자열
		// valueOf 아래방법에의해 잘사용하진 않음
		// 숫자 + "",123.456 + ""
		
		//문자열 -> 숫자
		String strNum ="234";
		int cnum = Integer.parseInt(strNum);
		
		System.out.println("cnum ="+(cnum+1));
		
		String dstrNum = "123.456";
		double dnum = Double.parseDouble(dstrNum);
		
		System.out.println("dnum = "+(dnum+1.1));
		
		
		// toString(); -> 문자열로 변경해준다. -> valueOf()
		Double dou = 235.789;
		Double dou1 = new Double("345.678");
		//위와 아래는 동일한 문법이다.
		//Wrapper Class만 위에처럼 사용이 가능하다
		
		//10진수->2진수
		int n10 = 12;
		String n2 = Integer.toBinaryString(n10);
		
		System.out.println(n2);
		
		//2진수-> 10진수
		n2 = "11001010";
		n10 = Integer.parseInt(n2,2); 	//문자열,표기진수
		System.out.println(n10);
		
		//10진수 -> 16진수
		int n10_2 = 217;
		String n16 = Integer.toHexString(n10_2);
		System.out.println("10->16 : "+n16);
		
		//16진수->10진수
		String n16_2 = "ff";
		int n10_3 = Integer.parseInt(n16_2, 16);
		System.out.println("16->10 : " + n10_3 );
	}

}
