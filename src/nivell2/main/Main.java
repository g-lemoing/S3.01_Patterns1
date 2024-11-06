package nivell2.main;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        boolean exit;
        do{
            exit = Menu.menu(agenda);
        }
        while (!exit);

    }
}
