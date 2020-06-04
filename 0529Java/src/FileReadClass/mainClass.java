package FileReadClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args)//throws Exception  방법도 사용가능 
	{
		//file read
		File file = new File("d:/tmp/test.txt");
		try {
			FileReader fr = new FileReader(file);
			
			//한문자씩 읽어 들이기
			/*
			int c = fr.read();
			String str="";
			while(c!=-1) {	//-1 == 파일의 끝
				//System.out.println((char)c);
				str = str+(char)c;
				c = fr.read();
			}
			System.out.println(str);
			*/
			
			//문장으로 읽기		buffer == 저장공간
			BufferedReader br = new BufferedReader(fr);
			
			String str ;
			while((str=br.readLine())!= null) {
				System.out.println(str);
				//str = br.readLine();
			}
			br.close();//BufferedReader는 항상 닫아줘야 한다
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
