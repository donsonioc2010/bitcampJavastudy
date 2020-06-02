package 구구단;

public class guguDan {

	public static void main(String[] args) {
		System.out.println("구구단시작");
		for(int i = 2; i<10; i++) {
			System.out.print(i+"단 : ");
			for(int j = 2; j<10; j++) 
				System.out.print(i*j+" ");
			System.out.println();
		}
	}
}
