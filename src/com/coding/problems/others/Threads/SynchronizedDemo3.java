package testing.DurgaSir.Threads;


public class SynchronizedDemo3 {
	public static void main(String[] args) {
		DisplayExample2 d = new DisplayExample2();
		DisplayExample2 d1 = new DisplayExample2();
		MythreadExample2 t = new MythreadExample2("Nilesh", d);
		MythreadExample2 t1 = new MythreadExample2("Harshu", d1);
		t.start();
		t1.start();
	}
}

class MythreadExample2 extends Thread{
	String name;
	DisplayExample2 d;
	public MythreadExample2(String n,DisplayExample2 dis) {
		this.name = n;
		this.d = dis;
	}
	@Override
	public void run(){
	  d.m1(name);
	}
}

class DisplayExample2{
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