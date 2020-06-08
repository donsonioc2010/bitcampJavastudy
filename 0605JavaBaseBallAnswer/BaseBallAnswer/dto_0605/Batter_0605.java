package dto_0605;

public class Batter_0605 extends Human_0605 {

	private int batcount;
	private int hit;
	private double hitAvg;	// 0.0 ~ 1.0
	
	public Batter_0605() {
		// TODO Auto-generated constructor stub
	}

	public Batter_0605(int number, String name, int age, double height, int batcount, int hit, double hitAvg) {
		super(number, name, age, height);
		this.batcount = batcount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}

	public int getBatcount() {
		return batcount;
	}

	public void setBatcount(int batcount) {
		this.batcount = batcount;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public double getHitAvg() {
		return hitAvg;
	}

	public void setHitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}

	@Override
	public String toString() {
		return super.toString() +  batcount + "-" + hit + "-" + hitAvg ;
	}
	
	public void allClean() {
		setNumber(0);
		setName("");
		setAge(0);
		setHeight(0.0);
		setBatcount(0);
		setHit(0);
		setHitAvg(0.0);		
	}
}






