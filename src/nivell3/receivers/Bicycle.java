package nivell3.receivers;

public class Bicycle extends Vehicle {
    public void start() {
        System.out.println("La bici està arrencant.");
    }

    public void accelerate() {
        System.out.println("La bici està accelerant.");
    }

    public void brake() {
        System.out.println("La bici està frenant.");
    }
}
