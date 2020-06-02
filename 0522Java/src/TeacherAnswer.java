import java.util.Scanner;

public class TeacherAnswer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 유저로부터 입력 받은 수들의 합계와 평균을 구하는 프로그램을 작성하라

		// 선언
		int numArr[]= null; 	// = int *numArr == 참조  => null(0) != nul(빈문자)
								// = 0xffffffff =>주소는 32bit 
		int sum;				//합계를 구할 변수
		double avg; 			//평균을 구할 변수
		int count;				//원하는숫자를 입력받을 변수
		
		
		// 초기화
		sum = 0; //sum만 초기화해도됨
		avg = 0.0;
		
		// 연산하고 싶은 숫자의 갯수를 입력을 받는다
		System.out.print("연산하고 싶은 숫자의 갯수 = ");
		count = sc.nextInt();
		
		// 그 갯수에 맞게 배열을 확보한다(동적할당)
		numArr = new int[count];
		
		// 합계를 산출할 숫자들을 입력
		for(int i = 0; i<numArr.length; i++) {
			System.out.print((i+1)+"번째 수를 입력하세요 : ");
			numArr[i] = sc.nextInt();			
		}
		
		// 합계를 산출
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		// 평균을 산출
		avg = (double)sum / numArr.length;
		
		// 결과 출력
		for(int i = 0 ; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}

}
