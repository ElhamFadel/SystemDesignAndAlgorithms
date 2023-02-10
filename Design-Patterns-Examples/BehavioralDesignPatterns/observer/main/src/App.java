import java.util.Scanner;

import models.First_Screen;
import models.Main_Screen;
import models.Second_Screen;

public class App {
    public static void main(String[] args) throws Exception {
        Network network;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input user name: ");
        String name = scanner.nextLine();
        System.out.println("Input password: ");
        String password = scanner.nextLine();
        System.out.println("Input message: ");
        String message = scanner.nextLine();
System.out.println("Choose social network for posting message: \n 1 - Facebook \n 2 - Twitter");
        int choice = scanner.nextInt();
        if (choice == 1) {
            network = new Facebook();
            network.name = name;
            network.password =password;
            network.post(message);
        } else {
             network = new Twitter();
            network.name = name;
            network.password =password;
            network.post(message);


        }
    }
}
