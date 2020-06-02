package main;

public class Student {
	String name;
	int ban,no,kor,eng,math;
	
	public int getTotal(int k,int e,int m) {
		return k+e+m;
	}
	public double getAverage() {
		double avg = (kor+eng+math)/3.0;
		return avg;
	}
}
