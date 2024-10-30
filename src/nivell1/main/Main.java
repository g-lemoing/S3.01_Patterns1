package nivell1.main;

import nivell1.modules.Menu;
import nivell1.modules.Undo;

public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        do {
            exit = Menu.doOption();
        }
        while (!exit);
    }
}
