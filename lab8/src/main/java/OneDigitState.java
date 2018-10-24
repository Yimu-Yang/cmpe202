
public class OneDigitState implements CreditCardNumState {
	CreditCardNum creditCardNum;

	public OneDigitState(CreditCardNum ccn) {
		creditCardNum = ccn;
	}

	public void key(String ch, int cnt) {
		if (cnt <= 16) {
			if (ch.equals("x")) {
				creditCardNum.setNumber(creditCardNum.getNumber().substring(0, creditCardNum.getNumber().length() - 1));
				creditCardNum.setNoDigitState();
			} else {
				creditCardNum.setNumber(creditCardNum.getNumber() + ch);
				creditCardNum.setTwoDigitState();
			}
		} else if (creditCardNum.getNextHandler() != null) {
			creditCardNum.getNextHandler().key(ch, cnt);
		}
	}
}
