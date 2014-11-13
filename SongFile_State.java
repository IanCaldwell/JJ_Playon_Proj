package command;


public class SongFile_State {
	SongState_State notPlayed;
	SongState_State playing;
	SongState_State hasPlayed;
	SongState_State paused;
	
	SongState_State songState;
	
	String title ;
	String artist ;
	String album;
	int length ;
	//int currentLength ;
	
	
	public SongFile_State(String title, String artist, String album, int length){
		this.title = title ;
		this.artist = artist ;
		this.album = album ;
		this.length = length;
		
		notPlayed = new NotPlayed_State(this, null);
		paused = new Paused_State(this, null);
		//playing = new Playing_State(this);
		//hasPlayed = new HasPlayed_State(this);
		
		songState = notPlayed ;
		
		
		
	}
	
	void setSongState(SongState_State newSongState){
		songState = newSongState ;
	}
	
	public void setTitle(String newTitle){
		title = newTitle;
	}
	
	public void setArtist(String newArtist){
		artist = newArtist;
	}
	
	public void setAlbum(String newAlbum){
		album = newAlbum;
	}
	
	public void setLength(int newLength){
		length = newLength;
	}
	
	public void play(){
		songState.play();
	}
	
	
	public SongState_State getNotPlayedState() {
		return notPlayed ;
	}
	
	public SongState_State getPlayingState() {
		return playing ;
	}
	
	public SongState_State getPausedState(){
		return paused ;
	}
	
	public SongState_State getHasPlayedState() {
		return hasPlayed ;
	}
}
