
import java.util.ArrayList;

public class Composite implements Component {

	protected ArrayList<Component> components = new ArrayList<Component>();
	protected String description;
	protected Double price;
	
	public Composite(String d) {
		description = d;
		price = 0.0;
	}

	public void printReceipt() {
		System.out.println(description + "      " + price);
		for (Component obj : components) {
			System.out.print("   ");
			obj.printPackingSlip();
		}
	}

	public void printPackingSlip() {
		System.out.println(description);
		for (Component obj : components) {
			System.out.print("   ");
			obj.printPackingSlip();
		}
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

}
