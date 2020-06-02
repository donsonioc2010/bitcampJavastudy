package homeWork;

public class homeWork01 {

	public static void main(String[] args) {
		// 트럼프 카드 (52장이 존재) A(1) 2,~10 , J(11), Q(12), K(13) , * 4
		// 랜덤  0 - 51
		// 0~ 스페이드 / 13~  다이아몬드 / 26 ~ 하트  / 39~ 클로버 
		/*	ex)
		 	숫자 : 13 다이아1
		 */
		
		//변수선언 52장의 카드배열 선언
		int rnum[] = new int [52];
		boolean card[] = new boolean[52];
		
		//초기화
		for(int i = 0; i<card.length; i++)
			card[i] = false;
		
		//카드뽑기
		int i = 0;
		while(i <rnum.length) {
			int room = (int)(Math.random()*52);
			if(card[room] == false){
				card[room] = true;
				rnum[i] = room;
				
				i++;
			}
		}
		
		for(i = 0; i<rnum.length; i++) {
			int pyosik = rnum[i]/13;
			int mod = rnum[i]%13;
			String a = "";
			String str = "";
			boolean b = false;
			if(mod == 0) {
				a = "A";
				b = true;
			}else if(mod ==11) {
				a = "j";
				b = true;
			}else if(mod==12) {
				a = "q";
				b = true;
			}else if(mod==13) {
				a = "k";
				b = true;
			}
			if(pyosik==0) {
				str = "스페이드";
			}else if(pyosik==1) {
				str = "다이아";
			}else if(pyosik==2) {
				str = "하트";
			}else
				str = "클로버";
			if(b)
				System.out.println((i+1)+"번째 숫자 : "+rnum[i]+" " + str+" "+a);
			else
				System.out.println((i+1)+"번째 숫자 : "+rnum[i]+" " + str+" "+mod);
		}
		
		
	}

}
