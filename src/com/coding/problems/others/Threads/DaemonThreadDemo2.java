package testing.DurgaSir.Threads;

class DaemonThread2 extends Thread{
	public void run() {
		System.out.println("Child Thread Running :");
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("Child Thread Running :"+ i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThreadDemo2 {

	public static void main(String[] args) {

		System.out.println("Main thread Daemon Nature :"+ Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		DaemonThread2 t = new DaemonThread2();
		System.out.println("Child Thread Daemon Nature : "+ t.isDaemon());
		t.setDaemon(true);
		System.out.println("Child Thread Daemon Nature : "+ t.isDaemon());
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of Main Thread");
		
		
	}

}
