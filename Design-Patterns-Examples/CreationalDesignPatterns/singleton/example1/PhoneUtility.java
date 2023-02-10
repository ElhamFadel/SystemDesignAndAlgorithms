package singleton.example1;

import java.util.HashMap;
import java.util.Map;

public class PhoneUtility {
	private Map<String, String> areaCodes;
	private static PhoneUtility instance;
	
	private PhoneUtility(){
		areaCodes = new HashMap<String, String>();
		areaCodes.put("USA", "001");
		areaCodes.put("Canada", "002");
		areaCodes.put("Egypt", "0027");
		areaCodes.put("Saudi", "00910");
		areaCodes.put("UAE", "0021");
		areaCodes.put("Bahrain", "0013");
		areaCodes.put("Germany", "0019");
		areaCodes.put("UK", "0044");
	}
	
	public static PhoneUtility getInstance(){
		if(instance == null) return new PhoneUtility();
		return instance;
	}
	
	
	public String getCountryCode(String countryName){
		return areaCodes.get(countryName);
	}
	
	public Map<String, String> getCodesList(){
		return areaCodes;
	}
	
	public void registerAreaCode(String countryName, String countryCode){
		areaCodes.put(countryName,  countryCode);
	}
}
