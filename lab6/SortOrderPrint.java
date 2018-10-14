import java.util.List;

public class SortOrderPrint implements PrintingStrategy {
	@Override
	public void print(List<Component> list) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getPriority() > list.get(j + 1).getPriority()) {
					Component temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		
		for (Component c : list) {
			System.out.print("   ");
			c.printPackingSlip();
		}
	}
	
}
