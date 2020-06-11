package Types;

import Bomb.*;
import weapon.*;

public class Atype implements AbstractItem {

	@Override
	public Weapon CreateWeapon() {
		// TODO Auto-generated method stub
		return new Gun();
	}

	@Override
	public Bomb CreateBomb() {
		// TODO Auto-generated method stub
		return new C4();
	}

}
