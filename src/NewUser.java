import java.util.Scanner;

public class NewUser {
    User[] arrayOfUsers = new User[20];
    Scanner scanner = new Scanner(System.in);

    public void signUp(){
        System.out.println("Please insert your username: ");
        String username = scanner.next();
        System.out.println("Please insert your password: ");
        String password = scanner.next();
        System.out.println("Please introduce your birthday: ");
        System.out.println("What is your day of birth? ");
        int birthDay = scanner.nextInt();
        System.out.println("Which month were you born? Choose the month number. ");
        System.out.println(" 1: January \n 2: February \n 3: March \n 4: April \n 5: May \n 6: June \n 7: July" +
                " \n 8: August \n 9: September \n 10: October \n 11: November \n 12: December");
        int birthMonth = scanner.nextInt();

        while(birthMonth>12){
            System.out.println("Incorrect month. Please choose another month. ");
            birthMonth = scanner.nextInt();
        }

        System.out.println("Please introduce your year of birth: ");
        int birthYear = scanner.nextInt();
        while(birthYear > 2020 || birthYear < 1850){
            System.out.println("Incorrect year. Please choose a valid year. ");
            birthYear = scanner.nextInt();
        }
        Birthday birthday = new Birthday(birthDay, birthMonth, birthYear);
        User user1 = new User(username, password, birthday);
        for (int i = 0; i < arrayOfUsers.length; i++) {
            if (arrayOfUsers[i] == null){
                arrayOfUsers[i] = user1;
                break;
            }
        }
        System.out.println("User " + username + ", with the password " + password + " has been created. The birthday is " +
                "on " + birthDay + " " + birthMonth + " " + birthYear + ".");
    }

    public void login(String username, String password){
        for(User user : arrayOfUsers){
            if(user.username.equals(username) && user.password.equals(password)){
                System.out.println("Welcome " + username + ", your birthday is on " + user.birthday.birthDay + " " + user.birthday.month +
                       " " + user.birthday.year);
                break;
            }
        }


    }

}
