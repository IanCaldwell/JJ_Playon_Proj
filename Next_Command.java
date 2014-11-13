package command;

import java.util.ArrayList;

public class Next_Command implements Command {
	Player_Command player ;
	ArrayList<SongFile_State> songList ;
	
	public Next_Command(Player_Command newPlayer, ArrayList<SongFile_State> newSongList){
		player = newPlayer;
		songList = newSongList;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		player.Next(songList);
		//player.Play();
	}
}
