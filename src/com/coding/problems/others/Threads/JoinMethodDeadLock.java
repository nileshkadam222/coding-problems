package testing.DurgaSir.Threads;

class MyThreadDemo1 extends Thread{
	static Thread mt;
	
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread Executing");
		}
	}
}
public class JoinMethodDeadLock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThreadDemo1.mt = Thread.currentThread();
		MyThreadDemo1 t = new MyThreadDemo1();
		t.start();
		t.join();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread Executing");
		}
	}

}
