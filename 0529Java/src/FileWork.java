import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWork {

	public static void main(String[] args) {
		/*
		 	write
		 		String arrAtr[] ={
		 			"아무문자열이나 넣어도됨
		 		};
		 		파일명 .txt 저장이 되는 함수를 만들기
		 	
		 	read
		 		String strArr[];
		 			[0] <- "Hello"	한문장씩읽기
		 		함수로 만들기
		 			
		 */
		String str = findFile()+".txt";
		//String data[] = inputData();
		write(str);
		String strArr[] = read(str);
		
	}
	static String findFile() {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("파일이름을 입력하세요.확장자명은 X");
		return sc.next();
	}
	/*
	static String[] inputData(){
		System.out.println("txt에 넣을 문자열을 입력(종료는 end입력)");
		Scanner sc = new Scanner(System.in);
		String str;
		String inputString[]= new String[1];
		int i = 1;
		while(true) {
			str=sc.nextLine();
			if(!str.equals("end")) {
				i++;
				for(int j = 0; j<i;j++)
					
			}else {
				return inputString;
			}
		}
	}
	*/
	static void write(String str)  {
		//str = 파일명     str2 = inputData
		Scanner sc = new Scanner(System.in);
		str = "d:/tmp/"+str;
		File file = new File(str);
		
		
		if(file.exists()) {
			return;					//작성하려는 파일이 존재하면 종료
		}else {						//작성하려는 파일이 없으면 생성
			FileWriter fw;
			try {
				fw = new FileWriter(file,true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				out:for(;;) {
					String str2=sc.next();
					if(!str2.equals("end")) {
						pw.println(str2);
					}else {
						break out;
					}
				}
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	static String[] read(String str)  {
		str = "d:/tmp/"+str;
		File file = new File(str);
		int i = 0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str2;
			while((str2=br.readLine())!=null) {
				i++;
			}
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		String strArr[] = new String[i];
		
		try {
			String str2="";
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			int x = 0;
			while(x<i) {
				strArr[x]=br.readLine();
				x++;
			}
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}			
		for(int j = 0;j<strArr.length;j++)
			System.out.println(strArr[j]);
		return strArr;
		
	}

}
