package testing.DurgaSir.concurrentLock;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorThreadJob1 implements Runnable{
	
	String name;
	public ExecutorThreadJob1(String n) {
		this.name = n;
	}

	@Override
	public void run() {
		System.out.println("Thread Started : "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println("Thread Completed : "+Thread.currentThread().getName() +" Name :"+ name);
	}
	
	
}
public class ExecutorThreadJobs {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		for(int i=0;i<10;i++) {
			es.submit(new ExecutorThreadJob1("Nilesh"+i));
		}
		es.shutdown();
	}

}
