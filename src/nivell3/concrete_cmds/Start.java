package nivell3.concrete_cmds;

import nivell3.interfaces.Command;
import nivell3.receivers.Vehicle;

public class Start implements Command {
    private final Vehicle vehicle;

    public Start(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.start();
    }
}
