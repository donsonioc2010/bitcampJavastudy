package work3;

public class Exercise5 {
	
	public static void main(String[] args) {
		/*Robot[] arr = {new DanceRobot(),
				new SingRobot(),new DrawRobot()};
				*/
		//Robot arr[] = {new DanceRobot(),new SingRobot(),new DrawRobot()};
		//for(int i = 0; i<arr.length; i++) 
			//action(arr[i]);
		Object arr[] = {new DanceRobot(),new SingRobot(), new DrawRobot()};
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
		
	}
	/*
	static void action(Robot r) {

		if(r instanceof DanceRobot) {
		DanceRobot dance = (DanceRobot)r;
		dance.dance();
		}else if(r instanceof SingRobot) {
			((SingRobot)r).sing();
		}else
			((DrawRobot)r).draw();
	
	}*/
	public static void action(Object r) {
		if(r instanceof DanceRobot) {
			DanceRobot dance = (DanceRobot)r;
			dance.dance();
			}else if(r instanceof SingRobot) {
				((SingRobot)r).sing();
			}else
				((DrawRobot)r).draw();
	}


}
