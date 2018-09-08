

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {		
		if (gumballMachine.get_model() == 1) {
			System.out.println("You inserted a quarter");
			gumballMachine.setState(gumballMachine.getHasQuarterState());
		} else if (gumballMachine.get_model() == 2) {
			System.out.println("You inserted a quarter");
			gumballMachine.setState(gumballMachine.getnoEnoughQuarterState());
		} else if (gumballMachine.get_model() == 3) {
			System.out.println("You inserted a quarter");
			gumballMachine.set_value(gumballMachine.get_value() + 25);
			gumballMachine.setState(gumballMachine.getnoEnoughMoneyState());
		}
		
	}
 
	public void insertNickel() {
		if (gumballMachine.get_model() != 3) {
			System.out.println("Machine does not accept this coin!");
			return;
		}
		System.out.println("You inserted a nickel");
		gumballMachine.set_value(gumballMachine.get_value() + 5);
		gumballMachine.setState(gumballMachine.getnoEnoughMoneyState());		
	}
	
	public void insertDime() {
		if (gumballMachine.get_model() != 3) {
			System.out.println("Machine does not accept this coin!");
			return;
		}
		System.out.println("You inserted a dime");
		gumballMachine.set_value(gumballMachine.get_value() + 10);
		gumballMachine.setState(gumballMachine.getnoEnoughMoneyState());
	}
	
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");		
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		if (gumballMachine.get_model() == 3) {
			return "waiting for coins";
		}
		return "waiting for quarter";
	}
}
