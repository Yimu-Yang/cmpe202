
public class EnoughQuarterState implements State {
	GumballMachine gumballMachine;
	
    public EnoughQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
	
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
	
	public void insertNickel() {
		System.out.println("This mechine does not accept nickel");
	}
	
	public void insertDime() {
		System.out.println("This mechine does not accept dime");
	}
	
	public void ejectQuarter() {
		System.out.println("Quarters returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}
	
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
	
	public String toString() {
		return "waiting for turn of crank";
	}
	
}
