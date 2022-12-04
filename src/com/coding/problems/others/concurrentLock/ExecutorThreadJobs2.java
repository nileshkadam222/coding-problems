package testing.DurgaSir.concurrentLock;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorThreadJob2 implements Callable{
	
	int number;
	public ExecutorThreadJob2(int num) {
		this.number = num;
	}

	@Override
	public Object call() {
		System.out.println("Find sum of :"+ number);
		int sum = 0;
		for(int i=0;i<number;i++) {
			sum = sum +i;
		}
		
		return sum;
	}
	
	
}
public class ExecutorThreadJobs2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es = Executors.newFixedThreadPool(100);
		long start = System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			Future submit = es.submit(new ExecutorThreadJob2(i));
			System.out.println("Sum :"+ submit.get());
		}
		es.shutdown();
		long end = System.currentTimeMillis();
		System.out.println("total time to execute :"+ (end -start));
	}

}
