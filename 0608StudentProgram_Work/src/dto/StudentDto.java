package dto;

public class StudentDto {
	private String name;
	private int age;
	private int eng;
	private int math;
	private double avg;
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentDto(String name, int age, int eng, int math) {
		super();
		this.name = name;
		this.age = age;
		this.eng = eng;
		this.math = math;
	}
	public StudentDto(String name, int age, int eng, int math,double avg) {
		super();
		this.name = name;
		this.age = age;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
	}
	
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		avg = (math+eng)/2.0;
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

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public String SaveString() {
		String str = name + "-"+age+"-"+eng+"-"+math+"-"+avg;
		return str;
	}
	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", age=" + age + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
	
}
