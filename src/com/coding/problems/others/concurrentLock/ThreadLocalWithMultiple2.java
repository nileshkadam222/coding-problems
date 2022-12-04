package testing.DurgaSir.concurrentLock;

class myThreadLocalDemn2 extends Thread {
	 static ThreadLocal t = new ThreadLocal() {
		@Override
		public Object initialValue() {
			return "Default";
		}
	};

	@Override
	public void run() {
		t.set("pp");
		System.out.println("pp Thread Local Value " + t.get());
		myThreadLocalDemn3 ttt = new myThreadLocalDemn3();
		ttt.start();
	}

}

class myThreadLocalDemn3 extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread Local Value " + myThreadLocalDemn2.t.get());
	}

}

public class ThreadLocalWithMultiple2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			myThreadLocalDemn2 tt = new myThreadLocalDemn2();
			tt.start();
		}
	}

}
