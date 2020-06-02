import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAnswer {

	public static void main(String[] args) {
		//저장할 파일 경로
		String name = "d:/tmp/TeacherAnswer.txt";
		//파일오픈
		File file = new File(name);
		//문자열
		String arrAry[] = {
				"Hello",
				"안녕하세요",
				"hi"
		};
		dataSave(file, arrAry);
		String[] str2 = dataLoad(file);
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
	}
	static void dataSave(File file, String datas[]) {
		try {
			FileWriter fw  = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			for (int i = 0; i < datas.length; i++) {
				pw.println(datas[i]);
			}
			pw.close();
		}catch (IOException e) {
			System.out.println("파일에 데이터가 저장되지 않았습니다.");
			//return false;
		}
		System.out.println("파일에 데이터가 저장되었습니다");
		//return true; boolean을 주고 메인이나 다른함수에서 메세지를 뽑는 법도 있다
	}
	static String[] dataLoad(File f) {
		String str[]=null;
		try {
			FileReader fr = new FileReader(f);
			
			//데이터를 카운터
			int count = 0;
			String s;
			BufferedReader br = new BufferedReader(fr);
			while((s=br.readLine())!=null) {
				count++;
			}
			br.close();
			
			//배열을 셋팅
			str = new String[count];
			
			//읽고 데이터를 저장
			fr = new FileReader(f);
			br = new BufferedReader(fr); //새로 생성
			int w=0;
			while((s=br.readLine())!= null) {
				str[w] = s;
				w++;
			}
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

}
