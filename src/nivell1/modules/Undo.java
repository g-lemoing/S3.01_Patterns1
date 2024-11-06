package nivell1.modules;

import java.util.*;

public class Undo {
    private static Undo cmdList;
    private final ArrayList<String> historic;

    private Undo(){
        this.historic = new ArrayList<>();
    }

    public static Undo getCmdList(){
        if(cmdList == null){
            cmdList = new Undo();
        }
        return cmdList;
    }

    public void addCmd (String cmd){
        historic.add(cmd);
    }

    public String undoCmd() throws EmptyStackException, NoSuchElementException {
        return historic.removeLast();
    }

    public void getHistoric(){
        if(historic.isEmpty()) {
            System.out.println("    No existeix cap ordre desada.");
        }
        else {
            ListIterator<String> iterator = historic.listIterator(historic.size());
            while (iterator.hasPrevious()){
                System.out.println(iterator.previous());
            }
        }
        System.out.println("\n");
    }
}
