package command;

import java.util.ArrayList;

public class Player_Command {

	boolean isPlaying = false ;
	int volume = 0;
	SongFile_State currentSong;
	
	
	public void Play(SongFile_State song) {
		if(isPlaying == false){
			System.out.println("Now Playing " + song.title + " by " + song.artist);
			isPlaying = true;
			currentSong = song;
		}
	}
	
	public void Pause() {
		
		if(isPlaying == true){
			isPlaying = false ;
			System.out.println("**Paused**");
		}
	}
	
	public void Next(ArrayList<SongFile_State> songList) {
		
		for(int i = 0 ; i < songList.size(); i++){
			if(songList.get(i).title.equals(currentSong.title) && songList.get(i).artist.equals(currentSong.artist) ){
				SongFile_State nextSong = songList.get(1);
				Play(nextSong);
				System.out.println("Next song");
			}
		}
		
	}
	
	public void Previous() {
		System.out.println("Previous song");
	}
	
	public void VolUp() {
		if(volume < 10){
			volume++;
			System.out.println("Volume increased to " + volume);
		}
	}
	
	public void VolDown() {
		if(volume > 0){
			volume--;;
			System.out.println("Volume decreased to " + volume);
		}
	}
	
	public void Shuffle() {
		System.out.println("Shuffle");
	}
	
	public void Repeat() {
		System.out.println("Repeating current song");
		
	}

	
}

