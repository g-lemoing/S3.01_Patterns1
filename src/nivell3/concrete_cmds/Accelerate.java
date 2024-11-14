package nivell3.concrete_cmds;

import nivell3.interfaces.Command;
import nivell3.receivers.Vehicle;

public class Accelerate implements Command {
    private final Vehicle vehicle;

    public Accelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
