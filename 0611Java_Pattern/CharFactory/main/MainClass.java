package main;

import java.util.*;
import Types.*;
import person.Person;

public class MainClass {
	public static void main(String[] args) {
		Person char1 = new Person();
		char1.create(new Atype());
		
		//char1.m_Weapon.drawWeapon();
		//char1.m_Bomb.drawBomb();
		
		List<Person> charPerson = new ArrayList<Person>();
		
		boolean b[] = {true,false,false,true,false};
		
		for(int i = 0; i<b.length;i++) {
			if(b[i])  
				char1.create(new Atype());
			else 
				char1.create(new Btype());
			charPerson.add(char1);
			System.out.println((i+1)+"번째 캐릭터");
			charPerson.get(i).m_Weapon.drawWeapon();
			charPerson.get(i).m_Bomb.drawBomb();
		}
		
	}
}
