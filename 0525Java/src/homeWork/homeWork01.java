package homeWork;

public class homeWork01 {

	public static void main(String[] args) {
		// Ʈ���� ī�� (52���� ����) A(1) 2,~10 , J(11), Q(12), K(13) , * 4
		// ����  0 - 51
		// 0~ �����̵� / 13~  ���̾Ƹ�� / 26 ~ ��Ʈ  / 39~ Ŭ�ι� 
		/*	ex)
		 	���� : 13 ���̾�1
		 */
		
		//�������� 52���� ī��迭 ����
		int rnum[] = new int [52];
		boolean card[] = new boolean[52];
		
		//�ʱ�ȭ
		for(int i = 0; i<card.length; i++)
			card[i] = false;
		
		//ī��̱�
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
				str = "�����̵�";
			}else if(pyosik==1) {
				str = "���̾�";
			}else if(pyosik==2) {
				str = "��Ʈ";
			}else
				str = "Ŭ�ι�";
			if(b)
				System.out.println((i+1)+"��° ���� : "+rnum[i]+" " + str+" "+a);
			else
				System.out.println((i+1)+"��° ���� : "+rnum[i]+" " + str+" "+mod);
		}
		
		
	}

}
