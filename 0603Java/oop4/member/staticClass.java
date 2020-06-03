package member;
public class staticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static = 정적-> 유지한다
		//static변수를 남발하면 메모리의 낭비가 됨으로 주의해서 사용할것
		//statck heap static
		/*
		int i; // stack 메모리에 올라가는 지역변수
		MyClass cls = new MyClass();
		
		int m = cls.getMemNum();
		System.out.println("m = " +m);
		
		cls.method();
		cls.method();
		cls.method();
		
		MyClass cls2 = new MyClass();
		cls2.method();
		*/
		MyClass.staticMethod();
		
		member mem = new member();
		mem.init();
		mem.random();
		mem.input();
		
		member mem2 = member.getInstance();
		
		member.getInstance();
		
		
	}
	
}

class MyClass{
	private int memNum = 0;
	//인스턴스가 10개면 10개의 변수가 생성됨
	//static 변수의 경우 메모리를 공유함으로 10개의 인스턴스가 생성되어도 1개의 변수로만 사용하는것
	static int staticVar; //초기화를 안해도됨 알아서 0이 들어감
	
	int getMemNum() {
		return memNum;
	}
	void setMemNum(int memNum) {
		this.memNum = memNum;
	}
	
	public void method() {		//instanceMethod instance를 통해야 호출할수 있음
		memNum = memNum+1;
		System.out.println("memNum = "+memNum);
		staticVar = staticVar+1;
		System.out.println("staticVar = "+staticVar);
	}
	
	public static void staticMethod() {	//ClassMethod instance를 통하지않더라도 호출이 가능함
		System.out.println("MyClass StaticMethod() 호출");
		
		//static 을 사용한 method의 경우에 접근을 못하는 요소들
		//this,super
	}
}