package testing.DurgaSir.concurrentLock;

class myThreadLocalDemn1 extends Thread {
	static int customerId = 0;
	public ThreadLocal t = new ThreadLocal() {
		@Override
		public Object initialValue() {
			return customerId++;
		}

	};

	@Override
	public void run() {
		System.out.println("Thread Local Value " + t.get());
	}

}

public class ThreadLocalWithMultiple {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			myThreadLocalDemn1 tt = new myThreadLocalDemn1();
			tt.start();
		}
	}

}
