package StatePattern;

public class TestGumball {
	public static void main(String[] args) {
		GumballMachine gm = new GumballMachine();
		gm.dispenseGumball();
		gm.ejectQuarter();
		gm.turnCrank();
		gm.insertQuarter();
		
		System.out.println("------------------------");
		
		gm.insertQuarter();
		gm.dispenseGumball();
		gm.ejectQuarter();
		
		System.out.println("------------------------");
		
		gm.insertQuarter();
		gm.turnCrank();
		
		System.out.println("------------------------");
		
		gm.insertQuarter();
		gm.ejectQuarter();
		gm.turnCrank();
		gm.dispenseGumball();
		
		System.out.println("------------------------");
		
		gm.insertQuarter();
		gm.turnCrank();
		gm.dispenseGumball();
		
		System.out.println("------------------------");
		
		gm.insertQuarter();
		gm.turnCrank();
		gm.dispenseGumball();
		
		System.out.println("------------------------");
		
		gm.insertQuarter();
		gm.turnCrank();
		gm.dispenseGumball();
		
		System.out.println("------------------------");
		
		gm.insertQuarter();
		gm.turnCrank();
		gm.dispenseGumball();
		gm.ejectQuarter();
		
	}
}
