package command;

	//invoker for commands
public class Button_Command {
	Command command;
	
	public Button_Command(Command newCommand){
		command = newCommand;
	}
	
	public void press(){
		command.execute();
	}
}
