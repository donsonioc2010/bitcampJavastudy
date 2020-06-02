package Tv2;

public class MyTv2 {
	boolean isPowerOn;
	int channel,volume;
	final int MAX_VOLUME = 100; //final이 붙으면 == 상수
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	private int preChannel;
	
	public void isPowerOn() {
		
	}
	public void gotoPrevChannel() {
		preChannel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
