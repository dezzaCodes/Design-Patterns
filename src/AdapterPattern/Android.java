package AdapterPattern;

public class Android implements MicroUSBPhone {

	public boolean connector = false;
	
	@Override
	public void useMicroUSB() {
		System.out.println("MicroUSB plugged in");
		connector = true;
	}

	@Override
	public void recharge() {
		if (connector) {
			System.out.println("Charging");
		} else {
			System.out.println("Connect to MicroUSB first");
		}
	}


}
