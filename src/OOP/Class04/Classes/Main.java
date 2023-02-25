package OOP.Class04.Classes;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Sports", "Audi", "red");
        audi.increaseSpeed(20);
        audi.printInfo();

        Car bmw = new Car("Sports" , "BMW" , "blue");
        bmw.increaseSpeed(10);
        bmw.increaseSpeed(25);
        bmw.increaseSpeed(5);
        bmw.decreaseSpeed(25);
        bmw.printInfo();

        Car mercedes = new Car("Corporate" , "Mercedes" , "black");
        //mercedes.speed = 20;
        System.out.println("mercedes = " + mercedes);
        mercedes.printInfo();

        System.out.println("+++++++++++++++++++++++++++++");

        Car toyota =new Car("Hatchbag","CHR","White");
        toyota.increaseSpeed(50);
        toyota.decreaseSpeed(10);
        //toyota.printSpeed();
        toyota.printInfo();
        System.out.println("+++++++++++++");

        Car renault =new Car("Hatchbag","Clio","White");
        renault.increaseSpeed(50);
        renault.decreaseSpeed(10);
        //renault.printSpeed();
        renault.printInfo();
    }
}