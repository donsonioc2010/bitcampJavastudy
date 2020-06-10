package Work1;

public class Circle extends Shape{
	private double r;

	public Circle(double r) {
		this.r = r;
	}
	@Override
	double calcArea() {
		
		return (r*r)*3.14;
	}
	

}
