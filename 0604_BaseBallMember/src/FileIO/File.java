package FileIO;
import java.io.BufferedReader;
import java.io.FileReader;

import dao.MemberDao;
import dto.Human;

public class File  {
	public void dataWrite() {
		
	}
	
	
	public static MemberDao dataLoad() {
		String infoLine = "";
		String strAry[] = null;
		String infoSplit[]=null;

		int count = 0;
		java.io.File file = new java.io.File("d:/tmp/baseinfo.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while((infoLine = br.readLine())!=null)
				count++;
			br.close();
			int i = 0;
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			strAry = new String[count];
			while((infoLine = br.readLine())!= null) {
				strAry[i] = infoLine;
				i++;
			}
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		MemberDao mem = new MemberDao(count);
		for(int i = 0; i<count;i++) {
			String str = strAry[i];
			mem.splitStr(str, i);
		}
			
		return mem;
	}
}
