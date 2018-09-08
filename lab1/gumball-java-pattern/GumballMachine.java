

public abstract class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State noEnoughQuarterState;
	State enoughQuarterState;
	
	State noEnoughMoneyState;
	State enoughMoneyState;
 
	State state = soldOutState;
	int count = 0;
	int model;
	int value;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		noEnoughQuarterState = new NoEnoughQuarterState(this);
		enoughQuarterState = new EnoughQuarterState(this);
		noEnoughMoneyState = new NoEnoughMoneyState(this);
		enoughMoneyState = new EnoughMoneyState(this);
		
		this.count = numberGumballs;
		
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void insertDime() {
		state.insertDime();
	}
	
	public void insertNickel() {
		state.insertNickel();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    public State getEnoughQuarterState() {
        return enoughQuarterState;
    }
    
    public State getnoEnoughQuarterState() {
        return noEnoughQuarterState;
    }
    
    public State getEnoughMoneyState() {
        return enoughMoneyState;
    }
    
    public State getnoEnoughMoneyState() {
        return noEnoughMoneyState;
    }
    
    public int get_model() {
    	return model;
    }
    
    public int get_value() {
    	return value;	
    }
    
    public void set_value(int v) {
    	value = v;
    }
    
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
