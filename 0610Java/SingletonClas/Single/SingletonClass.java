package Single;

public class SingletonClass {
	private static SingletonClass sc = null;
	//외부에서의 직접적인 접근을 못하게 막아놈
	
	public Object snum;
	private SingletonClass() {
		
	}
	public static SingletonClass getInstance() {
		if(sc ==null) {
			sc = new SingletonClass();
		}
		return sc;
	}
}
