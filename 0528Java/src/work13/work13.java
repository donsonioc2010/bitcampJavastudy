package work13;

public class work13 {

	public static void main(String[] args) {
		
		//최대값구하기
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
	}
	static int max(int array[]) {
		int max_num = array[0];
		for(int i = 0 ; i<array.length; i++) {
			if(max_num<array[i]) {
				max_num = array[i];
			}
		}
		
		return max_num;
	}
}
