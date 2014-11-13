package command;


public class Play_Command implements Command {

	Player_Command player ;
	SongFile_State song ;
	
	//Play command constructor
	public Play_Command(Player_Command newPlayer, SongFile_State newSong){
		player = newPlayer;
		song = newSong ;
		
	}
	
	@Override
	//invokes Play method on the player
	public void execute() {
		// TODO Auto-generated method stub
		player.Play(song);
	}

}
