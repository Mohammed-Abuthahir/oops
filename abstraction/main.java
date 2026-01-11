// Abstraction in Java is a concept of hiding implementation details and showing only essential features to the user, achieved using abstract classes and interfaces.
// Abstract class
abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}


class Car extends Vehicle {
    
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class main {
    public static void main(String[] args) {
        Car v = new Car();  
        v.start();              
        v.stop();
    }
}
