package Answer.main;

public class answerStudent {
	String name;
	int ban;
	int no;
	int kor,eng,math;
	
	int sum;
	public int getTotal(int kor,int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
//		return kor+eng+math;
		
		sum = this.kor+this.eng+this.math;
		return sum;
	}
	
	public double getAverage() {
//		double avg = (double)(kor+eng+math)/3;
//		return avg;
		
//		int sum = this.kor+this.eng+this.math;
//		return (double)sum/3.0;
		
		return (double)sum/3.0;
	}
}
