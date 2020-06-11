package Types;
import Bomb.*;
import weapon.*;

public interface AbstractItem {
	public Weapon CreateWeapon();
	public Bomb CreateBomb();
}
