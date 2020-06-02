package switchClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	switch : 조건문이지만, 값이 명확해야 한다
		 	
		 	switch(변수){
		 		case 변수값1:
		 			처리
		 			break;
		 		case 변수값2:
		 			처리
		 			break;
		 		default:			(else)
		 			break;
		 	}
		 */
		//default 생략이 가능하며  break문을 안적을시에는 break를 찾을때까지 순차진행
		// 범위기호를 사용할수가 없다.(>,<,>=,<=,!)
		// double을 사용할 수가없다 문자는 가능하다
		// c는 안되나 java는 switch문에 string을 사용한 비교가 가능하다
		// 깔금하게 코드를 짤수 있으나 제약이 많다
		int number = 1;
		switch (number) {
			case 1:
				System.out.println("number = 1");
				break;
			
			case 2:
				System.out.println("number = 2");
				break;
			default:
				System.out.println("number != 1, number !=2");
				break;
		}
		
		char c=  '가';
		switch (c) {
			case '가':
				System.out.println("c = 가");
				break;

		default:
			break;
		}
		String str = "ABC";
		switch(str) {
			case "ABC":
				System.out.println("str = ABC");
				break;
		}
		
		/*
		 * 	실무에서 쓰이는 방식
		 	switch(process){
		 		case CREATE:
		 			break;
		 		case PRINT:
		 			break;
		 		case RELEASE:
		 			break;
		 	}
		 */
		
	}

}
