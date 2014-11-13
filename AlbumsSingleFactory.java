package jjProgFactory;

import java.util.ArrayList;
import java.util.Scanner;


public class AlbumsSingleFactory implements AlbumsFactoryFactory {
	String customerName ;
    private int songs ;
    private String artistName = "";
    private ArrayList<String> songList = new ArrayList<String>();
    Scanner in = new Scanner(System.in);
    
    public AlbumsSingleFactory(int songs){
        this.songs = songs;
        System.out.println("Enter artist name: ");
        this.artistName= in.toString();
        
        System.out.println("Enter song names, hit enter for next song: ");
        for(int i = 0; i < songList.size(); i++){
        	this.songList.add(in.toString());
        }
        
        System.out.println("Single artist album added");
    }
    
    public int getSongNumber(){
        return songs ;
    }
    
    public void getSongList() {
    	for(int i = 0; i < songList.size(); i++) {   
    		System.out.println(i + ": " +(songList.get(i)).toString());
    	}  
	}
    
    public void getArtistNames() { 
    		System.out.println(artistName);
    }		
    
    public void displayFullDetails() {
       	for(int i = 0; i < songList.size(); i++) {   
       		System.out.println(i + ": " + (songList.get(i)).toString() + " by: " + (artistName));
       	} 	

    }
}
