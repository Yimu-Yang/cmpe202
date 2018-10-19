
public class BuildOrder {

	public static Component getOrder() {
		Composite order = new Composite("Order");

		CustomBurger customBurger = new CustomBurger("Build Your Own Burger");

		Burger b = new Burger("Burger Options");
		String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" };
		b.setOptions(bo);

		Cheese c = new Cheese("Cheese Options");
		String[] co = { "Yellow American", "Spicy Jalapeno Jack" };
		c.setOptions(co);
		c.wrapDecorator(b);

		PremiumCheese pc = new PremiumCheese("PremiumCheese Options");
		String[] pco = { "Danish Blue Cheese" };
		pc.setOptions(pco);
		pc.wrapDecorator(c);

		Toppings t = new Toppings("Toppings Options");
		String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" };
		t.setOptions(to);
		t.wrapDecorator(pc);

		Premium p = new Premium("Premium Options");
		String[] po = { "Marinated Tomatoes" };
		p.setOptions(po);
		p.wrapDecorator(t);

		Bun bu = new Bun("Bun Options");
		String[] buo = { "Ciabatta (Vegan)" };
		bu.setOptions(buo);
		bu.wrapDecorator(p);

		// 1 sauce free, extra +.5
		Sauce s = new Sauce("Sauce Options");
		String[] so = { "Mayonnase", "Thai Peanut Sauce" };
		s.setOptions(so);
		s.wrapDecorator(bu);

		Side sd = new Side("Side Options");
		String[] sdo = { "Shoestring Fries" };
		sd.setOptions(sdo);
		sd.wrapDecorator(s);

		customBurger.setDecorator(sd);
		customBurger.addChild(b);
		customBurger.addChild(c);
		customBurger.addChild(pc);
		customBurger.addChild(s);
		customBurger.addChild(t);
		customBurger.addChild(p);
		customBurger.addChild(bu);
		customBurger.addChild(sd);

		order.addChild(customBurger);
		return order;
	}

	public static Component getOrder2() {
		Composite order = new Composite("Order");

		CustomBurger customBurger = new CustomBurger("Build Your Own Burger");

		Burger b = new Burger("Burger Options");
		String[] bo = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" };
		b.setOptions(bo);

		Cheese c = new Cheese("Cheese Options");
		String[] co = { "Smoked Gouda", "Greek Feta" };
		c.setOptions(co);
		c.wrapDecorator(b);

		PremiumCheese pc = new PremiumCheese("PremiumCheese Options");
		String[] pco = { "Fresh Mozzarella" };
		pc.setOptions(pco);
		pc.wrapDecorator(c);

		Toppings t = new Toppings("Toppings Options");
		String[] to = { "Crushed Peanuts"};
		t.setOptions(to);
		t.wrapDecorator(pc);

		Premium p = new Premium("Premium Options");
		String[] po = { "Sunny Side Up Egg*", "Marinated Tomatoes" };
		p.setOptions(po);
		p.wrapDecorator(t);

		Bun bu = new Bun("Bun Options");
		String[] buo = { "Gluten-Free Bun" };
		bu.setOptions(buo);
		bu.wrapDecorator(p);

		// 1 sauce free, extra +.5
		Sauce s = new Sauce("Sauce Options");
		String[] so = { "Habanero Salsa" };
		s.setOptions(so);
		s.wrapDecorator(bu);

		Side sd = new Side("Side Options");
		String[] sdo = { "Shoestring Fries" };
		sd.setOptions(sdo);
		sd.wrapDecorator(s);

		customBurger.setDecorator(sd);
		customBurger.addChild(b);
		customBurger.addChild(c);
		customBurger.addChild(pc);
		customBurger.addChild(s);
		customBurger.addChild(t);
		customBurger.addChild(p);
		customBurger.addChild(bu);
		customBurger.addChild(sd);

		order.addChild(customBurger);
		return order;
	}

}

/*
 * 
 * Counter Burger Menu: https://thecounterburger.emn8.com/?store=Times%20Square
 * 
 */