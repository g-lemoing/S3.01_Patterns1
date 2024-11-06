package nivell1.modules;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {
    final static String [] CMD_ARRAY = new String[]{
            "Sortir de l'applicació",
            "Crear registre",
            "Modificar registre",
            "Eliminar registre",
            "Desfer últim comandament",
            "Llistar històric comandaments"
    };

    static Scanner inputValue = new Scanner(System.in);

    public static void displayMenu(){
        System.out.println("Selecciona una de les opcions del menú:");
        for (int i = 0; i < CMD_ARRAY.length; i++) {
            System.out.println(" " + i + ". " + CMD_ARRAY[i]);
        }
        System.out.println("Entreu l'opció: ");
    }

    public static byte getOption (){
        final byte OPTION_MIN = 0;
        final byte OPTION_MAX = 5;
        byte selectedOption;
        do {
            displayMenu();
            selectedOption = readOption();
        }
        while (selectedOption < OPTION_MIN || selectedOption > OPTION_MAX);
        return selectedOption;
    }

    public static boolean doOption (){
        Undo undo = Undo.getCmdList();
        byte currentOption = getOption();
        switch (currentOption) {
            case 0:
                System.out.println(" > Sortint de l'aplicació, fins aviat!\n");
                return true;
            case 1, 2, 3:
                undo.addCmd(CMD_ARRAY[currentOption]);
                System.out.println(" > Ordre " + CMD_ARRAY[currentOption] + " realitzat!");
                break;
            case 4:
                try{
                    String removedCmd = undo.undoCmd();
                    System.out.println(" > Ordre " + removedCmd + " desfeta!");
                }
                catch (NoSuchElementException e){
                    System.out.println("No es pot desfer l'última ordre: l'històric està buit.");
                }
                break;
            case 5:
                System.out.println(" > Llistem les últimes ordres registrades de més a menys recent:");
                undo.getHistoric();
                break;
        }
        return false;
    }

    public static byte readOption(){
        byte selectedOption = -1;
        try{
            selectedOption = inputValue.nextByte();
        }
        catch (InputMismatchException e){
            System.out.println("Opció introduida no vàlida.");
            inputValue.next();
        }
            return selectedOption;
    }
}
