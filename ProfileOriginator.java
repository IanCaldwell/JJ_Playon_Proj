/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playon;

import java.util.ArrayList;
/**
 *
 * @author ian
 */
public class ProfileOriginator {
    
    private final String username;
    private String password;
    private final ProfileCaretaker caretaker;
    private final Memento memento;
  //  private ArrayList<PlaylistObserver> playlists;  
    
    public ProfileOriginator(String username){
        this.username = username;
        this.password = username;
        this.caretaker = new ProfileCaretaker();
        this.memento = new Memento(this.password);        
        caretaker.addMemento(memento);
    }
    
    public void setPassword(String password){
        System.out.println("Password Changed!");
        this.password = password;
    }
    
    public void getPassword(){
        System.out.println("Username:" + this.username + " Password:" + this.password);
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getState(){
        return this.password;
    }
    
    public void addPlaylist(String title){
        //create playlists
    }
    
    public void getStateFromMemento() {        
        password = this.memento.getSavedPassword();
        System.out.println("Originator: State after restoring from Memento: Password: " + password);
    }   
    
    
//    public void getPlaylists(){
//        
//        if(this.playlists==null){
//            System.out.println("Profile: " + this.username + " has no Playlists added");
//        }
//        else{
//            for(PlaylistObserver playlist:playlists)
//            {
//                System.out.println(playlist.getPlaylistTitle());  
//            }
//        }
//    }   
    
    public void deletePlaylist(){
        
    } 
    
    public void showPlaylists(){
        
    }
       
}
