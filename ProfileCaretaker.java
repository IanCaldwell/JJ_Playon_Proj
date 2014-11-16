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
public class ProfileCaretaker {   
    
    private final ArrayList<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento m){ 
        System.out.println("Saving state to Memento...");
        savedStates.add(m); 
        System.out.println("Saved!!!");
    }

    public Memento getMemento() {
        return savedStates.get(0); 
    }
    
}
