import java.util.Scanner;

public class Usage {
    public static void main(String[] args) {
        NewUser defaultUser = new NewUser();
        User user = new User();
        Menu.welcomeMessage();
        ChooseOptions.chooseOptions(defaultUser);
        System.out.println("test");
    }
}
