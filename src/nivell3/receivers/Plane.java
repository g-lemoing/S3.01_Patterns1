package nivell3.receivers;

public class Plane extends Vehicle {
    public void start() {
        System.out.println("L'avió està engegant motors.");
    }

    public void accelerate() {
        System.out.println("L'avió està accelerant en la pista.");
    }

    public void brake() {
        System.out.println("L'avió està iniciant la seva baixada.");
    }
}
