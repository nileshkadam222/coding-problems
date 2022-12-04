package testing.DurgaSir.Generics;

class Gen<T> {
	T obj;

	public Gen(T val) {
		this.obj = val;
	}

	public void showObject() {
		System.out.println("Type of paraameer :" + this.obj.getClass().getName());
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gen<String> g = new Gen<String>("Nilesh");
		g.showObject();
		
		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.showObject();
		
		Gen<Double> g3 = new Gen<Double>(23.3);
		g3.showObject();

	}

}
