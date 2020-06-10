package File;

import java.io.*;
import java.util.ArrayList;

import Singleton.Singleton;
import dto.Human;
import dto.*;
public class fileLoad {
	File file;
	public fileLoad() {
		file = new File("d:\\tmp\\baseball.txt");
		createFile();
		Singleton single = Singleton.getInstance();
		ArrayList<String> datas = inputData();
		StringSplit(datas);
	}
	public void createFile() {
		try {
			if(file.createNewFile()) {
				System.out.println("파일이 없습니다 생성에 성공하였습니다");
			}else {
				System.out.println("파일이 존재합니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public ArrayList<String> inputData(){
		ArrayList<String> datas = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			while((str = br.readLine())!= null) {
				datas.add(str);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return datas;
	}
	public void StringSplit(ArrayList<String> datas) {
		for(int i = 0; i<datas.size();i++) {
			String data[] = datas.get(i).split("-");
			addListData(data);
		}
	}
	public void addListData(String[] data) {
		Singleton single = Singleton.getInstance();
		int title = Integer.parseInt(data[0]);
		Human h = null;
		if(title<2000) {
			h=new Pitcher(Integer.parseInt(data[0]),
									data[1],
									Integer.parseInt(data[2]),
									Double.parseDouble(data[3]),
									Integer.parseInt(data[4]),
									Integer.parseInt(data[5]),
									Double.parseDouble(data[6]));
		}else {
			h=new Batter(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]),Integer.parseInt(data[4]),
									Integer.parseInt(data[5]),
									Double.parseDouble(data[6]));
		}
		if(title>2000)
			title = title-1000;
		if(single.memNum <title)
			single.memNum = title+1;
		single.h.add(h);
	}

}
