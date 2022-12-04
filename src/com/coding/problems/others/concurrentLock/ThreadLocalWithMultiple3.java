package testing.DurgaSir.concurrentLock;

class myThreadLocalDemn4 extends Thread {
	 static InheritableThreadLocal t = new InheritableThreadLocal() {
		@Override
		public Object childValue(Object p) {
			return "cc";
		}
	};

	@Override
	public void run() {
		t.set("pp");
		System.out.println("pp Thread Local Value " + t.get());
		myThreadLocalDemn5 ttt = new myThreadLocalDemn5();
		ttt.start();
	}

}

class myThreadLocalDemn5 extends Thread {
	@Override
	public void run() {
		System.out.println("Child Thread Local Value " + myThreadLocalDemn4.t.get());
	}

}

public class ThreadLocalWithMultiple3 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			myThreadLocalDemn4 tt = new myThreadLocalDemn4();
			tt.start();
		}
	}

}
