package AdapterPattern;

public class iPhone implements LightningPhone {

	public boolean connector = false;
	
	@Override
	public void useLightning() {
		System.out.println("Lightning plugged in");
		connector = true;
	}

	@Override
	public void recharge() {
		if (connector) {
			System.out.println("Charging");
		} else {
			System.out.println("Connect to lightning first");
		}
	}

}
