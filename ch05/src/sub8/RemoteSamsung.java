package sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Samgsung poweron...");
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("Samgsung poweroff...");
	}

	@Override
	public void chUp() {
		// TODO Auto-generated method stub
		System.out.println("Samgsung chUp...");
	}

	@Override
	public void chDown() {
		// TODO Auto-generated method stub
		System.out.println("Samgsung ChDown...");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("Samgsung soundUp...");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("Samgsung soundDown...");
	}

}
