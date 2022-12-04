package testing.DurgaSir.Threads;

class MyThreadqweq extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thrad Running");
			Thread.yield();
		}
	}
}
public class YieldDemo {
	public static void main(String[] args) {
		MyThreadqweq t =new MyThreadqweq();
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main Thrad Running");
		}
	}
}
