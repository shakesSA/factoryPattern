package servercode;

public class ShoeFactory {

	public ShoeFactory() {

	}

	public Shoe getShoeBrand(String brand) {

		if (brand.equalsIgnoreCase("nike")) {
			return new Nike();
		}
		if (brand.equalsIgnoreCase("jordan")) {
			return new Jordan();
		}
		if (brand.equalsIgnoreCase("chucktaylor")) {
			return new ChuckTaylor();
		}

		return null;
	}
}
