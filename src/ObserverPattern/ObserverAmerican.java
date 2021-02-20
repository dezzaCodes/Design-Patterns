package ObserverPattern;

public class ObserverAmerican implements Observer {

	private double windspeed;
	private double temperature;

	public ObserverAmerican() {
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
		this.temperature = (((Thermometer) t).temperature * 9/5) + 32;
		System.out.println("New temperature in Fahrenheit is " + this.temperature);
	}
	
	public void update(WindSpeed w) {
		this.windspeed = ((WindSpeed) w).windspeed / 1.609;
		System.out.println("New windspeed in miles/h is " + this.windspeed);
	}

}
