package AdapterPattern;

public class TestAdapter {
	
	static void rechargeMicroUSBPhone(MicroUSBPhone m) {
		m.useMicroUSB();
		m.recharge();
	}
	
	static void rechargeLightningPhone(LightningPhone l) {
		l.useLightning();
		l.recharge();
	}
	
	public static void main(String[] args) {
		LightningPhone a = new iPhone();
		MicroUSBPhone b = new Android();
		
		rechargeMicroUSBPhone(b);
		
		System.out.println("--------------------------");
		
		rechargeLightningPhone(a);
		
		System.out.println("--------------------------");
		
		rechargeMicroUSBPhone (new LightningToMicroUSBAdapter(a));
		
		System.out.println("--------------------------");
		
		rechargeLightningPhone(new MicroUSBToLightningAdapter(b));
	}
}
