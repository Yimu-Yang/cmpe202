

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		GumballMachine2 gumballMachine2 = new GumballMachine2(5);
		GumballMachine3 gumballMachine3 = new GumballMachine3(5);

		// Testing gumball machine model 1
		System.out.println("Testing gumball machine model 1");
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter( 15 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		// Testing gumball machine model 2
		System.out.println("\n\n");
		System.out.println("Testing gumball machine model 2");
		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.insertQuarter( 35 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		
		// Testing gumball machine model 3
		System.out.println("\n\n");
		System.out.println("Testing gumball machine model 3");
		System.out.println(gumballMachine3);

		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();


		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.insertQuarter( 100 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		
		gumballMachine3.insertQuarter( 5 );
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		System.out.println(gumballMachine3);
		
	}
}
