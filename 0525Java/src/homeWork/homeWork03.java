
  package homeWork;

import java.util.Scanner;

public class homeWork03 {

	public static void main(String[] args) {
		/*
		 	���� ��� ���α׷�	
		 		��踦 ������ �л��� ��?
		 		�����Ҵ� -> student[�л��Ǽ�][4] 
		 			ex)	ȫ�浿 ���� ���� ����
		 				������ ���� ���� ����
		 				
		 		�̸�,�������� �Է�
		 		>>�������� = ���ڷ� �Է�
		 		>>���ڷ� �Է��� �ȵǸ� �ٽ��Է����ֽʽÿ� �ÿʽÿ�
		 		
		 		0~100������ ���� ���ϰ�� ������ �ʰ��ߴٰ� �ϰ� �ٽ��Է�
		 		
		 		
		 		����1,����2,����3 �ְ����� / ��������
		 		1,2,3������ ��� ������ ���հ� ���
		 */
		boolean stuTrue = false;
		Scanner sc = new Scanner(System.in);
		String strstuNum;
		String ScoreName[]= {"C���","Java","Python"};
		
		//�л��� �Է� �޴� ���ν���
		System.out.print("�л����� �Է����ּ���");
		while(true) {
			strstuNum = sc.next();							//�����Է�
			for(int i = 0; i<strstuNum.length(); i++) {		//���ڿ��� ���ڰ��ִ��� �˼�
				char c = strstuNum.charAt(i);
				if((byte)c>=48 && (byte)c<=57) {			//���ڸ��ִ��� �˼�
					stuTrue = true;
				}else {
					System.out.println("���ڸ� ������ �ּ���");	
					stuTrue = false;						//���ڰ� �ִ°�� �ٷ�����
					break;		
				}
			}
			if(stuTrue==true) {
				break;//���ڸ��ִ°�� ����ȴ�
			}else {
				System.out.println("�ٽ��Է��ϼ���");
				stuTrue =false;
			}
		}
		//�л��� �迭 �Է�
		int intstuNum = Integer.parseInt(strstuNum);
		String student[][] = new String[intstuNum][4];
		
		for(int i = 0; i<student.length; i++) {
			System.out.println("�л� ������ �Է��� �ּ���(�̸�,C���,Java,Python) : ");
			String str = sc.next();	
			String tmp[] = str.split(",");
			student[i][0]=tmp[0];
			
			out:for(int j = 1; j<tmp.length; j++) {			//�� ���� ������ ���ڰ� �ִ��� �˼�
				String search = tmp[j];					//�˼��ϴ� ������ ���������� ����
				
				for(int y = 0; y<search.length();y++) {	//���������� �ѱ��ھ� ������ ���� ������
					char c = search.charAt(y);			//���ȵ���
					if((byte)c>=48 && (byte)c<=57) {	//�����ΰ��
							int score = Integer.parseInt(tmp[j]);	//���������� 0~100�� �������� �˼�
							if(score>100||score<0) {				//���������� �������� 100���ʰ� 0�� �̸��� ������ ���Է�
								i--;
								System.out.println("������ ����� �ٽ��Է����ּ���. ���������� 0~100�����Դϴ�.");
								break out;
							}else {
								student[i][j]=tmp[j];
							}
					}else {								//�����ΰ�� ���Է�
						System.out.println("���񿡴��������Է����ּ���");
						i--;
						break out;
					}
				}
			}
		}
		//�л����� ������ ���� ����ϴ� ���ν���
		System.out.printf("�̸�\tC���\tJAVA\tPython\n");
		for(int i = 0; i<student.length; i++) {
			for(int j = 0; j<student[0].length; j++) {
				System.out.print(student[i][j]);
				System.out.printf("\t");
			}
			System.out.println();
		}
		
		//���� �ְ����� ��������
		//��������� �� ��
		//�����������/�л���
		
		//�л����� �ְ������� ���������� ���ϴ� ���
		int sum=0,avg,maxScore[]= {0,0,0};//�ִ������� �ʱ������ 0�������Ѵ�
		int minScore[] = {100,100,100};	  //���������� �ʱ������ 100���̴�
		
		//�л����� �հ踦 ���ϴ� ���ν���
		for(int i = 0; i<student.length;i++) {
			for(int j = 1; j<student[0].length;j++) {
				sum += Integer.parseInt(student[i][j]); 
			}
		}
		//���� �ְ��� �������� ���ϴ���� �迭�� ������ [�л���ȣ][����]���� �л���ȣ�� �ٲ����ϹǷ� j���� ������ ����
		for(int i = 1; i<student[0].length;i++) {
			for(int j = 0; j<student.length;j++) {
				if(maxScore[i-1] <=Integer.parseInt(student[j][i]))		//i-1�� ���迭�� �������� 0�̳� i�� 1�̱⶧��
					maxScore[i-1] = Integer.parseInt(student[j][i]);
				if(minScore[i-1]>=Integer.parseInt(student[j][i]))
					minScore[i-1] = Integer.parseInt(student[j][i]);
			}
		}
		
		//��հ��� ���ϴ� ���ν���
		avg = sum/student.length;
		System.out.println("============================================================");
		System.out.println("�� �հ� : "+sum + "���� ��� : "+avg);
		for(int i = 0; i<minScore.length; i++)
			System.out.println(ScoreName[i] + "���� �ְ����� : " +maxScore[i] + "�������� :"+minScore[i]);
	}

}
