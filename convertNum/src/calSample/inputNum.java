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
		System.out.print("�����Է�:");
	}
	public void numScan() {
		Scanner sc = new Scanner(System.in);
		decNum = sc.nextInt();
	}
	public void binaryNum() {
		System.out.print("2���� ��ȯ�� : "+Integer.toBinaryString(decNum));
	}
	public void octNum() {
		System.out.print("\t8���� ��ȯ�� : "+Integer.toOctalString(decNum));
	}
	public void decNum() {
		System.out.print("\t10���� �� : "+decNum);
	}
	public void hexNum() {
		System.out.print("\t16���� ��ȯ�� : "+Integer.toHexString(decNum));
		
	}
}
