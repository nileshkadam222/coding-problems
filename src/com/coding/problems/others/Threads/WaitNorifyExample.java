package testing.DurgaSir.Threads;

class MyThreadDemoExample1 extends Thread{
	
	int total =0;
	
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("Child Thread Start calculation");
			for(int i=0;i<=100;i++) {
				total = total +i;
			}
			System.out.println("Child Thread given notification");
			this.notify();
		}
	}
}
public class WaitNorifyExample {

	public static void main(String[] args) {
		MyThreadDemoExample1 t = new MyThreadDemoExample1();
		t.start();
		synchronized (t){
			try {
				System.out.println("Main thread Goinig into waithing State");
				t.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Main thread Got Notificsation :");
			System.out.println("Total : "+ t.total);
		}
	}

}
