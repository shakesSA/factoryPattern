package servercode;

public class CarDetailsController {

	Car model;
	CarDetailsView view;

	public CarDetailsController() {

	}

	public CarDetailsController(CarDetailsView view, Car model) {
		this.model = model;
		this.view = view;

	}

	public void setCarModelMake(String make) {
		model.setMake(make);
	}

	public void setCarPrice(float price) {
		model.setPrice(price);
	}

	public void setCarModel(String carModel) {
		model.setModel(carModel);
	}

	public void updateCarDetails() {

		view.viewCarDetails(model.getMake(), model.getModel(), model.getPrice());

	}

}
