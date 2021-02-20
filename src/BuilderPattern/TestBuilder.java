package BuilderPattern;

public class TestBuilder {
	public static void main(String[] args) {
		Director d = new Director();
		AutoCarBuilder auto = new AutoCarBuilder();
		ManualCarBuilder man = new ManualCarBuilder();
		
		d.constructSportsCar(man);
		ManualCar c = man.getResult();
		
		System.out.println(c.getClass().getName());
		System.out.println(c.seats.material);
		
		System.out.println("------------------------------");
		
		d.constructClassicCar(auto);
		AutoCar a = auto.getResult();
		
		System.out.println(a.getClass().getName());
		System.out.println(a.seats.material);
		
		System.out.println("------------------------------");
		
		d.constructCheapCar(auto);
		AutoCar q = auto.getResult();
		
		System.out.println(q.getClass().getName());
		System.out.println(q.seats.material);
		
	}
	
}