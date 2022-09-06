package commandExpl.workshop;

import commandExpl.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {

    //implementacja kolejki
    private List<Command> commandQueue = new ArrayList<>();

    //metoda dodająca komende do kolejki
    public void addToQueue(Command command){
        commandQueue.add(command);
    }
    //metoda dostepna z main
    public void run(){
        if(commandQueue.isEmpty()){
            System.out.println("Queue is empty");
        }
       for(Command command: commandQueue){
           command.execute();
       }
//       commandQueue.clear();
    }
    public void undoLastCommand(){
        for(Command command: commandQueue){
            command.undo();
        }
    }
}
