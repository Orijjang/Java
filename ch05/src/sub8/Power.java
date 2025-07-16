package sub8;

public class Power implements Socket {

	private Bulb bulb;
	
	public Power(Bulb bulb) {
		this.bulb = bulb;
	}
	@Override
	public void switchOn() {
		bulb.bulb = bulb;
	}

	@Override
	public void switchOff() {
		bulb.bulb = bulb;
	}

}
