
public class NoEnoughQuarterState implements State {
	GumballMachine gumballMachine;
	
    public NoEnoughQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getEnoughQuarterState());
	}
	
	public void insertNickel() {
		System.out.println("This mechine does not accept nickel");
	}
	
	public void insertDime() {
		System.out.println("This mechine does not accept dime");
	}
	
	public void ejectQuarter() {
		System.out.println("Quarter ejected!");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	public void turnCrank() {
		System.out.println("One more quarter required!");
	}
	
	public void dispense() {
		System.out.println("You need to pay first");
	}
	
	public String toString() {
		return "waiting for quarter";
	}
}
