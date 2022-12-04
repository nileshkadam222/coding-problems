package testing.DurgaSir.Threads;

class MyThreadExamp extends Thread{
	static Thread mainThread;
	
	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread Executing");
		}
	}
}
public class ChildThreadWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//MyThread1.mainThread = Thread.currentThread();
		MyThreadExamp t = new MyThreadExamp();
		t.mainThread = Thread.currentThread();
		t.start();
		for(int i=0;i<10;i++) {
			Thread.sleep(2000);
			System.out.println("Main Thread Executing");
		}
		

	}

}
