
public class Bun extends LeafDecorator {
	private String[] options;

	public Bun(String d) {
		super(d);
	}

	public void setOptions(String[] options) {
		this.options = options;
		for (String s : options) {
			if (s.equals("Gluten-Free Bun") || s.equals("Hawaiian Bun")) {
				price += 1.00;
			}
			if (s.equals("Pretzel Bun")) {
				price += 0.50;
			}
		}
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
