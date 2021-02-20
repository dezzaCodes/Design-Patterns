package BuilderPattern;

public class AutoCar {
	public Seat seats;
	public Engine engine;

    public AutoCar(Seat seat, Engine engine) {
        this.seats = seat;
        this.engine = engine;
    }
}