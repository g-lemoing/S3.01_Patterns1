package nivell1.main;

import nivell1.modules.Menu;

public class Main {
    public static void main(String[] args) {

        boolean exit;
        do {
            exit = Menu.doOption();
        }
        while (!exit);
    }
}
