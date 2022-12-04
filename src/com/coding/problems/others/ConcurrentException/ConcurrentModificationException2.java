package testing.DurgaSir.ConcurrentException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationException2 {
	static ConcurrentHashMap l = new ConcurrentHashMap();
	
	static Runnable myThread = () -> {
		try {
			System.out.println("Child thread call");
			Thread.sleep(2000);
			l.put(105,"Yogesh");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}

	};

	public static void main(String[] args){
		l.put(null,"m");
		l.put(101,"Nilesh");
		l.put(102,"Harshu");
		l.put(103,"Pooja");
		l.put(104,"Atri");
		Thread t = new Thread(myThread);
		t.start();
		
		Set s = l.entrySet();
		Iterator itr = s.iterator();
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
