/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contacts;
import java.io.*;
import java.util.*;

/**
 *
 * @author khalloway
 */
public class ContactReader {
    File data = new File("src" + File.separatorChar + "records.txt");
    
    public List<Contact> readContacts(ArrayList<Contact> l) {
        BufferedReader in = null;
        String fname = "";
        String lname = "";
        String street = "";
        String city = "";
        String state = "";
        String zip = "";
        int lineCt = 0;
        int record = 0;
        //read and output all to console
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
           
	   while(line != null){
               switch(lineCt%6){
                   case 0:
                       fname = line;
                       break;
                   case 1:
                       lname = line;
                       break;
                   case 2:
                       street = line;
                       break;
                   case 3:
                       city = line;
                       break;
                   case 4:
                       state = line;
                       break;
                   case 5:
                       zip = line;
                       Contact temp = new Contact(fname, lname, street, city, state, zip);
                       if(record < l.size()){
                            l.set(record, temp);
                            System.out.println(l.get(record));
                            System.out.println(record);
                            record++;
                       }
                       break;
               };
               //System.out.println(line);
               line = in.readLine();  // strips out any carriage return chars
               lineCt++; 
               
               //add information to contact list
               
            }
           return l;
            
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
            return null;
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    }
    
    public void printContacts(List<Contact> l){
        for(int i = 0; i < l.size(); i++){
               System.out.println(l.get(i).toString());
           }
    }
}
