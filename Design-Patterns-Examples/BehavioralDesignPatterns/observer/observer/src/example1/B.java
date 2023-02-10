package example1;

import example1.A.AListener;

public class B implements AListener{

	@Override
	public void setData(String data) {
		System.out.println("B received "+data);		
	}


}
