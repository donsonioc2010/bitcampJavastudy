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
		// ����(shuffle), ����(ȿ��), Ʈ��, Ž��(�ӵ�)
		while(w<52) {
			r = (int)(Math.random() * 52); // 0~51
			
			if(swit[r] == false) {
				swit[r] = true;
				number[w] = r;  //1~52
				w++;
			}
		}

		int cardNum;	//1~13
		int cardPic;	//0~3 0: �����̵� 1:���̾� 2: ��Ʈ 3: Ŭ�ι�
		// ����
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
			}else {						// �׳ɼ�
				System.out.print("CardNumber = "+number[i] +", "+cardNum);
			}
			
			// ����
			cardPic = number[i]/13;
			switch (cardPic) {
				case 0:
					System.out.println(", �����̵�");
					break;
				case 1:
					System.out.println(", ���̾�");
					break;
				case 2:
					System.out.println(", ��Ʈ");
					break;
				case 3:
					System.out.println(", Ŭ�ι�");
					break;
			}
		}
		
	}

}
