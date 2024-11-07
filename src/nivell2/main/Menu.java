package nivell2.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static final Scanner scanner = new Scanner(System.in);

    public static String askPhone(String message){
        String phone;
        System.out.println(message);
        do{
            phone = scanner.nextLine();
        }
        while (phone.isEmpty());
        return phone;
    }

    public static String askCountry(){
        String[] countries = {"Espanya", "Portugal", "Regne Unit"};
        byte sel;
        System.out.println("Selecciona el país de la nova entrada: ");
        for (int i = 0; i < 3; i++){
            System.out.println((i + 1) +  ". " + countries[i]);
        }
        do{
            sel = scanner.nextByte();
            scanner.nextLine();
        }
        while (sel < 1 || sel > 3);
        return countries[sel - 1];
    }

    public static boolean menu(Agenda agenda){
        byte sel;
        boolean exit = false;
        do{
            printMenu();
            try {
                sel = scanner.nextByte();
            }catch (InputMismatchException e) {
                sel = -1;
            }finally {
                scanner.nextLine();
            }
        }
        while(sel < 0 || sel > 2);

        switch (sel){
            case 0:
                System.out.println("Gràcies per utilitzar l'aplicació!");
                exit = true;
                break;
            case 1:
                String selCountry = Menu.askCountry();
                agenda.addEntry(selCountry);
                break;
            case 2:
                agenda.listAgenda();
                break;
            default:
                System.out.println("Opció no vàlida");
        }
        return exit;
    }

    public static void printMenu(){
        System.out.println("\n --- Menú principal ---");
        System.out.println("Selecciona una de les opcions següents: ");
        System.out.println("1. Afegir nova entrada");
        System.out.println("2. Llistar entrades");
        System.out.println("0. Sortir de l'aplicació");
    }

    public static String askAddressElem(String message){
        String response;
        do{
            System.out.println(message);
            response = scanner.nextLine();
        }
        while (response.isEmpty());
        return response;
    }


}
