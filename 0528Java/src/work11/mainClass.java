package work11;

public class mainClass {

	public static void main(String[] args) {
		//����
			int original[] = {1,2,3,4,5,6,7,8,9};
			System.out.println(java.util.Arrays.toString(original));
			shuffle(original);
			System.out.println(java.util.Arrays.toString(original));
	}
	//static int[] shuffle(int[] array) {
	static void shuffle(int[] array) {
		int temp;
		for(int i = 0; i<100; i++) { // random�� �����ϱ� ���� ���������� �迭�� ���̸�ŭ �����ʿ䰡 ����
			int r1 = (int)(Math.random() * array.length); //0-8
			int r2 = (int)(Math.random() * array.length); //0-8
			
			temp = array[r1];
			array[r1] = array[r2];
			array[r2] = temp;
		}
		//return array;
	}

}
