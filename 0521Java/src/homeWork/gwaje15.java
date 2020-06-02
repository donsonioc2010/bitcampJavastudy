package homeWork;

public class gwaje15 {

	public static void main(String[] args) {
		for(int i = 1; i<10; i++) {			//구구단
			System.out.print(i+"단 ");		//단을 표기
			for(int j = 1; j<10; j++) {		//곱하는부분
				System.out.print(i*j+" ");		//i*j 를 하여 연산
			}
			System.out.println();
		}
	}

}
