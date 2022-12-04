package testing.DurgaSir.Threads;


public class SynchronizedDemo4 {
	public static void main(String[] args) {
		DisplayExample3 d = new DisplayExample3();
		MythreadExample3 t1 = new MythreadExample3(d);
		MythreadExample4 t2 = new MythreadExample4(d);
		t1.start();
		t2.start();
	}
}

class MythreadExample3 extends Thread{
	DisplayExample3 d;
	public MythreadExample3(DisplayExample3 dis) {
		this.d = dis;
	}
	@Override
	public void run(){
	  d.displatNubmer();
	}
}

class MythreadExample4 extends Thread{
	DisplayExample3 d;
	public MythreadExample4(DisplayExample3 dis) {
		this.d = dis;
	}
	@Override
	public void run(){
	  d.displatChar();
	}
}


class DisplayExample3{
	public synchronized void  displatNubmer() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.print(i);
		}
	}
	
	public synchronized void  displatChar() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.print((char)i);
		}
	}
}