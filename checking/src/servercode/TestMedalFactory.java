package servercode;

public class TestMedalFactory {

	public TestMedalFactory() {

	}

	public static void main(String[] args) {

		MedalFactory medalFactory = new MedalFactory();

		Medal medal1 = medalFactory.getMedalColour("bronze");

		medal1.getColor();

		Medal medal2 = medalFactory.getMedalColour("gold");

		medal2.getColor();

		Medal medal3 = medalFactory.getMedalColour("silver");

		medal3.getColor();

	}

}
