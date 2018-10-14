
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Composite implements Component {

	protected ArrayList<Component> components = new ArrayList<Component>();
	protected String description;
	protected Double price;
	protected PrintingStrategy strategy;
	
	public Composite(String d) {
		description = d;
		price = 0.0;
		strategy = null;
	}

	public void printReceipt() {
		DecimalFormat format = new DecimalFormat("0.00");
		System.out.println(description + "      " + format.format(price));
		strategy = new InorderPrint();
		strategy.print(components);
	}

	public void printPackingSlip() {
		System.out.println(description);
		strategy = new SortOrderPrint();
		strategy.print(components);
	}
	
	public void addChild(Component c) {
		components.add(c);
		price += c.getPrice();
	}

	public void removeChild(Component c) {
		components.remove(c);
		price -= c.getPrice();
	}

	public Component getChild(int i) {
		return components.get(i);
	}

	public double getPrice() {
		return price;
	}

	public int getPriority() {
		return -1;
	}

}
