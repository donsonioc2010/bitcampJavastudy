package GenericMain;

public class Generic_MainClass {

	public static void main(String[] args) {
		/*
		 	Generic  == Template(형태) 
		 			: 자료형의 변수 
		 			: 같은 클래스에서 다양한 자료형을 사용 하고 싶은 경우의 사용하는 요소
		 			
		 */
		//Box<int> box = new Box(123); int 로는 사용불가 오브젝트명으로 사용해야함.
		Box<Integer> box = new Box<Integer>(123);
		System.out.println(box.getTemp());
		//넘모넘모넘모넘모넘모 조오오오오오오오옹오오오오오오오오오오오오오오오오오오오오오오올ㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹ려
		//으어어어어어어어어어어어어어어어어어어어엉ㄹ어어어엉엉어엉어엉엉엉
		
		Box<String> sBox = new Box<String>("넘모넘모졸려");
		System.out.println(sBox.getTemp());
		
		//여러개의 자료형을 사용할때 유용
		BoxMap<Integer,String> bmap = new BoxMap<Integer, String>(123,"wan't sleep");
		
		System.out.println(bmap.getKey());
		System.out.println(bmap.getValue());
		System.out.println(bmap.getValue() + bmap.getKey());
		
		
	}

}
		//<이름> 사용자가 지정 Generic
class Box<T>{
	T temp;
	
	public Box(T temp) {
		this.temp = temp;
	}
	
	public T getTemp() {
		return temp;
	}
	
	public void setTemp(T temp) {
		this.temp = temp;
	}
}

class BoxMap<Key,Value>{
	Key key;
	Value value;
	
	public BoxMap(Key key, Value value) {
		super();
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
	
	
}
