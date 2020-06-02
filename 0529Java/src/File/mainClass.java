package File;

import java.io.File;
import java.io.IOException;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Code -> logic(구현)
		 			기능적인부분 : file,database
		 			
		 	저장매체 :	파일,DB
		 			
		 			이름		나이		주소
		 			홍길동	24		서울시	->Write,Read	
		 	목적 : 데이터의 저장, 불러오기
		 	
		 	*.txt 최상위
		 	.jpg,.dll,.lib,.jar,.png 등등
		 	
		 	
		 	.dll : (Dynamic Link Library) - 동적파일
		 	.lib : 						  - 정적파일
		 */
		//파일목록
		/*
		File fdir = new File("C:\\");
		
		String filelist[] = fdir.list();
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}
		*/
		
		//파일, 폴더, 그외의 요소
		File fdir = new File("C:\\");
		File filelist[] = fdir.listFiles();
		for (int i = 0; i < filelist.length; i++) {
			if(filelist[i].isFile()) {
				System.out.println("[파일]"+filelist[i].getName());
			}else if(filelist[i].isDirectory()) {
				System.out.println("[폴더]"+filelist[i].getName());
			}else {	
				System.out.println("[?]"+filelist[i].getName());
			}
		}
		
		//파일 생성
		String fileStr = "d:\\tmp\\newfile.txt";
		File newfile = new File(fileStr);
		try {	
			if(newfile.createNewFile()) {
				System.out.println("파일생성 성공");
			}else {//같은명칭이 있을때 실패함
				System.out.println("파일 생성 실패");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일의 존재 여부
		if(newfile.exists()) {
			System.out.println("파일이 존재합니다");
		}else {
			System.out.println("파일이 존재하지 않습니다");
		}
		
		//파일삭제
		/*
		if(newfile.delete()) {
		
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
		*/
		
		
		//읽기가능?
		if(newfile.canRead()) {
			System.out.println("파일을 읽을수 있습니다");
		}else {
			System.out.println("파일을 읽을수 없습니다");
		}
		//읽기전용
		newfile.setReadOnly();
		
		//쓰기가능?
		if(newfile.canWrite()) {
			System.out.println("파일을 쓰기 가능합니다");
		}else {
			System.out.println("파일을 쓰기 불가능합니다");
		}
		
	}

}
