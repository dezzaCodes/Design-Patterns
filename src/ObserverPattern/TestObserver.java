package ObserverPattern;

public class TestObserver {
	public static void main(String[] args) {
		Thermometer t = new Thermometer();
		WindSpeed w = new WindSpeed();
		
		Observer oz = new ObserverAustralian();
		Observer us = new ObserverAmerican();
		
		t.addObserver(oz);
		t.addObserver(us);
		w.addObserver(us);
		
		System.out.println("--------------------------");
		
		t.updateTemperature(32.7);
		
		System.out.println("--------------------------");
		
		t.removeObserver(oz);
		t.updateTemperature(-1.2);
		
		System.out.println("--------------------------");
		
		w.updateWindSpeed(4);
		
	}
}
