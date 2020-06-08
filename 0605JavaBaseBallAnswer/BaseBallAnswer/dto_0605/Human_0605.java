package dto_0605;

// Data Transfer Object, Value Object 
public class Human_0605 {

	private int number;	// sequence number
	private String name;
	private int age;
	private double height;
	
	public Human_0605() {
	}

	public Human_0605(int number, String name, int age, double height) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
		this.height = height;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return number + "-" + name + "-" + age + "-" + height + "-";
	}
	
	
	
}
