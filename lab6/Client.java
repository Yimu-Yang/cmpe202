import java.text.DecimalFormat;
import java.util.*;

public class Client {

	public static void order() {
		List<Component> theOrder = BuildOrder.getOrder();
		for (Component c : theOrder) {
			c.printReceipt();
			System.out.println();
		}
		
		DecimalFormat format = new DecimalFormat("0.00");
		System.out.println("Subtotal: " + format.format(BuildOrder.calculateTotal(theOrder)));
		System.out.println();
		
		for (Component c : theOrder) {
			c.printPackingSlip();
			System.out.println();
		}
	}

	public static void main(String args[]) {
		order();
	}
}
