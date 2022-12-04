package testing.streams.Design.signalton;


//Static Block Initalization
public class Singleton2 {
	private static Singleton2 instance = null;

	static {
		try {
			if (instance == null) {
				instance = new Singleton2();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		return instance;
	}
}
