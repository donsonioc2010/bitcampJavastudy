package File_0605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileProc_0608 {
	private File file;
	
	public FileProc_0608(String filename) {
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
	public ArrayList<String> loadData() {
		ArrayList<String> datas = new ArrayList<String>();
		//data이ㅡ 갯수를 조사 -> 배열		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String str = "";
			while((str=br.readLine())!= null) {
				datas.add(str);
			}
			br.close();
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return datas;
	}
	public void saveData(ArrayList<String> datas) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for(int i =0; i<datas.size();i++) {
				pw.println(datas.get(i));
			}
			pw.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
}
