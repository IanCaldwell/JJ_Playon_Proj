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
public class PlayOn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WarehouseSingleton playon = WarehouseSingleton.initialize();
        
        WarehouseSingleton spotify = WarehouseSingleton.initialize();
        
        Account tomRegularAccount = new RegularAccount();
        
        Account alanRegularAccount2 = new RegularAccount();
        
        Account ianPremiumAccount = new PremiumAccountDecorator(new RegularAccount());
        
        System.out.println();       
        
        tomRegularAccount.create("Account x");
        alanRegularAccount2.create("Account y");
        ianPremiumAccount.create("Account z");
        
        System.out.println();
        
        tomRegularAccount.getProfiles();
        ianPremiumAccount.getProfiles();
        
        System.out.println();
        
        tomRegularAccount.addProfile("Profile a");
        tomRegularAccount.addProfile("Profile z");
        ianPremiumAccount.addProfile("Profile x");    
        
        System.out.println();
        
        Account tomPremiumAccount = new PremiumAccountDecorator(tomRegularAccount);
        tomPremiumAccount.create("Acount Premium New");
        tomPremiumAccount.getProfiles();
        ianPremiumAccount.getProfiles();   
        
        System.out.println();
        
        
//      ProfileOriginator originator = new ProfileOriginator("Ian");
//      ProfileCaretaker careTaker = new ProfileCaretaker();
//      
//      Memento memento = originator.saveStateToMemento();
//      
//      originator.getPassword();
//      originator.setPassword("New Password");
//      originator.getPassword();      
//      
//      careTaker.addMemento(originator.saveStateToMemento());      
//      
//      originator.setPassword("New Password 2");      
//      
//      careTaker.addMemento(originator.saveStateToMemento());
//      
//      originator.setPassword("New Password 3");
//      
//      careTaker.addMemento(originator.saveStateToMemento());
//      
//      System.out.println("Current Password: " + originator.getState());		
//      originator.getStateFromMemento(careTaker.get(0));
        
        ProfileOriginator profile = new ProfileOriginator("Ians Profile");
        profile.getPassword();
        profile.setPassword("New Password");
        profile.getPassword();
        profile.setPassword("New New Password");
        profile.getPassword();
        
        System.out.println();
        
        profile.getStateFromMemento();
    }
    
}
