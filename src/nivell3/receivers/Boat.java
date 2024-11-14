package nivell3.receivers;

public class Boat extends Vehicle {
    public void start() {
        System.out.println("El vaixell està salpant.");
    }

    public void accelerate() {
        System.out.println("El vaixell està accelerant.");
    }

    public void brake() {
        System.out.println("El vaixell està entrant a port.");
    }
}
