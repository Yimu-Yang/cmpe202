/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	
	CreditCardNumState noDigitState;
	CreditCardNumState oneDigitState;
	CreditCardNumState twoDigitState;
	CreditCardNumState threeDigitState;
	
	CreditCardNumState current;

	public CreditCardNum() {
		noDigitState = new NoDigitState(this);
		oneDigitState = new OneDigitState(this);
		twoDigitState = new TwoDigitState(this);
		threeDigitState = new ThreeDigitState(this);
		
		current = noDigitState;
	}
	
	public void setNoDigitState() {
		current = noDigitState;
	}
	
	public void setOneDigitState() {
		current = oneDigitState;
	}
	
	public void setTwoDigitState() {
		current = twoDigitState;
	}
	
	public void setThreeDigitState() {
		current = threeDigitState;
	}

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[XXXX XXXX XXXX XXXX]" + "  " ;
		else
			return "[" + number + "]" + "  " ; //changed
	}	

	public void key(String ch, int cnt) {
//		if ( cnt <= 16 )
//			number += ch ;
//		else if ( nextHandler != null )
//			nextHandler.key(ch, cnt) ;
		current.key(ch, cnt);
	}	

	public String getNumber() {
		return number;
	}
	
	public void setNumber(String str) {
		number = str;
	}

	public IKeyEventHandler getNextHandler() {
		return nextHandler;
	}
	
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}