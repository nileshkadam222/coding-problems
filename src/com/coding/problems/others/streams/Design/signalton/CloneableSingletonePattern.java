package testing.streams.Design.signalton;

import java.io.Serializable;

public class CloneableSingletonePattern implements Cloneable {

	private static CloneableSingletonePattern INSTANCE = null;
	
	private CloneableSingletonePattern() {
		
	}
	
	public static CloneableSingletonePattern getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new CloneableSingletonePattern();
		}
		return INSTANCE;
	}
	
	public static Object colne() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Clone not supported for this class");
	}
	
}
