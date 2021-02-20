package AdapterPattern;

public class LightningToMicroUSBAdapter implements MicroUSBPhone {
	public LightningPhone lightningPhone;
	
	public LightningToMicroUSBAdapter(LightningPhone lightningPhone) {
		this.lightningPhone = lightningPhone;
	}

	@Override
	public void useMicroUSB() {
		System.out.println("MicroUSB connected");
		lightningPhone.useLightning();
	}

	@Override
	public void recharge() {
		lightningPhone.recharge();
		
	}
}
