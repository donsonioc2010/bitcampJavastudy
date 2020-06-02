package CastClass;

public class mainClass {

	public static void main(String[] args) {
		/* 
		  	변환(자료형)
		  		자료형의 종류들
		  			boolean	1byte
		  			
		  			byte	1byte
		  			short	2byte
		  			int		4byte
		  			long	8byte
		  			
		  			float	4byte	
		  			double	8byte	
		  			
		  		(자동 형변환,강제 자료형(cast) 변환) 
		  		소수가 형변환의 우선순위가 가장높다.
		 */
		
		short sh = 10;
		int num;
		
		num = sh;	//자동형 변환
		System.out.println("num="+num);
		
		num = 20;
		sh = (short) num;  //강제(cast) 형변환
		System.out.println("sh="+sh);
		
		num = 128;
		byte by = (byte)num;
		System.out.println("byte="+by);
		
		float f1;	//정확한 소수점값등을 확인할때 자주 사용된다
		f1 = (float)3/2;
		System.out.println("f1="+f1);
		
		//우선순위 테스트
		long lo=1212121212121212121L;
		float fl;
		fl = lo;
		System.out.println("fl="+fl);
		
		double d;
		d = lo;
		System.out.println("d="+d);
		
		//fl=1.21212127E18 E = 곱하기  뒤의숫자는 10승 => *10의 18승   E3->10의3승
		//					E-2 = *(1/10)*(1/10)
		double value = 123.4567;
		int n;
		n = (int)value;
		System.out.println("n="+n);
	}

}
