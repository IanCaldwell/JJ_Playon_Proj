/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playon;

/**
 *
 * @author ian
 */
public class WarehouseSingleton {
    
    private PlaylistObserver[] Playlists;
    private AccountDecorator[] Accounts;
    private SongfileState[] Songfiles;
    private static WarehouseSingleton instance = null;
    
    private WarehouseSingleton(){
        //Exists only to defeat instantiation  
        //By making this private only WarehouseSingleton() methods call it; however, 
        //that means ClassicSingleton cannot be subclassed
    }
    
    public static WarehouseSingleton initialize(){
        System.out.println("Initializing Singleton...");
        if(instance == null){
            instance = new WarehouseSingleton();    
            System.out.println("Singleton Initialized! \n");
        }
        else{
            System.out.println("Singleton Not Initialized! - Singleton already instantiated!\n");
        }
        return instance;
    }
    
    public void uploadAlbum(){
        
    }
    
    public void register(){
        
    }
    
    public void showAlbums(){
        
    }
    
    
    
            
    
}
