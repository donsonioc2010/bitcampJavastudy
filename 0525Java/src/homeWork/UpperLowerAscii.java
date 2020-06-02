package homeWork;

import java.util.Scanner;

public class UpperLowerAscii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			int submit  = c;
			if(submit>=65 && submit<=90) {
				System.out.print((char)(submit+32));
			}else if(submit>=97 && submit<=122) {
				System.out.print((char)(submit-32));
			}else
				System.out.print(str.charAt(i));
			
		}

	}

}
