package CastClass;

public class mainClass {

	public static void main(String[] args) {
		/* 
		  	��ȯ(�ڷ���)
		  		�ڷ����� ������
		  			boolean	1byte
		  			
		  			byte	1byte
		  			short	2byte
		  			int		4byte
		  			long	8byte
		  			
		  			float	4byte	
		  			double	8byte	
		  			
		  		(�ڵ� ����ȯ,���� �ڷ���(cast) ��ȯ) 
		  		�Ҽ��� ����ȯ�� �켱������ �������.
		 */
		
		short sh = 10;
		int num;
		
		num = sh;	//�ڵ��� ��ȯ
		System.out.println("num="+num);
		
		num = 20;
		sh = (short) num;  //����(cast) ����ȯ
		System.out.println("sh="+sh);
		
		num = 128;
		byte by = (byte)num;
		System.out.println("byte="+by);
		
		float f1;	//��Ȯ�� �Ҽ��������� Ȯ���Ҷ� ���� ���ȴ�
		f1 = (float)3/2;
		System.out.println("f1="+f1);
		
		//�켱���� �׽�Ʈ
		long lo=1212121212121212121L;
		float fl;
		fl = lo;
		System.out.println("fl="+fl);
		
		double d;
		d = lo;
		System.out.println("d="+d);
		
		//fl=1.21212127E18 E = ���ϱ�  ���Ǽ��ڴ� 10�� => *10�� 18��   E3->10��3��
		//					E-2 = *(1/10)*(1/10)
		double value = 123.4567;
		int n;
		n = (int)value;
		System.out.println("n="+n);
	}

}
