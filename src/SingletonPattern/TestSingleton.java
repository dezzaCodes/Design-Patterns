package SingletonPattern;

public class TestSingleton {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance("POOPY");
		s1.getValue();
		
		System.out.println("-------------------------");
		
		Singleton s2 = Singleton.getInstance("WEEWEE");
		s2.getValue();
	}
}
