
public class Point3D {
	int x,y,z;
	Point3D(int x,int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	Point3D(){
		this(0,0,0);
	}
	public boolean equals(Object obj) {
		Point3D d = (Point3D)obj;
		if(this.x==d.x) {
			if(this.y==d.y) { 
				if(this.z==d.z) 
					return true;
				else
					return false;
			}else
				return false;
		}else
			return false;		
	}
	public String toString() {
		return "X: "+x+" Y: "+y+" Z: "+z;
	}
}
