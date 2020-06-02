package Exception;

public class mainClass_1 {

	public static void main(String[] args) {
		/*
		 	Exception : 예외처리		!= 에러
		 	
		 	ex) baseball->input:1~10 을 입력해야함->'A'(65)입력 예상밖= 예외처리
		 	number -> format exception
		 	array -> index number exception
		 	class -> Scanner 못찾는경우
		 	file -> 없을경우
		 	
		 	try{
		 		예외1가 나올 수 있는 소스
		 		예외2가나올수 있는 소스
		 	}catch(예외클래스1 e){
		 		메시지
		 	}catch(예외클래스2 e){
		 		마싸지
		 	}계속가능{
		 	}finally{
		 		생략은 가능함
		 		요기는 무조건 실행됨
		 		
		 		파일 close
		 		Database의 원상복구(RollBack) ->undo
		 	}
		 */
		/*
		int array[] = {1,2,3};
		System.out.println("프로그램 시작");
		try {
			for(int i = 0; i<4;i++) {
				System.out.println(array[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
			//e.printStackTrace();//exception err msg print
			//System.out.println(e.getMessage()); //어느부분에서 exception이 발생했는지 알려줌
			//return; //finally후 프로그램이 종료됨
		}catch(NumberFormatException e) {
			e.printStackTrace();//숫자대신 문자열이 들어올때
		}finally {
			System.out.println("무조건 실행");
		}
		System.out.println("프로그램 끝");
		*/
		func();
	}
	
	//function에 exception을 추가하는 방법
	static void func()throws ArrayIndexOutOfBoundsException {
		//예약어를 사용한 예외처리 아래의 catch명령어와 같음
		int array[] = {1,2,3};
		System.out.println("프로그램 시작");
			for(int i = 0; i<4;i++) {
				System.out.println(array[i]);
			}
	}
	//위와 아래는 동일한 처리
	static void func1() {

		int array[] = {1,2,3};
		System.out.println("프로그램 시작");
		try {
			for(int i = 0; i<4;i++) {
				System.out.println(array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
