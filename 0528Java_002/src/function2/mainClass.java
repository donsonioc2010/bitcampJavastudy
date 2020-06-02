package function2;

public class mainClass {

	public static void main(String[] args) {
		// 가변인수
		// 매개변수의 개수가 유동적이다
		// 개발자를 위한
		allocParam(1,2,3,4,5,6,7,8,9);
		int numb[] = {1,2,3,4,5,6,7};
		allocParam(numb);
		allocParam(23,4,59);
		func("hello",1,2,3,4,5,6,7);
	}
	
	
	static void allocParam(int...num) {
		int sum = 0;		//무조건3개(배열)
		for(int i  = 0; i<num.length; i++) {
			sum = sum+num[i];
		}
		System.out.println("합계 : "  +sum);
	}
	static void func(String str,int...num) {	//가변인수를 앞에적으면 안된다
						//가변인수는 항상 파라미터값의 맨뒤에 해줘야한다
		System.out.println("str = "+str);
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}
	

}
