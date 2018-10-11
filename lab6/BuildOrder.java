import java.util.*;

public class BuildOrder {

	public static List<Component> getOrder() {

		List<Component> list = new ArrayList<>();

		Composite burger = new Composite("LBB");
		burger.addChild(new Leaf("LETTUCE", 1.10));
		burger.addChild(new Leaf("TOMATO", 1.20));
		burger.addChild(new Leaf("->|G ONION", 1.00));
		burger.addChild(new Leaf("->|JALA Grilled", 1.11));
		burger.addChild(new Leaf("{{{{ BACON }}}}", 1.18));

		Leaf drink = new Leaf("LTL CAJ", 2.79);

		list.add(burger);
		list.add(drink);

		return list;
	}

	public static double calculateTotal(List<Component> list) {
		double res = 0.0;
		for (Component c : list) {
			res += c.getPrice();
		}
		return res;
	}

}
