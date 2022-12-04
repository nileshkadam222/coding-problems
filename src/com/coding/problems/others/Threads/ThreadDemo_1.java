package testing.DurgaSir.Threads;

class MyThread1212 extends Thread{
	public void run(){
		System.out.println("Child  Thread Name : " +Thread.currentThread().getName());
		/*
		 * for(int i=0;i<10;i++) { System.out.println("Child Thread"); }
		 */
	}
}
public class ThreadDemo_1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Main Thread Name : " +Thread.currentThread().getName());
		 * Thread.currentThread().setName("Main-thread-01");
		 * System.out.println("Main Thread Name : " +Thread.currentThread().getName());
		 * System.out.println("Main Thread Priporty : "
		 * +Thread.currentThread().getPriority()); MyThread t = new MyThread();
		 * System.out.println("Child  Thread Name : " +t.getName());
		 * t.setName("Child-thread-01"); System.out.println("Child  Thread Priority : "
		 * +t.getPriority()); Thread.currentThread().setPriority(9);
		 * System.out.println("Main  Thread Priority : "
		 * +Thread.currentThread().getPriority());
		 * System.out.println("Child  Thread Priority : " +t.getPriority()); t.start();
		 * for(int i=0;i<10;i++) { System.out.println("Main Thread"); }
		 */
		
		Thread t = new Thread(new MyThread1212());
		t.run();
		t.run();
		t.start();

	}

}
