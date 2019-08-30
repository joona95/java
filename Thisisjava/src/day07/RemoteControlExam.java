package day07;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(11);
		rc.setMute(false);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-5);
		rc.setMute(true);
		rc.turnOff();
	}

}
