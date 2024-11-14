package nivell3.invokers;

import nivell3.interfaces.Command;

public class Operation {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void execCommand(){
        command.execute();
    }
}
