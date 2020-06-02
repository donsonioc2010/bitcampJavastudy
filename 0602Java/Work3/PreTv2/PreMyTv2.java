package PreTv2;

public class PreMyTv2 {
	boolean isPowerOn;
	int channel=0,volume;
	final int MAX_VOLUME = 100; //final이 붙으면 == 상수
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	private int preChannel;
	
	public void isPowerOn() {
		
	}
	public void gotoPrevChannel() {
		int temp = this.channel;
		this.channel = this.preChannel;
		this.preChannel = temp;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		preChannel = this.channel;
		this.channel = channel;
		
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}
