package Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class mainClass2 {

	public static void main(String[] args) {
		//Exception
		//http://www.ezbocis.com/java-exception-jongryu/
		//NullPointerException
		String str = null;
		try {
			System.out.println(str.length());
		}catch (NullPointerException e) {
			System.out.println("str이 할당되지 않았습니다.");
		}
		
		//ArrayIndexOutOfBoundsException
		int arr[] = {2,4,6};
		try {
			System.out.println(arr[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index 범위 초과");
		}
		//FileNotFoundException 파일이 없는경우
		try {
			File file = new File("c:\\xxx.txt");
			FileInputStream is;
		
			is  = new FileInputStream(file);
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾을수 없습니다.");
		}
		
		//NumberForamtException
		int num;
		try {
			num = Integer.parseInt("123.456");
		}catch(NumberFormatException e) {
			System.out.println("형식이 다릅니다");
		}
		
		//StringIndexOutOfBoundsException
		String str1 = "abc";
		
		try {
			str1.charAt(3);
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("문자열의 범위 초과");
		}
	}
}
