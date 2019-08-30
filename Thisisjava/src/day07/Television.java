package day07;

public class Television implements RemoteControl {
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
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
		System.out.println("현재  TV 볼륨: "+this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute) {
			System.out.println("TV 무음 처리합니다.");
		}else {
			System.out.println("TV 무음 해제합니다.");
		}
	}
	
	
}
