package main;

import java.util.ArrayList;
import java.util.List;

import Factory.AnimalFactory;
import animal.Animal;
import animal.cat;
import animal.*;

class aniMalMainClass {

	public static void main(String[] args) {
		/*
		 	Singleton Pattern
		 		중심이 되는 데이터의 관리	template(list,Map)을 중심으로 
		 		어느 클래스에서나 접근이 용이하게 하기위한  패턴
				instance가 한개만 있는것을 의미.
			
			FactoryPattern 
				Object공장?
				원하는 클래스의 형태를 생성하기 위한 패턴
		*/
		/*	ex)	 
			interface, class 동물
			
			class cat,cow,dog
			Animal ani = new cat();
		*/
		Animal ani1 = AnimalFactory.create("고양이");
		Animal ani2 = AnimalFactory.create("개");
		Animal ani3 = AnimalFactory.create("흑우");
		
		ani1.printDescript();
		((cat)ani1).catMathod();
		ani2.printDescript();
		ani3.printDescript();
		
		List<Animal> list = new ArrayList<Animal>();
		
		Animal ani= null;
		/*
		ani = AnimalFactory.create("황소");
		list.add(ani);
		ani = AnimalFactory.create("황소");
		list.add(ani);
		ani = AnimalFactory.create("고양이");
		list.add(ani);
		ani = AnimalFactory.create("개");
		list.add(ani);
		ani = AnimalFactory.create("개");
		list.add(ani);
		ani = AnimalFactory.create("개");
		list.add(ani);*/
		String aname[] = {"흑우","흑우","고양이","개","개","개"};
		for(int i = 0; i<aname.length;i++) {
			ani= AnimalFactory.create(aname[i]);
			list.add(ani);
		}
		
		for(int i = 0; i<list.size();i++) {
			Animal a = list.get(i);
			a.printDescript();
			
			if(a instanceof cat) 
				((cat)a).catMathod();
			else if(a instanceof dog)
				((dog)a).dogMethod();
			else if(a instanceof cow)
				((cow)a).cowMethod();
		}
		
	}

}
