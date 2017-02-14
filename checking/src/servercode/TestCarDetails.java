package servercode;

public class TestCarDetails {
	public TestCarDetails() {
	}

	public static void main(String[] args) {

		Car carModel = setCarDetails();

		CarDetailsView carDetailsView = new CarDetailsView();

		CarDetailsController carDetailsController = new CarDetailsController(
				carDetailsView, carModel);

		carDetailsController.updateCarDetails();
		carDetailsController.setCarModelMake("TOYOTA");
		carDetailsController.setCarModel("CONQUEST");
		carDetailsController.setCarPrice(1);
		carDetailsController.updateCarDetails();

	}

	public static Car setCarDetails() {
		Car car = new Car();
		car.setMake("HONDA");
		car.setModel("ACCORD");
		car.setPrice(10000);
		return car;
	}
}
