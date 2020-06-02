package work7;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			���� ��� ���α׷�
			
			��踦 ������ �л��� ��?
			
			�����Ҵ� -> student[�л��� ��][4]
			ȫ�浿 90 100 85
			������ 100 95 90
			
			�̸�, �������� �Է�
			>> ���ڷ� �Է�
			>> �ٽ� �Է��� �ֽʽÿ�
						  
			1 ~ 100������ ���� 
			>> ������ �ʰ� �߽��ϴ�
						
			����, ����, ���� �ְ� ����
			
			����, ����, ���� ���� ����
			
			��� ������ ���� 
			
			�л� ���� ���� ���
			
		*/
		
		/*
		// 1���� �迭
		// ����: ���� �ڷ���(����)�� ����.
		// ����: ������ ����. 
		// ������ ������ �ϱ� ���ؼ� ����ϴ� ���� 
		// index number(����). 0 ~ n-1				
		// �����Ҵ�(1 ~ n��) �Ҵ��� �������� ���(����)
		int array[] = new int[5];	// new -> �����Ҵ�
		//	stack		heap		// delete array	-> ������ �ݷ���
		int array1, array2, array3, array4, array5;
		// stack
		int arrayTag[] = { 11, 22, 33, 44, 55 };
		//					0              4      : �� 5�� 
		
		// �迭 ����(������)	: �ӵ�. �ּҸ� �����ϸ� ��� �����͸� ���ٰ���
		int pArray[] = arrayTag;	// int *pArray = arrayTag
		System.out.println(arrayTag);
		
		pArray[1] = 222;
		System.out.println(arrayTag[1]);
		
		int arrayNumberPosition[] = { 1, 2, 3 };
		int arrNumPos[] = arrayNumberPosition;
				
		
		// 2���� �迭 ū����, ū���� �ȿ� ��Ҽ�
		int Array2[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8, 81 },
				{ 9, 10, 11, 12 },
		};
		
		// System.out.println(Array2[1][4]);
		
		for (int i = 0; i < Array2.length; i++) {
			for (int j = 0; j < Array2[i].length; j++) {
				System.out.print(Array2[i][j] + " ");
			}
			System.out.println();			
		}
		*/
		
		// memory 
		/* 
		 	Array2[0][0]
		 	Array2[0][1]
		 	Array2[0][2]
		 	Array2[0][3]
		
		
		*/
		
		Scanner sc = new Scanner(System.in);
		// �л� ���� ������ 2���� �迭
		// String -> �̸�, ���� -> parseInt	int -> ����
		//			  �л���, �̸� + ����(����, ����, ����)
		// �����
		String student[][] = null;
		int count;		// �л���
		
		// 1. �л� ���� �Է�
		System.out.print("�л����� �Է� = ");
		count = sc.nextInt();
		
		// 2. �����Ҵ�
		student = new String[count][4];
		
		// 3. �Է�: �̸�, ����, ����, ����
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "��° �л� >>");			
			
			System.out.print("�̸�:");
			String name = sc.next();
			
			String lang = "";
			while(true) {
				System.out.print("����:");
				lang = sc.next();	// 98 100 10a
				
				boolean check = false;
				for(int j = 0;j < lang.length(); j++) {
					char c = lang.charAt(j);
					if((int)c < 48 || (int)c > 57) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ֽʽÿ�");
					continue;
				}
				
				// 1 ~ 100������ ���� 
				// >> ������ �ʰ� �߽��ϴ�
				int numLang = Integer.parseInt(lang);
				if(numLang < 0 || numLang > 100) {
					System.out.println("������ �ʰ��� �����Դϴ�. �ٽ� �Է��� �ֽʽÿ�");
					continue;
				}
				
				break;
			}
			
			// ����
			System.out.print("����:");
			String eng = sc.next();
			
			// ����
			System.out.print("����:");
			String math = sc.next();
			
			// �����͸� �迭�� ����
			student[i][0] = name;
			student[i][1] = lang;
			student[i][2] = eng;
			student[i][3] = math;			
		}	
		
		// ���
		for (int j = 0; j < student.length; j++) {
			System.out.print(j + ":"); 
			for (int j2 = 0; j2 < student[0].length; j2++) {
				System.out.print(student[j][j2] + "\t");
			}
			System.out.println();			
		}		
		
		int studentCount[][] = new int[student.length][3];
		for (int j = 0; j < student.length; j++) {
			studentCount[j][0] = Integer.parseInt(student[j][1]); // ����
			studentCount[j][1] = Integer.parseInt(student[j][2]); // ����
			studentCount[j][2] = Integer.parseInt(student[j][3]); // ����
		}
				
		// 4. ����, ����, ���� �ְ� ����	max
		int max = studentCount[0][0];
		for (int j = 0; j < student.length; j++) {
			if(max < studentCount[j][0]) {
				max = studentCount[j][0];
			}
		}
		
		// 5. ����, ����, ���� ���� ����	min
		int min = studentCount[0][1];
		for (int j = 0; j < student.length; j++) {
			if(min > studentCount[j][1]) {
				min = studentCount[j][1];
			}
		}
		
		// 6. ��� ������ ���� 
		int sum = 0;
		for (int j = 0; j < studentCount.length; j++) {
			for (int j2 = 0; j2 < studentCount[0].length; j2++) {
				sum = sum + studentCount[j][j2];
			}
		}
		
		// 7. �л� ���� ���� ���
		double avg = (double)sum / student.length;
		
		// ���
		

	}

}










