package chapter07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int preChannel; //[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	/**
	 * @return the isPowerOn
	 */
	public boolean isPowerOn() {
		return isPowerOn;
	}
	/**
	 * @param isPowerOn the isPowerOn to set
	 */
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	/**
	 * @return the channel
	 */
	public int getChannel() {
		return channel;
	}
	/**
	 * @param channel the channel to set
	 */
	
	public void setChannel(int channel) { //이전 채널을 저장해두어야 한다. 
		this.preChannel = this.channel;
		this.channel = channel;
	}
	
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}
	/**
	 * @return the mAX_VOLUME
	 */
	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}
	/**
	 * @return the mIN_VOLUME
	 */
	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}
	/**
	 * @return the mAX_CHANNEL
	 */
	public int getMAX_CHANNEL() {
		return MAX_CHANNEL;
	}
	/**
	 * @return the mIN_CHANNEL
	 */
	public int getMIN_CHANNEL() {
		return MIN_CHANNEL;
	}
	/**
	 * @return the preChannel
	 */
	public int getPreChannel() {
		return preChannel;
	}
	/**
	 * @param preChannel the preChannel to set
	//getter,setter

	 */
	public void setPreChannel(int preChannel) {
		this.preChannel = preChannel;
	}
	
	public void gotoPrevChannel() {   //이전 채널 과 현재 채널을 서로서로 바꿔주는 함수
		int tempChannel = this.channel;
		this.channel = this.preChannel;
		this.preChannel = tempChannel;
		
	}
}
