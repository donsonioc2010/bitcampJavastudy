package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import dto.StudentDto;

public class StudentFile {
	private File file;
	
	public StudentFile() {
		file = new File("d:\\tmp\\Student.txt");
	}
	
	public void createFile() {
		try {
			if(file.createNewFile()) {
				System.out.println("파일이 생성되었습니다");
			}else {
				System.out.println("파일이 존재합니다");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ArrayList<String> loadData(){
		createFile();
		ArrayList<String>datas = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String str = "";
			while((str = br.readLine()) != null) {
				datas.add(str);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return datas;
	}
	public void saveData(ArrayList<StudentDto> datas) {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for(int i = 0;i<datas.size();i++) {
				pw.println(datas.get(i).SaveString());
			}
			pw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
