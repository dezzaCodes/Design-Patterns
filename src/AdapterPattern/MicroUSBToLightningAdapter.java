package AdapterPattern;

public class MicroUSBToLightningAdapter implements LightningPhone {

	MicroUSBPhone m;
	
	public MicroUSBToLightningAdapter(MicroUSBPhone m) {
		this.m = m;
	}
	
	@Override
	public void useLightning() {
		System.out.println("Using lightning");
		m.useMicroUSB();
	}

	@Override
	public void recharge() {
		m.recharge();
	}

}
