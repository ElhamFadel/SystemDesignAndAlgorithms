package example1;

import java.util.ArrayList;
import java.util.List;

public class A {
	
	List<AListener> listeners;
	
	public A() {
		listeners = new ArrayList<>();
	}

	
	public void addAListener(AListener listener) {
		if(!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}
	
	
	public void sendData(String data) {
		for(AListener l: listeners)
			l.setData(data);
	}
	
	
	public interface AListener{
		public void setData(String data);
	}
}