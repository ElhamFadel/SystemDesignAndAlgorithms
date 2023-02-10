package memento;

import java.io.Serializable;


public class A implements Serializable, Cloneable{
		
		int data;
		B b;
		transient public float number;
		
		public A(){
			b = new B();
		}

		@Override
		public Object clone() throws CloneNotSupportedException {
		return super.clone();
		}
	}

