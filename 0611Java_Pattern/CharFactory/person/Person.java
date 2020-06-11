package person;
import weapon.*;
import Bomb.*;
import Types.AbstractItem;

public class Person {
	public Weapon m_Weapon;
	public Bomb m_Bomb;
	
	public void create(AbstractItem ai) {
		m_Weapon = ai.CreateWeapon();
		m_Bomb = ai.CreateBomb();
		
	}
	
}
