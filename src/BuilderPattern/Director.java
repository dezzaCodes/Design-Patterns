package BuilderPattern;

public class Director {
	public void constructSportsCar(Builder b) {
		b.setEngine(new Engine(25));
		b.setSeats(new Seat(4, "Carbon fibre"));
	}
	
	public void constructClassicCar(Builder b) {
		b.setEngine(new Engine(15));
		b.setSeats(new Seat(5, "Leather"));
	}
	
	public void constructCheapCar(Builder b) {
		b.setEngine(new Engine(15));
		b.setSeats(new Seat(5, "Cloth"));
	}
}