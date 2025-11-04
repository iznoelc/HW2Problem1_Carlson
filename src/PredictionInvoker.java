import java.util.List;
import java.util.ArrayList;

public class PredictionInvoker {
    List<Command> commands; // a list of commands for the invoker to execute

    /**
     * Constructor to initialize the commands list as an ArrayList.
     */
    public PredictionInvoker(){
        this.commands = new ArrayList<Command>();
    }

    /**
     * Adds a command to the invoker.
     * @param command, the command to be added.
     */
    public void addCommand(Command command){
        this.commands.add(command);
    }

    /**
     * Execute all commands in the invoker's command list.
     */
    public void executeCommands(){
        for (Command command : commands){
            command.execute();
        }
    }
}
