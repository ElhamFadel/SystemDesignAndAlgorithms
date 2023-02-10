package example1;

import example1.A.AListener;

public class E implements AListener{

	@Override
	public void setData(String data) {
		System.out.println("E received "+data);
	}

}
