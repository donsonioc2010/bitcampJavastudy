package FileWriteClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mainClass {

	public static void main(String[] args) throws IOException {
		//file write
		File file = new File("d:/tmp/test.txt");
		
		//한문자씩 Write
		/*
		FileWriter fw = new FileWriter(file);//(file,false)
		fw.write("안녕하세요"+"\n");
		fw.close();
		*/
		
		//추가쓰기
		/*
		FileWriter fw = new FileWriter(file,true);
		fw.write("건강하세요"+"\n");
		fw.close();
		*/
		
		//문장으로쓰기 새로
		/*
		FileWriter fwriter = new FileWriter(file);//파일포인터설정
		BufferedWriter bw = new BufferedWriter(fwriter); //char->str역할
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕"+"\n");
		pw.println("하이하이");
		pw.println("건강하세요");
		
		pw.close(); //안하면 작성안됨
		*/
		//문장쓰기 추가쓰기
		FileWriter fwriter = new FileWriter(file,true);//파일포인터설정
		BufferedWriter bw = new BufferedWriter(fwriter); //char->str역할
		PrintWriter pw = new PrintWriter(bw);
		
		pw.print("안녕"+"\n");
		pw.println("하이하이");
		pw.println("건강하세요");
		
		pw.close(); //안하면 작성안됨
		
	}

}
