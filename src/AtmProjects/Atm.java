package AtmProjects;

import java.util.Scanner;
public class Atm {
    public void atm() {

        Scanner scanner = new Scanner(System.in);
        String realUserName = "admin";
        String realPassword = "admin";
        int counter = 0;
        int balance = 2000;
        int choice;
        do {
            System.out.println("enter the username");
            String userName = scanner.nextLine();
            System.out.println("enter the password");
            String password = scanner.nextLine();

            if (userName.equals(realUserName) && password.equals(realPassword)) {
                System.out.println("you succefully access your account");
                do {
                    System.out.println("what is your prefer?\n"
                            + "1-balance inquiry\n"
                            + "2-deposit\n"
                            + "3-withdraw\n"
                            + "4-exit");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("your balance: " + balance);
                            break;
                        case 2:
                            System.out.println("enter your amount to deposit");
                            int amount = scanner.nextInt();
                            balance += amount;
                            break;
                        case 3:
                            System.out.println("enter your amount to withdraw");
                            int amount2 = scanner.nextInt();
                            if (balance > amount2)
                                balance -= amount2;
                            else System.out.println("you don't have enough balance");
                            break;
                        case 4:
                            System.out.println("your account is closing...");
                            break;
                    }
                } while (!(choice == 4));
                break;
            } else {
                System.out.println("wrong enter try again");
                counter++;
                System.out.println("your right is " + (3 - counter));
                if (counter == 3) System.out.println("your bank account locked connect with your bank");
            }
        } while (!(counter == 3));
    }
}

