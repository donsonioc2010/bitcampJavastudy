package dice;

public class randomNumber {
	private int r_num[] = new int[2];
	private int sum;
	
	private void init() {
		sum = 0;
		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = 0;
		}
	}
	
	public void dice() {
		System.out.println("주사위를 배정합니다.");
		//초기화~
		init();
		
		//Dice 배정받기 
		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = (int)(Math.random()*6)+1;
			sum += r_num[i];
		}
		
	}

	public int[] getR_num() {
		return r_num;
	}

	public void setR_num(int[] r_num) {
		this.r_num = r_num;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	

}
