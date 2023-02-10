import java.util.Scanner;

import factorymethod2.poster.FacebookPoster;
import factorymethod2.poster.TwitterPoster;
import factorymethod2.poster.WhatsAppPoster;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Choose social network to post in:");
		int choice = s.nextInt();
		if(choice == 1) {
			FacebookPoster poster = new FacebookPoster();
			poster.post("post this text");
		}else if(choice == 2) {
			TwitterPoster poster = new TwitterPoster();
			poster.post("");
		}else if(choice == 3) {
			WhatsAppPoster poster = new WhatsAppPoster();
			poster.post("");
		}
		
	}

}
