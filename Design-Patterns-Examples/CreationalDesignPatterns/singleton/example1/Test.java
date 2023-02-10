package singleton.example1;

import java.util.logging.Level;

public class Test {

	public static PhonecodeDictionary instance = new PhonecodeDictionary();
	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Test.instance.getCountryCode("USA");
		
		MyLoggerManager manager = MyLoggerManager.getInstance();
		manager.getLogger().log(Level.SEVERE, "Cannot connect ot server");
		
		
		//PhonecodeDictionary p = PhonecodeDictionary.getInstance();
		//String code = p.getCountryCode("Palestine");

		//PhonecodeDictionary p2 = PhonecodeDictionary.getInstance();
		
	}

}
