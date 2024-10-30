package nivell1.modules;

import java.util.*;

public class Undo {
    private static Undo cmdList;
    private static final ArrayList<String> historic = new ArrayList<>();

    private Undo(){
    }

    public static Undo getCmdList(){
        if(cmdList == null){
            cmdList = new Undo();
        }
        return cmdList;
    }

    public void addCmd (String cmd){
        Undo.historic.add(cmd);
    }

    public String undoCmd() throws EmptyStackException {
        return Undo.historic.removeLast();
    }

    public void getHistoric(){
        if(historic.isEmpty()) {
            System.out.println("    No existeix cap ordre desada.");
        }
        else {
            ListIterator<String> iterator = Undo.historic.listIterator(historic.size());
            while (iterator.hasPrevious()){
                System.out.println(iterator.previous());
            }
        }
        System.out.println("\n");
    }
}
