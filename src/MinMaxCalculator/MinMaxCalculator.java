package MinMaxCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MinMaxCalculator {
    public static Scanner scan=new Scanner(System.in);
    public static ArrayList<Integer> selectedNumbers=new ArrayList<Integer>();
    public static void main(String[] args) {
        System.out.println("Welcome to Min and Max Number Finder!");
        selectMenu();
    }
    public static void sortArrayList(int numberSize){
        for (int i=0;i<numberSize;i++){
            int queNumber=i+1;
            System.out.printf("Enter the %d number: ",queNumber);
            int userInput=scan.nextInt();
            selectedNumbers.add(userInput);
        }
        Collections.sort(selectedNumbers);
    }
    public static void findMax(int numberSize){
        sortArrayList(numberSize);
        int getMaxSize=selectedNumbers.size()-1;
        int max=selectedNumbers.get(getMaxSize);
        System.out.println("Largest number you entered: "+max);
        System.out.println("***********");
        againProcces();
    }
    public static void findMin(int numberSize){
        sortArrayList(numberSize);
        int min=selectedNumbers.get(0);
        System.out.println("The smallest number you entered: "+min);
        System.out.println("***********");
        againProcces();
    }
    public static void againProcces(){
        System.out.println("Would you like to trade again?");
        System.out.println("Y/N");
        String str=scan.next();
        str.toLowerCase().substring(0,1);
        if (str.equals("y")){
            selectMenu();
        }else {
            System.out.println("Good Bye");
            System.out.println("***********");
        }
    }
    public static void selectMenu(){
        System.out.println("How Many Numbers You Will Enter:");
        int numberSize= scan.nextInt();
        System.out.println("***********");
        System.out.println("Please select action:");
        System.out.println("1-Finding the Max value\n2-Finding the Min value");
        int selectNumber=scan.nextInt();
        switch (selectNumber){
            case 1:
                findMax(numberSize);
                break;
            case 2:
                findMin(numberSize);
                break;
            default:
                System.out.println("Invalid Choose");
                selectMenu();
        }
    }
}
