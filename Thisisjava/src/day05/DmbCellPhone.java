package day05;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		//this.model = model;
		//this.color = color;
		super(model, color);
		this.channel = channel;
	}

}
