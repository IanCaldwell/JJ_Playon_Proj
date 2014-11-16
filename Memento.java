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
public class Memento {
    
    private final String password;

    public Memento(String password){
        this.password=password;
        System.out.println("Memento created.");
    }
    
    public String getSavedPassword(){
        System.out.println("Memento returned state");
        return password;
    }
    
    
    
}
