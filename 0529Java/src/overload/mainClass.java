package overload;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Over Load : 함수(메소드)명은 같고
		 				매개변수(인수,인자)의 자료형이나
		 				인수의 갯수가 다른 것을 의미
		 				
		 	ex)
		 	image drawing -> 알파(투명값 RGBA), 불투명(RGB)
		 	
		 	imageDraw(int x , int y , int a)
		 	
		 	imageDraw(int x, int y)
		 */
		int n1 = Integer.parseInt("123");
		int n2 = Integer.parseInt("1010", 2);
		System.out.println(n1 + " "+n2);
		/*
		 	unsigned byte = 0~255
		 	signed byte = -128~127
		 */
		funcName();
		funcName('a');
		funcName(1);
		funcName('a', 1);
		funcName(1,'a');
	}
	static void funcName() {
		System.out.println("funcName() 호출");
	}
	static void funcName(char c) {
		System.out.println("funcName(char c) 호출");
	}
	static void funcName(int i) {
		System.out.println("funcName(int i) 호출");
	}
	static void funcName(char c,int i) {
		System.out.println("funcName(char c,int i) 호출");
	}
	static void funcName(int i,char c) {
		System.out.println("funcName(int i,char c) 호출");
	}
	//오버로드 X 
	/*1. 리턴값으로 오버로드를 구분하지 못한다
	static int funcName(int i,char c) {
		System.out.println("funcName(int i,char c) 호출");
		return 1;
	}
	2. 가인수명이 달라도 매개변수의 형식이 같은게 있으면 오버로드를 하지 못한다
	static void funcName(int a,char b) {
		System.out.println("funcName(int i,char c) 호출");
	}
	*/
}
