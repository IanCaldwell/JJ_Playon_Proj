package command;

public class Pause_Command implements Command{
Player_Command player ;
	
	public Pause_Command(Player_Command newPlayer){
		player = newPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.Pause();
	}
}
