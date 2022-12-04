package testing.DurgaSir.Threads;

import java.lang.System.Logger;

class MyDemoThreadClass extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class InteruptThread {
	public static void main(String[] args) {
		Integer a = 0;
		
		MyDemoThreadClass t = new MyDemoThreadClass();
		t.start();
		t.interrupt();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		

	}

}
