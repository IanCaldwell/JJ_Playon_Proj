package command;

public class Shuffle_Command implements Command {
	Player_Command player ;
	
	public Shuffle_Command(Player_Command newPlayer){
		player = newPlayer;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.Shuffle();
	}
}

