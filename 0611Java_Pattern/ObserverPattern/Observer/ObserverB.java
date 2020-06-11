package Observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverB implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		String msg = (String)arg;
		System.out.println("감시자 B입니다 : "+msg);
	}

}
