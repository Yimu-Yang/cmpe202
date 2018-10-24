
public class TwoDigitState implements CreditCardNumState {
	CreditCardNum creditCardNum;

	public TwoDigitState(CreditCardNum ccn) {
		creditCardNum = ccn;
	}

	public void key(String ch, int cnt) {
		if (cnt <= 16) {
			if (ch.equals("x")) {
				creditCardNum.setNumber(creditCardNum.getNumber().substring(0, creditCardNum.getNumber().length() - 1));
				creditCardNum.setOneDigitState();
			} else {
				creditCardNum.setNumber(creditCardNum.getNumber() + ch);
				creditCardNum.setThreeDigitState();
			}
		} else if (creditCardNum.getNextHandler() != null) {
			creditCardNum.getNextHandler().key(ch, cnt);
		}
	}
}
