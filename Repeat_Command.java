package command;

public class Repeat_Command implements Command {
	Player_Command player ;
	
	public Repeat_Command(Player_Command newPlayer){
		player = newPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.Repeat();
	}
}

