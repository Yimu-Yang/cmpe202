import java.util.List;

public class InorderPrint implements PrintingStrategy {

	@Override
	public void print(List<Component> list) {
		// TODO Auto-generated method stub
		for (Component c : list) {
			System.out.print("   ");
			c.printPackingSlip();
		}
	}

}
