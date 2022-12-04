package testing.DurgaSir.Threads;

class B{
	public synchronized void d1(A a) {
		System.out.println("First Thread Call d1 method");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("First Thread Calling b.last()");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("b last method called");
	}
	
}

class A{
	public synchronized void d1(B b) {
		System.out.println("B Thread Call d1 method");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("B Thread Calling b.last()");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("A last method called");
	}
	
}

class MyThreadA extends Thread{
	A a;
	B b;
	public MyThreadA(A a,B b) {
		this.a =a;
		this.b=b;
	}
	public void run() {
		a.d1(b);
	}
}

class MyThreadB extends Thread{
	A a;
	B b;
	public MyThreadB(A a,B b) {
		this.a =a;
		this.b=b;
	}
	public void run() {
		b.d1(a);
	}
}

public class DeadLockExample {

	public static void main(String[] args) {
		B b= new B();
		A a = new A();
		MyThreadA t1 = new MyThreadA(a,b);
		MyThreadB t2 = new MyThreadB(a,b);
		t1.start();
		t2.start();
	}

}

