
public class EnoughMoneyState implements State {
	GumballMachine gumballMachine;
	
    public EnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
	
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
	
	public void insertNickel() {
		System.out.println("You can't insert another nickel");		
	}
	
	public void insertDime() {
		System.out.println("You can't insert another dime");
	}
	
	public void ejectQuarter() {
		System.out.println("Coins returned");
		gumballMachine.set_value(0);
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
