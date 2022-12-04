package testing.DurgaSir.ThreadGroups;

public class ThreadGroup1 {

	public static void main(String[] args) {
		ThreadGroup system  =  Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread th : t) {
			System.out.println(th.getName() +"--"+th.isDaemon());
		}
		
	}

}
