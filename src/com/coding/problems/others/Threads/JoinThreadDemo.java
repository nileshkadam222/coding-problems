package testing.DurgaSir.Threads;

public class JoinThreadDemo {

	static class MyThread extends Thread{
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("child Thread Execution");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		try {
			t.join(10000); // With Time
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread Execution");
		}
	}

}
