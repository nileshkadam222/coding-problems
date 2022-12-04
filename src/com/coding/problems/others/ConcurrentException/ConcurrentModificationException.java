package testing.DurgaSir.ConcurrentException;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationException {
	static ArrayList l = new ArrayList();
	static Runnable myThread = () -> {
		try {
			Thread.sleep(2000);
			l.add("Yogesh");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}

	};

	public static void main(String[] args){
		l.add("Nilesh");
		l.add("Harshu");
		l.add("Pooja");
		l.add("Atri");
		Thread t = new Thread(myThread);
		t.start();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println("Data " + itr.next());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(l);

	}

}
