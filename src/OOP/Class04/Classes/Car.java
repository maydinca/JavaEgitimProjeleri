package OOP.Class04.Classes;

public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // Constructor (Kurucu) Metot
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model \t: " + this.model);
        System.out.println("Color \t: " + this.color);
        System.out.println("Type  \t: " + this.type);
        System.out.println("Speed \t: " + this.speed);
    }
    // ...
}