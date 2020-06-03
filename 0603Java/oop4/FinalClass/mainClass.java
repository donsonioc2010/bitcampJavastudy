package FinalClass;

public class mainClass {

	public static void main(String[] args) {
		//fianl : 제약
		/*
		 	적용하는법
		 	1. 변수
		*/
		final int number=10;//final을 붙여줌으로서 변수가 상수로 바뀐다 설정하면서 값을 넣어줘야함(대입용으로 주로 사용)
		//number = 2; err
		final int MEMBER_NUMBER = 100; //소문자는 잘 사용하지 않는다
		
		/* 		
		 	2. 메소드
		 	3. 클래스
		 */
		
	}

}
//3.클래스 상속금지
final class superClass{
	int number;
	public superClass() {
		
	}
	//2.메소드  오버라이드를 금지하는 명령어
	public final void method() {
		
	}
}
/*
class thisClass extends superClass{//상속을못함
	
	public void method() {
		
	}
}
*/