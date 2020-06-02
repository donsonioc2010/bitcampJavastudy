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
		
		//암호화
		String src = "abc012";
		
		String resultCode = "";
		
		for(int i  = 0; i<src.length(); i++) {
			char ch = src.charAt(i);
			int n = (int)ch;
			
			// 알파벳의 경우
			if(n>=97 && n<=122) {
				n = n-97;	// 97==0;
				resultCode = resultCode +abcCode[n];
			}
			
			// 숫자의 경우
			if(n >= 48 && n<=57) {
				n = n - 48;
				resultCode = resultCode + numCode[n];
			}
		}
		System.out.println("원본 : "+ src);
		System.out.println("암호화 : "+ resultCode);
		
		//복호화
		String baseCode = "";
		for(int i  = 0;i<resultCode.length();i++) {
			char ch = resultCode.charAt(i);
			int n = (int)ch;
			
			int index = 0;
			if(n>=97&& n<=122) {//암호화된 숫자
				for(int j = 0; j<numCode.length;j++) {
					if(ch==numCode[j]) {
						index = j;
						break;
					}
				}
				index = index+48;
				baseCode = baseCode + (char)index;
			}else {		//암호화된 소문자
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
		System.out.println("복호화 : "+baseCode);
		*/
		
		String str = "abcd0123";
		String scode = security(str);
		System.out.println("암호화 : "+scode);
		String dcode = deciphering(scode);
		System.out.println("복호화 : "+ dcode);
	}
	//암호화
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
				
				// 알파벳의 경우
				if(n>=97 && n<=122) {
					n = n-97;	// 97==0;
					resultCode = resultCode +abcCode[n];
				}
				
				// 숫자의 경우
				if(n >= 48 && n<=57) {
					n = n - 48;
					resultCode = resultCode + numCode[n];
				}
			}
			return resultCode;
	}
	//복호화
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
			if(n>=97&& n<=122) {//암호화된 숫자
				for(int j = 0; j<numCode.length;j++) {
					if(ch==numCode[j]) {
						index = j;
						break;
					}
				}
				index = index+48;
				baseCode = baseCode + (char)index;
			}else {		//암호화된 소문자
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
