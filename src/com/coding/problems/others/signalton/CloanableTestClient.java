package testing.streams.Design.signalton;

public class CloanableTestClient {

	public static void main(String[] args) {

		CloneableSingletonePattern s = CloneableSingletonePattern.getInstance();
		System.out.println("Clonable Object : " +s.hashCode());
		try {
			CloneableSingletonePattern s1 = (CloneableSingletonePattern) CloneableSingletonePattern.getInstance().colne();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
