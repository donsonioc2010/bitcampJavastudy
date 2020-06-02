package Premain;

import PreTv2.PreMyTv2;

public class Exercise3 {

	public static void main(String[] args) {
		PreMyTv2 t = new PreMyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}

}
