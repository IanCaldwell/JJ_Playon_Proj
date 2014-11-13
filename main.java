package command;

import java.util.ArrayList;


public class main{
	public static void main(String args[]) {
		
		ArrayList<SongFile_State> songList = new ArrayList<SongFile_State>();	
		Player_Command playOn = new Player_Command();
		SongFile_State song = new SongFile_State("'Warriors'", "Imagine Dragons", "Warriors", 180);
		SongFile_State song2 = new SongFile_State("'Why Does Alan Smell?'", "Alan sucks", "Everybody hates Alan", 600);
		SongFile_State otherSong3 = new SongFile_State("'The Command Pattern Is'","My Favourite","Design Patterns",174);
		songList.add(song);
		songList.add(song2);
		songList.add(otherSong3);
		
		
		Play_Command play = new Play_Command(playOn, song);
		Pause_Command pause = new Pause_Command(playOn);
		VolUp_Command volU = new VolUp_Command(playOn);
		VolDown_Command volD = new VolDown_Command(playOn);
		Next_Command next = new Next_Command(playOn, songList);
		
		NotPlayed_State button = new NotPlayed_State(song, play);
		Playing_State pauseB = new Playing_State(song, pause);
		Paused_State pauseN = new Paused_State(song, play);
		Button_Command volUB = new Button_Command(volU);
		Button_Command volDB = new Button_Command(volD);
		Button_Command nextB = new Button_Command(next); 
		
		button.play();
		//button.pause();
		pauseB.pause();
		pauseN.play();
		nextB.press();
		
		play = new Play_Command(playOn, song2);
		button = new NotPlayed_State(song2, play);
		button.play();
		button.play();
		
	}
}
