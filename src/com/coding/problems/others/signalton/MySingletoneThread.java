package testing.streams.Design.signalton;

public class MySingletoneThread extends Thread{
	
	@Override
	public void run() {
		Singleton4 c = Singleton4.getInstance();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Name :" +Thread.currentThread().getName() +" : "+c.hashCode());
	}
}
