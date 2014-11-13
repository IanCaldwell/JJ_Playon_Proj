package command;

public class VolUp_Command implements Command {
	Player_Command player ;
	
	public VolUp_Command(Player_Command newPlayer){
		player = newPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.VolUp();
	}
}
