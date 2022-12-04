package testing.DurgaSir.Threads;


public class SynchronizedDemo2 {
	public static void main(String[] args) {
		Display d = new Display();
		Display d1 = new Display();
		MythreadExample t = new MythreadExample("Nilesh", d);
		MythreadExample t1 = new MythreadExample("Harshu", d1);
		t.start();
		t1.start();
	}
}

class MythreadExample extends Thread{
	String name;
	Display d;
	public MythreadExample(String n,Display dis) {
		this.name = n;
		this.d = dis;
	}
	@Override
	public void run(){
	  d.m1(name);
	}
}

class DisplayExample1{
	public synchronized void  m1(String name) {
		for(int i=0;i<10;i++) {
			System.out.print("Welcome to ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.print(name);
			System.out.println();
		}
	}
}