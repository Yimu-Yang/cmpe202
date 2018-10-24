
public class NoDigitState implements CreditCardNumState {

	CreditCardNum creditCardNum;

	public NoDigitState(CreditCardNum ccn) {
		creditCardNum = ccn;
	}

	public void key(String ch, int cnt) {
		if (cnt <= 16) {
			if (ch.equals("x")) {
				if (creditCardNum.getNumber().length() == 19) {
					creditCardNum.setNumber(creditCardNum.getNumber().substring(0, creditCardNum.getNumber().length() - 1));
					creditCardNum.setThreeDigitState();
				} else {
					creditCardNum.setNumber(creditCardNum.getNumber().substring(0, creditCardNum.getNumber().length() - 2));
					creditCardNum.setThreeDigitState();
				}
			} else {
				creditCardNum.setNumber(creditCardNum.getNumber() + ch);
				creditCardNum.setOneDigitState();
			}
		} else if (creditCardNum.getNextHandler() != null) {
			creditCardNum.getNextHandler().key(ch, cnt);
		}
	}

}
