package testing.DurgaSir.Threads;

public class SynchronizdBolckDemo {
	public static void main(String[] args) {
		DisplayExample6 d = new DisplayExample6();
		DisplayExample6 d1 = new DisplayExample6();
		MythreadExample6 t = new MythreadExample6("Nilesh", d);
		MythreadExample6 t1 = new MythreadExample6("Yogehs", d1);
		t.start();
		t1.start();
	}
}

class MythreadExample6 extends Thread {
	String name;
	DisplayExample6 d;

	public MythreadExample6(String n, DisplayExample6 dis) {
		this.name = n;
		this.d = dis;
	}

	@Override
	public void run() {
		d.m1(name);
	}
}

class DisplayExample6 {
	public void m1(String name) {
		synchronized (DisplayExample6.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Welcome to ");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.err.println(e.getMessage());
				}
				System.out.print(name);
				System.out.println();
			}
		}

	}
}