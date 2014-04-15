/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contacts;
import java.util.*;

/**
 *
 * @author khalloway
 */
public class ContactsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContactReader cr = new ContactReader();
        List<Contact> myContacts = new ArrayList(4);
        cr.readContacts(myContacts);
        cr.printContacts(myContacts);
        
    }
    
}
