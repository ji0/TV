public class TV {

	int channel;
	int volume;
	boolean power;

	public void channelUp() {
		channel++;
	}

	public void channelDown() {
		channel--;
	}

	public void volumeUp() {
		volume++;
	}

	public void volumeDown() {
		volume--;
	}

	public void powerOn() {
		power = true;
	}

	public void powerOff() {
		power = false;
	}

	public void setChannel(int x) {
		channel = x;
	}

	public int getChannel() {
		return channel;
	}
	

	public boolean isPower() {
		return power;
	}

	public int getVolume() {
		return volume;
	}

}
