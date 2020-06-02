package WrapperClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Wrapper Class
		 	�Ϲ� �ڷ���(int, char) �� Ŭ����ȭ �Ѱ�
		 	collection : list, map ���� �Ϲ��ڷ����� ������ ����
		 	
		 	�Ϲ��ڷ���			class
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
		// ���� ->  ���ڿ�
		// valueOf �Ʒ���������� �߻������ ����
		// ���� + "",123.456 + ""
		
		//���ڿ� -> ����
		String strNum ="234";
		int cnum = Integer.parseInt(strNum);
		
		System.out.println("cnum ="+(cnum+1));
		
		String dstrNum = "123.456";
		double dnum = Double.parseDouble(dstrNum);
		
		System.out.println("dnum = "+(dnum+1.1));
		
		
		// toString(); -> ���ڿ��� �������ش�. -> valueOf()
		Double dou = 235.789;
		Double dou1 = new Double("345.678");
		//���� �Ʒ��� ������ �����̴�.
		//Wrapper Class�� ����ó�� ����� �����ϴ�
		
		//10����->2����
		int n10 = 12;
		String n2 = Integer.toBinaryString(n10);
		
		System.out.println(n2);
		
		//2����-> 10����
		n2 = "11001010";
		n10 = Integer.parseInt(n2,2); 	//���ڿ�,ǥ������
		System.out.println(n10);
		
		//10���� -> 16����
		int n10_2 = 217;
		String n16 = Integer.toHexString(n10_2);
		System.out.println("10->16 : "+n16);
		
		//16����->10����
		String n16_2 = "ff";
		int n10_3 = Integer.parseInt(n16_2, 16);
		System.out.println("16->10 : " + n10_3 );
	}

}
