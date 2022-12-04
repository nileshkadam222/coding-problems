package testing.streams.Design.signalton;

//Lazy Initalization + Synchronized Block
public class Singleton5 {
	private static Singleton5 instance = null;

	private Singleton5() {
	}

	public static  Singleton5 getInstance() {
		
		if(instance == null) {
			synchronized (Singleton5.class) {
				try {
					if (instance == null) {
						instance = new Singleton5();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return instance;
	}
}
