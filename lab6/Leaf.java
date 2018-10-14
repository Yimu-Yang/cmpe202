
public class Leaf implements Component {

	private String description;
	protected Double price;
	int priority;

	public Leaf(String d, Double p, int pr) {
		description = d;
		price = p;
		priority = pr;
		
	}

	public void addChild(Component c) {
		// no implementation
	}

	public void removeChild(Component c) {
		// no implementation
	}

	public Component getChild(int i) {
		// no implementation
		return null;
	}

	public void printReceipt() {
		System.out.println(description + "      " + price);
		
	}

	public void printPackingSlip() {
		System.out.println(description);	
	}

	public double getPrice() {
		return price;
	}
	
	public int getPriority() {
		return priority;
	}

}
