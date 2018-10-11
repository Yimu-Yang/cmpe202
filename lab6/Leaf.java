
public class Leaf implements Component {

	private String description;
	protected Double price;

	public Leaf(String d, Double p) {
		description = d;
		price = p;
	}

	public Leaf(String d) {
		description = d;
		price = 0.0;
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

}
