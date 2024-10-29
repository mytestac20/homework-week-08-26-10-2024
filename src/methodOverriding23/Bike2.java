package methodOverriding23;

class Bike2 extends Vehicle {
    // Defining the same method as in the parent class
    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2(); // Creating object
        obj.run(); // Calling method
    }
}