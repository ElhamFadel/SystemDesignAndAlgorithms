package example1;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		a.addAListener(b);
		a.addAListener(c);
		a.addAListener(d);
		a.addAListener(e);
		
		a.sendData("Hello World");
		
	}

}
