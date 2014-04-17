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
        ArrayList<Contact> myContacts = new ArrayList(5);
        for(int i = 0; i < 5; i++){
            myContacts.add(i, new Contact());
        }
        System.out.println(myContacts.size());
        myContacts = (ArrayList)cr.readContacts(myContacts);
        //cr.printContacts(myContacts);
        
        Set emp = new HashSet();
        for(int i = 0; i < myContacts.size(); i++){
            emp.add(myContacts.get(i));
        }
        
        Map empMap = new HashMap();
        for(int i = 0; i < myContacts.size(); i++){
            String id = "" + i;
            empMap.put(i, myContacts.get(i));
        }
        
        System.out.println(emp);
        System.out.println(empMap);
        
//        for(int i = 0; i < myContacts.size(); i++){
//            Contact c = (Contact)emp.get(i);
//            System.out.println(c);
//        }
        
        
    }
    
}
