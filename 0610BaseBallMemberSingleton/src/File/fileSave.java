package File;

import java.io.*;
import dto.*;
import Singleton.Singleton;

public class fileSave {
	Singleton single = Singleton.getInstance();
	private File file;
	public fileSave() {
		file = new File("d:\\tmp\\baseball.txt");
		saveData();
	}

	public void saveData() {
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			
			for(int i = 0; i<single.h.size();i++) {
				if(single.h.get(i) instanceof Pitcher)
					pw.println(((Pitcher)single.h.get(i)).toString());
				else
					pw.println(((Batter)single.h.get(i)).toString());
			}
			pw.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
