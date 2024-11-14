package nivell3.receivers;

public class Car extends Vehicle {
    public void start() {
        System.out.println("El cotxe està arrencant.");
    }

    public void accelerate() {
        System.out.println("El cotxe està accelerant.");
    }

    public void brake() {
        System.out.println("El cotxe està frenant.");
    }
}
