package servercode;

public class TestSingleton {
	public TestSingleton() {

	}

	public static void main(String[] args) {
		Singleton testSingleton = Singleton.getInstance();

		testSingleton.writeStuff();

	}
}
