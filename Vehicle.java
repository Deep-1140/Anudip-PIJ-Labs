public class Vehicle 
{
    // Attributes
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method
    public void drive() {
       
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "City", 2023, 220);
        myCar.drive();

        Bike myBike = new Bike("Yamaha", "R15", 2022, 180);
        myBike.drive();
    }
}

// Subclass Car
class Car extends Vehicle {

    // Constructor Override
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Overrides drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is Driving");
    }
}

// Subclass Bike
class Bike extends Vehicle {

    
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Overrides drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is Driving");
    }
}



    


