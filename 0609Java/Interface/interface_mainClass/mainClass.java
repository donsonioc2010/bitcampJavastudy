package interface_mainClass;
public class mainClass {

	private static final String YouInterface = null;

	public static void main(String[] args) {
		/*	다중 상속이 불가능 하다. 단일 상속만 가능하다  다른언어는 가능하다 java는 안됨
		 	일반 추상 다 포함
		 	abstract class : 추상 메소드
		 		구성
		 		일반메소드 + abstract메소드 + Varaible
		 		
		 	interface 
		 		구성
		 		abstract method 로만 이루어져 있슴
		 		변수선언 X 일반메소드 X
		 		추상메소드의 선언만 되어있는 요소
		 		인터페이스는 다중상속이 가능하다
		 		빠르게 설계의 사양을 파악할수있다
		 
		 */
		InterfaceMyClass mcls = new InterfaceMyClass();
		mcls.method();
		
		YouClass ycls = new YouClass();
		ycls.method();
		
		MyInterface myInter = new InterfaceMyClass();
		
		myInter.method();
		MyInterface youInter = new YouClass();
		youInter.method();
		
		
		HeClass hlcs = new HeClass();
		hlcs.heMethod();
		hlcs.method();
		hlcs.func();
		
		MyInterface minter = new HeClass();
		minter.method();
		((YouInterface)minter).func();		//상속받은 메소드가 아니면 실행이 안됨 형변환을 해야한다
		//minter.func();
		((HeClass)minter).heMethod();
		//minter.heMethod();
		
	}

}
