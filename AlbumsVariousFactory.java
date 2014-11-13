package jjProgFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class AlbumsVariousFactory implements AlbumsFactoryFactory {
    String customerName ;
    private int songs ;
    private ArrayList<String> artistNames = new ArrayList<String>();
    private ArrayList<String> songList = new ArrayList<String>();
    Scanner in = new Scanner(System.in);
    
    public AlbumsVariousFactory(int songs){
        this.songs = songs;
            System.out.println("Enter artist name: ");
            this.artistNames.add(in.toString());
            
            for(int i = 0; i < songList.size(); i++){
            	System.out.println("Enter artist name, hit enter to input song name: ");
                this.artistNames.add(in.toString());
                System.out.println("Enter song name, hit enter for next song and artist: ");
            	this.songList.add(in.toString());
            }
        System.out.println("Various artist album added");
    }
    
    public int getSongNumber(){
        return songs ;
    }
    
    public void getSongList() {
    	for(int i = 0; i < songList.size(); i++) {   
    		System.out.print(i + ": " +(songList.get(i)).toString());
    	}  
	}
    
    public void getArtistNames() {
    	for(int i = 0; i < artistNames.size(); i++) {   
    		System.out.print(i + ": " +(artistNames.get(i)).toString());
    	}  
	}
    
    public void displayFullDetails() {
       	for(int i = 0; i < songList.size(); i++) {   
       		System.out.println(i + ": " + (songList.get(i)).toString() + " by: " + (artistNames.get(i)).toString());
       	} 	
    }
}