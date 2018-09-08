

public class Main {

	public static void main(String[] args) {
		// Test Gumball machine model 1
		System.out.println("Testing Model 1");
		GumballMachine gumballMachine = new GumballMachine1(5);

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.insertNickel();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.refill(6);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		
		System.out.println(gumballMachine);
		
		// Test Gumball machine model 2
		System.out.println("\n\nTesting Model 2");
		
		GumballMachine gumballMachine2 = new GumballMachine2(5);
		
		System.out.println(gumballMachine2);
		
		gumballMachine2.insertQuarter();
		gumballMachine2.insertQuarter();
		gumballMachine2.ejectQuarter();
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter();
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		
		// Test Gumball machine model 3
		System.out.println("\n\nTesting Model 3");
	
		GumballMachine gumballMachine3 = new GumballMachine3(5);
		
		System.out.println(gumballMachine3);
		
		gumballMachine3.insertQuarter();
		gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.insertNickel();
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter();
		gumballMachine3.turnCrank();
		gumballMachine3.insertNickel();
		gumballMachine3.insertNickel();
		gumballMachine3.insertNickel();
		gumballMachine3.insertNickel();
		gumballMachine3.insertDime();
		gumballMachine3.insertDime();
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);
		
		gumballMachine3.insertNickel();
		gumballMachine3.insertNickel();
		gumballMachine3.insertDime();
		gumballMachine3.insertQuarter();
		gumballMachine3.insertQuarter();
		gumballMachine3.ejectQuarter();
		gumballMachine3.turnCrank();
		
		System.out.println(gumballMachine3);
		
	}
}
