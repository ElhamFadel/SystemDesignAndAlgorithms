package example1;

import example1.A.AListener;

public class C implements AListener{

	public void setData(String data) {
		System.out.println("C received "+data);
	}

}
