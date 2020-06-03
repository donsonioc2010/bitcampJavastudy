package work1;

public class Exercise3 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x = "+c.getx());
	}
	//인스턴스를 생성하는순간
	//양도를받은 Parnet의 기본생성자가 실행이되고 기본생성자에서는 다시 생성자가 실행
	//그후 child의 생성자가 실행이되며 child에선 getx를 오버라이딩한 함수가 없으므로 
	//parnet의 getx가 실행되 값이 돌려받아지게된다
}
