package bitClass;

public class mainClass {

	public static void main(String[] args) {
		/*	Bit Operator
			고급연산 처리속도가 빠르다
			
			bit : 0 , 1
			
			&  	AND
			|	OR
			^	XOR
			<<	left Shift
			>>	Right Shift
			~	반전
		*/
		
		//AND
		int result;
		result = 0xac & 0xF0;
		System.out.println("result = "+result);
		System.out.printf("0x%x\n", result);
		
		//OR
		result = 0x48 | 0xB4;
		System.out.println("result = "+result);
		System.out.printf("0x%x\n", result);
		
		//Xor ^
		result = 0xC4 ^ 0x78;
		System.out.println("result = "+result);
		System.out.printf("0x%x\n", result);
		
		//반전(~)==NOT  0 -> 1 1 ->0
		byte by = ~0x55; // 0101 0101 => 1010 1010
		System.out.printf("0x%x\n", by);
		
		/*left shift(*2)
		 		0000 0001 ->1
		 		0000 0010 ->2
		 		0000 0100 ->4
		 		0000 1000 ->8
		 		right shift 는 반대의 개념
		 */
		byte by1;
		by1 = 0x1 <<1;
		System.out.println(by1);
		by1 <<= 1;
		System.out.println(by1);
		by1 <<= 1;
		System.out.println(by1);
		//right shift(/2)
		by1>>=1;
		System.out.println(by1);
	}

}
