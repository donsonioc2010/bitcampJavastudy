package myclass;

public class TV {	//클래스 설계(정의)
	String name;
	int channel;
	boolean power;
	
	public void getInput(String n,int c,boolean p) {
		name  =n;
		channel = c;
		power = p;
	}
	
	public void setPower() {
		if(power)
			power= false;
		else
			power = true;
	}
	
	public void method() {
		System.out.println("name = "+name);
		System.out.println("channel = "+channel);
		System.out.println("power = "+power);
	}
}
