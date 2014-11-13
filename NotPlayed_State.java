package command;


public class NotPlayed_State implements SongState_State {
	
	SongFile_State songState;
	Command command ;
	
	public NotPlayed_State(SongFile_State newSongState, Play_Command newCommand){
		songState = newSongState;
		command = newCommand;
	}
	
	public void play() {
		songState.setSongState(songState.getPlayingState());
		command.execute();
	}
	
	public void pause() {
		
	}
}