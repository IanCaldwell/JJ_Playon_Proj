package command;

public class VolDown_Command implements Command {
	Player_Command player ;
	
	public VolDown_Command(Player_Command newPlayer){
		player = newPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.VolDown();
	}
}
