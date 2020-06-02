package work14;

public class mainClass {

	public static void main(String[] args) {
/*
		char abcCode[] = {
				'`','~','!','@','#',
				'$','%','^','&','*',
				'(',')','-','_','+',
				'=','|','[',']','{',
				'}',';',':',',','.','/'
		};
				
		char numCode[] = {		//0~9
				'q','w','e','r','t',
				'y','u','i','o','p'
		};
		
		//��ȣȭ
		String src = "abc012";
		
		String resultCode = "";
		
		for(int i  = 0; i<src.length(); i++) {
			char ch = src.charAt(i);
			int n = (int)ch;
			
			// ���ĺ��� ���
			if(n>=97 && n<=122) {
				n = n-97;	// 97==0;
				resultCode = resultCode +abcCode[n];
			}
			
			// ������ ���
			if(n >= 48 && n<=57) {
				n = n - 48;
				resultCode = resultCode + numCode[n];
			}
		}
		System.out.println("���� : "+ src);
		System.out.println("��ȣȭ : "+ resultCode);
		
		//��ȣȭ
		String baseCode = "";
		for(int i  = 0;i<resultCode.length();i++) {
			char ch = resultCode.charAt(i);
			int n = (int)ch;
			
			int index = 0;
			if(n>=97&& n<=122) {//��ȣȭ�� ����
				for(int j = 0; j<numCode.length;j++) {
					if(ch==numCode[j]) {
						index = j;
						break;
					}
				}
				index = index+48;
				baseCode = baseCode + (char)index;
			}else {		//��ȣȭ�� �ҹ���
				for(int j = 0; j<abcCode.length; j++) {
					if(ch == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;
				baseCode = baseCode +(char)index;
			}
		}
		System.out.println("��ȣȭ : "+baseCode);
		*/
		
		String str = "abcd0123";
		String scode = security(str);
		System.out.println("��ȣȭ : "+scode);
		String dcode = deciphering(scode);
		System.out.println("��ȣȭ : "+ dcode);
	}
	//��ȣȭ
	static String security(String src) {
		char abcCode[] = {
				'`','~','!','@','#',
				'$','%','^','&','*',
				'(',')','-','_','+',
				'=','|','[',']','{',
				'}',';',':',',','.','/'
			};
					
			char numCode[] = {		//0~9
					'q','w','e','r','t',
					'y','u','i','o','p'
			};
			
			String resultCode = "";
			
			for(int i  = 0; i<src.length(); i++) {
				char ch = src.charAt(i);
				int n = (int)ch;
				
				// ���ĺ��� ���
				if(n>=97 && n<=122) {
					n = n-97;	// 97==0;
					resultCode = resultCode +abcCode[n];
				}
				
				// ������ ���
				if(n >= 48 && n<=57) {
					n = n - 48;
					resultCode = resultCode + numCode[n];
				}
			}
			return resultCode;
	}
	//��ȣȭ
	static String deciphering(String src) {
		char abcCode[] = {
				'`','~','!','@','#',
				'$','%','^','&','*',
				'(',')','-','_','+',
				'=','|','[',']','{',
				'}',';',':',',','.','/'
			};
					
			char numCode[] = {		//0~9
					'q','w','e','r','t',
					'y','u','i','o','p'
			};
			
			
		String baseCode = "";
		for(int i  = 0;i<src.length();i++) {
			char ch = src.charAt(i);
			int n = (int)ch;
			
			int index = 0;
			if(n>=97&& n<=122) {//��ȣȭ�� ����
				for(int j = 0; j<numCode.length;j++) {
					if(ch==numCode[j]) {
						index = j;
						break;
					}
				}
				index = index+48;
				baseCode = baseCode + (char)index;
			}else {		//��ȣȭ�� �ҹ���
				for(int j = 0; j<abcCode.length; j++) {
					if(ch == abcCode[j]) {
						index = j;
						break;
					}
				}
				index = index + 97;
				baseCode = baseCode +(char)index;
			}
		}
		return baseCode;
	}

}
