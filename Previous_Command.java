package command;

public class Previous_Command implements Command {
	Player_Command player ;
	
	public Previous_Command(Player_Command newPlayer){
		player = newPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.Previous();
		//player.Play();
	}
}