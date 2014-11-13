package command;

public class Playing_State implements SongState_State{
	
	SongFile_State songFile;
	Command command;
	
	public Playing_State(SongFile_State newSongFile, Command newCommand){
		songFile = newSongFile;
		command = newCommand;
	}
	@Override
	public void play() {
		System.out.println("Song is already playing");
		
	}

	@Override
	public void pause() {
		System.out.println("Song is now paused.");
		command.execute();
		songFile.setSongState(songFile.getPausedState());
		
	}

}
