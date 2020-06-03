package work2;
public class Unit {
	int x,y;
	void move(int x,int y) {
		System.out.println("x= "+x+"y= "+y);
	}
	void stop() {
		System.out.println("멈춤");
	}
}
class Marine extends Unit{

	void StimPack() {
		System.out.println("Marin StimPack");
	}
}
class Tank extends Unit {

	void ChangeMode() {
		System.out.println("Tank ChangeMode");
	}
}

class Dropship extends Unit{

	void load() {
		System.out.println("Unit Load");
	}
	void unload() {
		System.out.println("Unit Unload");
	}
}

interface uunit{
	void move(int x,int y);
	void stop();
}
