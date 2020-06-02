package main;

import MyTv2_Answer.MyTv2_Answer;

public class Work2_Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2_Answer t = new MyTv2_Answer();
		/*
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
		*/
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
