package fuction;

public class fuction_2 {

	public static void main(String[] args) {
		// value에 의한 할당
		// address에 의한 할당
		
		int num1, num2, num3;
		num1 = 1;
		num2 = 2;
		num3 = 3;
		func1(num1, num2, num3);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);		
		
		
		
		
		int arrNum[] = { 1, 2, 3 };
		func2( arrNum );
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println("arrNum[" + i + "] = " + arrNum[i]);
		}
		
		// int arr1[] = arrNum;
		
		int arr1[] = func3(arrNum);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
		}
		
	}
	
	static void func1(int n1, int n2, int n3) {	// value에 의한 할당	
		n1 = n1 * 2;
		n2 = n2 * 2;
		n3 = n3 * 2;		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
	}
	
	static void func2(int arr[]) {	// address에 의한 할당
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}		
	}
	
	static int[] func3(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 3;
		}
		return arr;
	}
	
	
	

}
