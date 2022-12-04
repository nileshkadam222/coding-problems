package testing.DurgaSir.concurrentLock;

import java.util.Map;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal() {
			@Override
			public Object initialValue() {
				return "Harshu";
				
			}
		
		};
		
		System.out.println(tl.get());
		tl.set("Nilesh");
		System.out.println(tl.get());
		tl.remove();
	
	}

}
