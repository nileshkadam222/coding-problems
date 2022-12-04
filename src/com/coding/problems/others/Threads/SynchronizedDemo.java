package testing.DurgaSir.Threads;


public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d = new Display();
		Mythread t = new Mythread("Nilesh", d);
		Mythread t1 = new Mythread("Harshu", d);
		Mythread t2 = new Mythread("Yogesh", d);
		t.start();
		t1.start();
		t2.start();
	}
}

class Mythread extends Thread{
	String name;
	Display d;
	public Mythread(String n,Display dis) {
		this.name = n;
		this.d = dis;
	}
	@Override
	public void run(){
	  d.m1(name);
	}
}

class Display{
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