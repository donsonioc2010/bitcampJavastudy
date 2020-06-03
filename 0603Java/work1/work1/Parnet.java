package work1;
public class Parnet {
	int x = 100;
	public Parnet() {
		this(200);	//2
	}
	public Parnet(int x) {
		this.x = x;	//1
	}
	int getx() {
		return x;
	}
}
