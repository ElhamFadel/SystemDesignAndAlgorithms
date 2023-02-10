public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Notifications notifications = NotificationFactory.createNotification("SMS");
        notifications.sendNotification();
    }
}
