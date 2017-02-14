package servercode;

public class MedalFactory {

	public MedalFactory() {

	}

	public Medal getMedalColour(String colour) {

		if (colour.equalsIgnoreCase("GOLD")) {
			return new GoldMedal();
		}
		if (colour.equalsIgnoreCase("SILVER")) {
			return new SilverMedal();
		}
		if (colour.equalsIgnoreCase("BRONZE")) {
			return new BronzeMedal();
		}
		return null;

	}

}
