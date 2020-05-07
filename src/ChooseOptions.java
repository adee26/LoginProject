import java.util.Scanner;

public class ChooseOptions {

    public static void chooseOptions(NewUser user) {
        Scanner scanner = new Scanner(System.in);
        char option = '\0';
        do {
            Menu.showMenu();
            option = scanner.next().charAt(0);
            switch (option) {
                case 'A':
                    user.signUp();
                    break;
                case 'B':
                    System.out.println("Username: ");
                    String username = scanner.next();
                    System.out.println("Password: ");
                    String password = scanner.next();
                    user.login(username, password);
                    break;
                case 'X':
                    System.out.println("Have a lovely day ahead.");
                    break;
                default:
                    System.out.println("Invalid option. Choose another option. ");
                    break;
            }

        } while (option != 'X');
    }

}
