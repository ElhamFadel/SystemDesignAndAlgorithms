package memento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Main implements Serializable{

	public Main() {

		A a1 = new A();
		a1.data = 5;
		a1.b.x=100;
		
		try {
			// Create a shallow copy of a1
			A a2 = (A) a1.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		// Create a deep copy of ArrayList
		ArrayList<String> names = new ArrayList<>();
		names.add("Ahmed");
		names.add("Ali");
		names.add("Omar");
		
		try {
			FileOutputStream fos = new FileOutputStream("myObject.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(names);
			oos.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try{
			FileInputStream fis = new FileInputStream("myObject.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<String> names2 = (ArrayList<String>)ois.readObject();
			for(String n: names2){
				System.out.println(n);
			}
			
		}catch(Exception e){
			e.printStackTrace();	
		}
		
	}
	
	public static void main(String[] args){
		new Main();
	}
	
	
}
