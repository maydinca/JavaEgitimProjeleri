package AtmProjects;
import java.util.Scanner;

public class AtmProjectSwitchCaseWithMethods {

    public static Scanner scanner = new Scanner(System.in);
    public static String userName = "test";
    public static String userPassword = "test123";
    public static int attempt = 2;
    public static double balance = 1000;


    public static void main(String[] args) {
        login();
    }
    public static void login() {
        System.out.println("Welcome to J Bank");
        System.out.print("Username :");
        String scnUserNAme = scanner.next();
        System.out.print("Password :");
        String scnUserPassword = scanner.next();
        if (scnUserNAme.equals(userName) && scnUserPassword.equals(userPassword)) {
            selectOptions();
        } else if (attempt > 0) {
            System.out.println("your remaining right:" + attempt);
            attempt--;
            login();

        } else {
            System.out.println("Password attempts exceeded.Password incorrect " +
                    "\n Your account has been blocked, please call customer services. " +
                    "\n Your transaction is closed");
            System.out.println("Good Bye");
        }
    }
    public static void deposit() {
        String str = "Please Enter the Amount to deposit: ";
        System.out.println(str.toUpperCase());
        int deposit = scanner.nextInt();
        balance += deposit;
        System.out.println("New Balance= " + "$"+ balance);
        processing();
    }
    public static void withdrawal() {
        System.out.println("Enter the amount to withdraw:");
        int withdrawal = scanner.nextInt();
        balance -= withdrawal;
        System.out.println("New Balance= " + "$"+balance);
        processing();
    }public static void balanceCheck() {
        System.out.println("Your Balance:" +"$"+ balance);
        processing();
    }
    public static void selectOptions() {
        System.out.printf("Welcome %s! ", userName);
        System.out.println("Please choose the action you would like to perform:");
        System.out.println("1-Deposit" +
                           "\n2-Withdrawal" +
                           "\n3-Balance" +
                           "\n4-Exit");

        System.out.printf("Please make your choose:");
        int accountHolderChoice = scanner.nextInt();
        switch (accountHolderChoice) {
            case 1:
                deposit();
                break;
            case 2:
                withdrawal();
                break;
            case 3:
                balanceCheck();
                break;
            case 4:
                System.out.println("Good Bye");
                System.out.println("Your transaction is closing...");
                login();
                break;
            default:
                System.out.println("Invalid Choose, Please Try Again...");
        }
    }
    public static void processing() {
        System.out.println("Would you like to continue?");
        System.out.println("Y/N");
        String str = scanner.next();
        str.toLowerCase().substring(0, 1);
        if (str.equals("y")) {
            selectOptions();
        } else {
            System.out.println("Good Bye");
            System.out.println("Your transactions is closing...");
            login();
        }
    }
}