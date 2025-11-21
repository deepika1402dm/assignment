class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.start();
        c.drive();
        b.start();
        b.ride();
    }
}
