package servercode;

public class TestShoeFactory {

	public TestShoeFactory() {

	}

	public static void main(String[] args) {

		ShoeFactory shoeFactory = new ShoeFactory();

		Shoe shoe1 = shoeFactory.getShoeBrand("nike");

		System.out.println("Shoe - Nike");
		shoe1.getPrice();

		Shoe shoe2 = shoeFactory.getShoeBrand("Chucktaylor");

		System.out.println("Shoe - Chuck Taylor");
		shoe2.getPrice();

		Shoe shoe3 = shoeFactory.getShoeBrand("jordan");

		System.out.println("Shoe - Jordans");
		shoe3.getPrice();
	}
}
