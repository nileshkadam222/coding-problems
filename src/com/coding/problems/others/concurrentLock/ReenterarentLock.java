package testing.DurgaSir.concurrentLock;

import java.util.concurrent.locks.ReentrantLock;

class Display {

	ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		l.lock();
		for (int i = 0; i < 4; i++) {
			System.out.print(Thread.currentThread().getName() + "--  Happy Birthaday :");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock(); 
	}
}

class ConcurrentThread1 extends Thread {
	Display d;
	String name;

	public ConcurrentThread1(Display d, String name) {
		this.name = name;
		this.d = d;
	}

	@Override
	public void run() {
		d.wish(name);
	}
}

public class ReenterarentLock {

	public static void main(String[] args) {
		Display d = new Display();
		ConcurrentThread1 t = new ConcurrentThread1(d, "Nilesh");
		t.setName("thread-A");
		ConcurrentThread1 t2 = new ConcurrentThread1(d, "Harshu");
		t.setName("thread-b");
		t.start();
		t2.start();
	}
}
