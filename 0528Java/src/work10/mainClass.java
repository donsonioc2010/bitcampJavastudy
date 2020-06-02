package work10;

public class mainClass {

	public static void main(String[] args) {
		//두점 (x,y)와(x1,y1)간의 거리를 구한다. 공식 : 루트(y1 -y)2+(x1-x)2
		double dis = getDistance(1,1,1,2);
		System.out.println("거리 : "+dis);
	}

	static double getDistance(int x, int y,int x1,int y1) {
		double dx,dy;
		double result;
		
		//루트 :	sqrt라는 함수를 사용 	n의 승수 : pow
		dx = Math.pow(x1-x, 2);
		dy = Math.pow(y1-y, 2);
		result = Math.sqrt(dy + dx);
		
		//return result;
		return Math.sqrt(Math.pow(y1-y,2)+Math.pow(x1-x,2));
		
	}
}
