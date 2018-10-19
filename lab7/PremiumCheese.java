
public class PremiumCheese extends LeafDecorator {

	private String[] options;

	public PremiumCheese(String d) {
		super(d);
	}

	public void setOptions(String[] options) {
		this.options = options;
		price += 1.50 * options.length;
	}

	public String getDescription() {
		String desc = "   ";
		for (int i = 0; i < options.length; i++) {
			if (i > 0)
				desc += " + " + options[i];
			else
				desc = options[i];
		}
		return desc;
	}

}
