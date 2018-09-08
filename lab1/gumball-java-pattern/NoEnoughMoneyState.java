
public class NoEnoughMoneyState implements State {
	GumballMachine gumballMachine;
	
    public NoEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.set_value(gumballMachine.get_value() + 25);
		if (gumballMachine.get_value() >= 50) {
			gumballMachine.setState(gumballMachine.getEnoughMoneyState());
		}
	}
	
	public void insertNickel() {
		System.out.println("You inserted a nickel");
		gumballMachine.set_value(gumballMachine.get_value() + 5);
		if (gumballMachine.get_value() >= 50) {
			gumballMachine.setState(gumballMachine.getEnoughMoneyState());
		}	
	}
	
	public void insertDime() {
		System.out.println("You inserted a dime");
		gumballMachine.set_value(gumballMachine.get_value() + 10);
		if (gumballMachine.get_value() >= 50) {
			gumballMachine.setState(gumballMachine.getEnoughMoneyState());
		}	
	}
	
	public void ejectQuarter() {
		System.out.println("Coins ejected!");
		gumballMachine.set_value(0);
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	public void turnCrank() {
		System.out.println("More coins required!");
	}
	
	public void dispense() {
		System.out.println("You need to pay first");
	}
	
	public String toString() {
		return "waiting for coins";
	}
}
