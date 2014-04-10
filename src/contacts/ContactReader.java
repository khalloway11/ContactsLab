/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contacts;
import java.io.*;

/**
 *
 * @author khalloway
 */
public class ContactReader {
    File data = new File("src" + File.separatorChar + "records.txt");
    
    public void readContacts() throws IOException {
        BufferedReader in = null;
        String fname;
        String lname;
        String street;
        String city;
        String state;
        String zip;
        //read and output all to console
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    }
}
