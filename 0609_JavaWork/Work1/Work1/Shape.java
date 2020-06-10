package Work1;

public abstract class Shape {

	Point p;
	
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	abstract double calcArea(); //도형의 면적을 계산후 반환 메서드
	Point getPosition() {
		return p;
	}
	void setPosition(Point p) {
		this.p =p;
	}
}
