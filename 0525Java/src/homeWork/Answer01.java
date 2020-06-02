package homeWork;

public class Answer01 {

	public static void main(String[] args) {
		int r ;
		int number[] = new int[52];
		boolean swit[] = new boolean[52];
		for(int i = 0; i<swit.length; i++) {
			swit[i] = false;
		}
		int w = 0;
		
		// 0 ~ 51 -> 1~ 52
		// 셔플(shuffle), 정렬(효율), 트리, 탐색(속도)
		while(w<52) {
			r = (int)(Math.random() * 52); // 0~51
			
			if(swit[r] == false) {
				swit[r] = true;
				number[w] = r;  //1~52
				w++;
			}
		}

		int cardNum;	//1~13
		int cardPic;	//0~3 0: 스페이드 1:다이아 2: 하트 3: 클로버
		// 숫자
		for(int i = 0; i<number.length; i++) {
			cardNum = number[i] %13 + 1;
			
			if(cardNum == 1) {			//'A'
				System.out.print("CardNumber = "+number[i] +", A");
			}else if(cardNum ==11) {	//'J'
				System.out.print("CardNumber = "+number[i] +", J");
			}else if(cardNum == 12) {	//'Q'
				System.out.print("CardNumber = "+number[i] +", Q");
			}else if(cardNum == 13) {	//'K'
				System.out.print("CardNumber = "+number[i] +", K");
			}else {						// 그냥수
				System.out.print("CardNumber = "+number[i] +", "+cardNum);
			}
			
			// 문양
			cardPic = number[i]/13;
			switch (cardPic) {
				case 0:
					System.out.println(", 스페이드");
					break;
				case 1:
					System.out.println(", 다이아");
					break;
				case 2:
					System.out.println(", 하트");
					break;
				case 3:
					System.out.println(", 클로버");
					break;
			}
		}
		
	}

}
