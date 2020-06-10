package abstract_main;

public class mainClass {

	public static void main(String[] args) {
		//추상 클래스
		
		/*
		 	Abstract class : 추상 클래스 
		 			추상Method : 선언만 되어있는 함수 
		 					abstract int method(char c, int i); prototype
		 					선언만되어있는것
		 					선언만 해놓고 상속받아 알아서 쓸때 자주 사용
		 			생성 불가능, 상속받은 class에서 정의를 한 후에 생성이 가능하다
		 	
		 	class 		   : 일반클래스 (Method의 내용이 모두 설정되어 있는것) 
		 						ex) int method(char c,int i){
		 							처리
		 						}
		 */			
		//abstractClass acls = new abstractClass(); 생성불가능
		abstractClass acls = new abstractClass() {
			
			@Override
			public void abstractMethod() {
				System.out.println("Main abstractMethod()");
			}
		};
		acls.method();
		acls.abstractMethod();
		
		ChildClass ccls = new ChildClass();
		ccls.method();
		ccls.abstractMethod();
		
		abstractClass aacls = new ChildClass();
		
		aacls.abstractMethod();
		aacls.method();
		abstractClass mcls = new MyClass();
		mcls.abstractMethod();
	}

}
