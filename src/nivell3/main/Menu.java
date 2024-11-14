package nivell3.main;

import nivell3.concrete_cmds.Accelerate;
import nivell3.concrete_cmds.Brake;
import nivell3.concrete_cmds.Start;
import nivell3.invokers.Operation;
import nivell3.receivers.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    public static byte readOption(){
        byte sel = -1;
        do {
            displayMenu();
            try{
                sel = scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Valor selección incorrecto");
            }finally {
                scanner.nextLine();
            }
        }while (sel < 0 || sel > 4);
        return sel;
    }

    public static void displayMenu(){
        final String[] opciones = {"Salir de la aplicación", "Coche", "Bici", "Avión", "Barco"};
        System.out.println("---- PARKING DE VEHICULOS ----");
        System.out.println("¿Con qué vehículo quiere operar?");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + ". " + opciones[i]);
        }
        System.out.println("Tu selección: ");
    }

    public static boolean selMenu() {
        Vehicle vehicle;
        Operation operation = new Operation();
        switch (readOption()) {
            case 0:
                System.out.println("Gracias por utilizar la aplicación!");
                return true;
            case 1:
                System.out.println("Estás al mando de un coche.");
                vehicle = new Car();
                break;
            case 2:
                System.out.println("Te has subido en una bici.");
                vehicle = new Bicycle();
                break;
            case 3:
                System.out.println("Estás pilotando un avión.");
                vehicle = new Plane();
                break;
            case 4:
                System.out.println("Eres capitán de un barco.");
                vehicle = new Boat();
                break;
            default:
                System.out.println("Opción incorrecta");
                vehicle = null;
        }

        byte selOper;
        do {
            selOper = readOperation();
            switch (selOper) {
                case 0:
                    vehicle = null;
                    break;
                case 1:
                    operation.setCommand(new Start(vehicle));
                    operation.execCommand();
                    break;
                case 2:
                    operation.setCommand(new Accelerate(vehicle));
                    operation.execCommand();
                    break;
                case 3:
                    operation.setCommand(new Brake(vehicle));
                    operation.execCommand();
                    break;
                default:

            }
        } while (selOper != 0);

        return false;
    }

    public static void displayOperations(){
        final String[] opciones = {"Quiero probar otro vehículo", "Arrancar", "Acelerar", "Frenar"};
        System.out.println("---- MENÚ DE OPERACIONES ----");
        System.out.println("¿Qué operación quieres realizar?");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + ". " + opciones[i]);
        }
        System.out.println("Tu selección: ");
    }

    public static byte readOperation(){
        byte sel = -1;
        do {
            displayOperations();
            try{
                sel = scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("Valor selección incorrecto");
            }finally {
                scanner.nextLine();
            }
        }while (sel < 0 || sel > 3);
        return sel;
    }
}
