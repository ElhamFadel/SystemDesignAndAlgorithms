package singleton.example1;

import java.util.HashMap;

public class PhonecodeDictionary {

	private HashMap<String, String> countryCodes = new HashMap<>();
	private static PhonecodeDictionary instance = null;
	
	
	public PhonecodeDictionary() {
		// connect to database
		// query for country codes and fill the hashmap
		countryCodes.put("USA", "001");
		countryCodes.put("Canada", "002");
		countryCodes.put("Palestine", "0970");

	}
	
	public static PhonecodeDictionary getInstance(){
		if(instance == null)
			instance = new PhonecodeDictionary();
		return instance;
	}
	
	public String getCountryCode(String country){
		return countryCodes.get("USA");
	}

}
