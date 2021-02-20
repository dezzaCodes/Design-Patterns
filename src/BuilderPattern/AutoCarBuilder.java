package BuilderPattern;

public class AutoCarBuilder implements Builder {

	public Seat seat;
	public Engine engine;
	
	public void setSeats(Seat s) {
		this.seat = s;
	}

	public void setEngine(Engine e) {
		this.engine = e;
	}
	
	public AutoCar getResult() {
        return new AutoCar(seat, engine);
    }
}