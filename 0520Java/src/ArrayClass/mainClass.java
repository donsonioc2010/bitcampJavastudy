package ArrayClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Array : 배열
		 			변수의 확장 기능.
		 			관리를 용이하게 하기 위한 목적
		 			배열의 정의 : 같은 자료형의 묶음이다
		 			
		 			관리란 ? : index 번호를 통하여 관리하는것을 의미함
		 			
		 			형식 : 
		 				자료형 배열명(=변수명)[] = new 자료형[필요한배열의갯수];
		 	
		 	변수를 준비하라하면...
		 	int num1...num2....num3....등등
		 */
		
		       int Array[]     =    new int[10];
		//동적으로 할당(stack)에 배치       정적으로 사용(heap에 배치
		//메모리에는 4개의 영역이 있슴
		//stack/heap/static/system
		//java 의 indexNumber 는 0번부터 시작하여 필요갯수 -1번지까지 사용
		//동적으로 생성해 정적으로 사용됨
		       
		int array[] = new int[3];
		//int []array = new int[3];
		//int[] array = new int[3];
		//3개모두 사용이 가능하다
		
		int num1,num2,num3;
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		
		//변수초기화
		int tag = 1;
		int arr[] =  {1,2,3};
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);
		System.out.println("arr[2]="+arr[2]);
		
		char charArr[]= {'H','E','L','L','O'};
		System.out.println(charArr);
		System.out.println(charArr[0]);

		System.out.println((int)charArr[0]);//ASCII코드
		
		char charArr2[] = new char[5];
		charArr2[0] = 'H';
		charArr2[1] = 'e';
		charArr2[2] = 'l';
		charArr2[3] = 'l';
		charArr2[4] = 'o';
		System.out.println(charArr2);

		//System.out.println((int)charArr2);
		// 원래는 Heap 에있는 charArr2의 메모리 주소가 나온다
	}

}
