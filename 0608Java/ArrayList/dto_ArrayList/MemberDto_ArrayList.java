package dto_ArrayList;

public class MemberDto_ArrayList {
	private int number;
	private String name;
	
	public MemberDto_ArrayList() {
		// TODO Auto-generated constructor stub
	}
	public MemberDto_ArrayList(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MemberDto_ArrayList [number=" + number + ", name=" + name + "]";
	}
	
	
}
