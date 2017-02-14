package servercode;

public class CarDetailsView {
	public CarDetailsView() {

	}

	public void viewCarDetails(String make, String model, float price) {

		System.out.println("Car Details retrieved: ");
		System.out.println("Car Make: " + make);
		System.out.println("Car Model: " + model);
		System.out.println("Car Price: " + price);
	}

}
