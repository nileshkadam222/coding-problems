package testing.streams.Design.signalton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerilizationClientTest {

	public static void main(String[] args) {

		//Serializable pattern
		SerizableSingletonePattern s = SerizableSingletonePattern.getInstance();
		System.out.println("Serilizable Objecte : "+ s.hashCode());
		ObjectOutput objOutput = null;
		try {
			objOutput = new ObjectOutputStream(new FileOutputStream("test.ser"));
			objOutput.writeObject(s);
			objOutput.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				objOutput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//De-Serializable
		
		ObjectInput objInput = null;
		try {
			objInput = new ObjectInputStream(new FileInputStream("test.ser"));
			Object readObject = objInput.readObject();
			SerizableSingletonePattern s2 = (SerizableSingletonePattern) readObject;
			System.out.println("De-Serilizable Objecte : "+ s2.hashCode());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
