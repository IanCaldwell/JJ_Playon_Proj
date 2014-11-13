package command;

public class Paused_State implements SongState_State{

	SongFile_State songFile ;
	Command command;
	public Paused_State(SongFile_State newSongFile, Command newCommand){
		songFile = newSongFile ;
		command = newCommand ;
	}
	
	@Override
	public void play() {
		songFile.setSongState(songFile.getPlayingState());
		command.execute();
	}

	@Override
	public void pause() {
		System.out.println("Song is already paused");
	}

}
