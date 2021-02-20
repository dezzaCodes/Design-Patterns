package ObserverPattern;

public class ObserverAustralian implements Observer {
	private double windspeed;
	private double temperature;

	public ObserverAustralian() {
		this.windspeed = 1;
		this.temperature = 1;
	}
	
	// method overloading is neater looking I guess
	@Override
	public void update(Subject s) {
		if (s instanceof Thermometer) {
			update((Thermometer)s);
		} else if (s instanceof WindSpeed) {
			update((WindSpeed)s);
		}
	}
	
	public void update(Thermometer t) {
		this.temperature = ((Thermometer) t).temperature;
		System.out.println("New temperature in Celcius is " + this.temperature);
	}
	
	public void update(WindSpeed w) {
		this.windspeed = ((WindSpeed) w).windspeed;
		System.out.println("New windspeed in km/h is " + this.windspeed);
	}
}
