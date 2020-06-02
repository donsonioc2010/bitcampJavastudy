package homeWork;

public class gwaje17 {

	public static void main(String[] args) {
		int hol=0,jak=0;
		for(int i = 1; i<=100; i++) {
			if(i%2==0)jak +=i;
			else hol+=i;
		}
		System.out.println("짝수를 더한값 : "+jak + " 홀수를 더한 값 : "+hol);
	}

}
