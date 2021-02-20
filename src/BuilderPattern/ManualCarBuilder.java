package BuilderPattern;

public class ManualCarBuilder implements Builder {

	public Seat seat;
	public Engine engine;
	
	
	@Override
	public void setSeats(Seat s) {
		this.seat = s;
	}

	@Override
	public void setEngine(Engine e) {
		this.engine = e;
	}

	public ManualCar getResult() {
        return new ManualCar(seat, engine);
    }
	
}
