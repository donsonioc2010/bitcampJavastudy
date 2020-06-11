package Types;

import Bomb.*;
import weapon.*;


public class Btype implements AbstractItem {

	@Override
	public Weapon CreateWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	public Bomb CreateBomb() {
		// TODO Auto-generated method stub
		return new Dynamite();
	}

}
