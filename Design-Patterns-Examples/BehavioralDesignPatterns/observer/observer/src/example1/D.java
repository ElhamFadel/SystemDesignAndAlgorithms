package example1;

import example1.A.AListener;

public class D implements AListener{
	
	public void setData(String data) {
		System.out.println("D received "+data);
	}

}
