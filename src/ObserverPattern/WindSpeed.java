package ObserverPattern;

import java.util.ArrayList;

public class WindSpeed implements Subject {
	
	// 1 - M relationship
	ArrayList<Observer> children = new ArrayList<>();
	public double windspeed;
	
	public WindSpeed() {
		this.windspeed = 0;
	}
	
	// make sure to update subscribers when a change occurs
	public void updateWindSpeed(double i) {
		this.windspeed = i;
		notifyObservers();
	}
	
	/**
	 *  loose coupling, the subject knows nothing about the
	 *  observer except that it implements the observer
	 *  interface
	 */
	public void notifyObservers() {
		for (Observer o : children) {
			o.update(this);
		}
	}
	
	// can dynamically add and remove observers
	@Override
	public void addObserver(Observer o) {
		children.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		children.remove(o);
	}
}
