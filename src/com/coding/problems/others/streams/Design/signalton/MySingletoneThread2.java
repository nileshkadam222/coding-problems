package testing.streams.Design.signalton;

public class MySingletoneThread2 extends Thread{
	
	@Override
	public void run() {
		BillPughSingletoneClass c = BillPughSingletoneClass.getInstance();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Name :" +Thread.currentThread().getName() +" : "+c.hashCode());
	}
}
