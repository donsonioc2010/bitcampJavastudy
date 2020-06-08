package File_0605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileProc_0605 {
	private File file;
	
	public FileProc_0605(String filename) {
		file = new File("d:\\tmp\\"+filename+".txt");
	}
	
	public void createFile() {
		try {
			if(file.createNewFile()) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String[] loadData() {
		String datas[] = null;
		//data이ㅡ 갯수를 조사 -> 배열		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			//data의 갯수를 조사
			int count = 0;
			String str = "";
			while((str=br.readLine())!= null) {
				count++;
			}
			br.close();
			//datas를 할당
			datas = new String[count];
			
			//배열저장
			int w = 0;
			br = new BufferedReader(new FileReader(file));
			while((str = br.readLine())!=null) {
				datas[w]= str;
				w++;
			}
			br.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return datas;
	}
	public void saveData(String[] datas) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for(int i =0; i<datas.length;i++) {
				pw.println(datas[i]);
			}
			pw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
}
