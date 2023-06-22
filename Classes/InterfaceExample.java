package Classes;

// Interface definition
interface Vehicle {
    void start();   // Abstract method declaration
    void stop();    // Abstract method declaration
}

// Class implementing the interface
class Car2 implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Another class implementing the interface
class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}

// Main class to test the interface
public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle car = new Car2();
        car.start();
        car.stop();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}

