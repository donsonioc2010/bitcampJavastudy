package Work1;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	Rectangle(int x,int y){
		this.width = x;
		this.height = y;
	}
	
	
	public boolean isSquare() {
		if(width==height) 
			return true;
		else
			return false;
	}

	@Override
	double calcArea() {
		
		return width*height;
	}
}
