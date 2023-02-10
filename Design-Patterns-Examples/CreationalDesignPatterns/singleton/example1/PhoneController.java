package singleton.example1;

public class PhoneController {
	public void call(String countryName, String localNumber){
		String internationalPhone = PhoneUtility.getInstance().getCountryCode(countryName) + localNumber;
		// process call;
	}
}
