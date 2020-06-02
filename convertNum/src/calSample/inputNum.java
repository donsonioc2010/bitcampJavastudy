package calSample;

import java.util.Scanner;

public class inputNum {
	static int decNum;
	public void run() {
		numOut();
		numScan();
		binaryNum();
		octNum();
		decNum();
		hexNum();
		
	}
	public void numOut() {
		System.out.print("숫자입력:");
	}
	public void numScan() {
		Scanner sc = new Scanner(System.in);
		decNum = sc.nextInt();
	}
	public void binaryNum() {
		System.out.print("2진수 변환값 : "+Integer.toBinaryString(decNum));
	}
	public void octNum() {
		System.out.print("\t8진수 변환값 : "+Integer.toOctalString(decNum));
	}
	public void decNum() {
		System.out.print("\t10진수 값 : "+decNum);
	}
	public void hexNum() {
		System.out.print("\t16진수 변환값 : "+Integer.toHexString(decNum));
		
	}
}
