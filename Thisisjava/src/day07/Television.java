package day07;

public class Television implements RemoteControl {
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("����  TV ����: "+this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute) {
			System.out.println("TV ���� ó���մϴ�.");
		}else {
			System.out.println("TV ���� �����մϴ�.");
		}
	}
	
	
}
