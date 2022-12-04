package testing.DurgaSir.Threads;

class DaemonThread1 extends Thread{
	public void run() {
		
	}
}

public class DaemonThreadDemo1 {

	public static void main(String[] args) {

		System.out.println("Main thread Daemon Nature :"+ Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		DaemonThread1 t = new DaemonThread1();
		System.out.println("Child Thread Daemon Nature : "+ t.isDaemon());
		t.setDaemon(true);
		System.out.println("Child Thread Daemon Nature : "+ t.isDaemon());
		
		
	}

}
