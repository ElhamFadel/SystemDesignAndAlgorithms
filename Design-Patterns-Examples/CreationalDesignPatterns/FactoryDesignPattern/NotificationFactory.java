public class NotificationFactory {

    public static Notifications createNotification(String type) {
     if(type.equals("SMS")) {
         return new SMSNotification();
     } else if(type.equals("Email")) {
         return new EmailNotifacation();
     } else {
         throw new IllegalArgumentException("Threse's no type");
     }
    }
       
    
}
