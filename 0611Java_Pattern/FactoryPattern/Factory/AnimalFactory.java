package Factory;

import animal.*;

public class AnimalFactory {
	//Factory로 원하는  형태의 클래스를 생성
	public static Animal create(String animalName) {
		if(animalName.equals("")) {
			System.out.println("생성할 클래스가 없다");
		}else if(animalName.equals("고양이")) {
			return new cat();
		}else if(animalName.equals("개")) {
			return new dog();
		}else if(animalName.equals("흑우")) {
			return new cow();
		}
		return null;
	}
	
	
}
