package mycls;
public class MyClass_3 {
	//class Member Variable
	int number;
	public String name;
	private int number2; //member variable 의경우 private로 설정하는 경우가 많다.
	
	//toolbar source-getter/setter 자동완성
	public String getName() {
		return name;
	}
	public void setName(String name) {	//this = 매개변수 0번째에 존재하고 있는 자기 자신의 참ㅈ다
		this.name = name;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	public MyClass_3 getThis() {
		return this;
	}
	
	//setter getter
	/*
	public void setNumber(int newNumber) {
		number = newNumber;
	}
	public int getNumber() {
		return number;
	}
	*/
	//class member method
	public void func() {
		//처리
	}
	
	public void method() {
		
	}
}
