/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class StaffList {

     public List<Staff> staffList=new ArrayList<>();
    public StaffList(){
        
        staffList=getStaffList();
        
    }
   
    public List<Staff> getStaffList(){
        
            ObjectInputStream obj1=null;
            
            
            try {
                obj1 = new ObjectInputStream(new FileInputStream("staffdata.txt"));
           
                Staff staff=null;
                try {
                    staff = (Staff)obj1.readObject();
                    System.out.println("reading"); 
                    staffList.add(staff);
                } catch (IOException ex) {
                    staff = null;
                }
                catch (ClassNotFoundException ex) {
                    staff = null;
                    
                }

                while(staff != null){
                 

                    try {
                        staff = (Staff) obj1.readObject();
                        if(staff != null){
                           staffList.add(staff);
                    }
                        
                            
                    } catch (IOException ex) {
                        staff = null;
                    } catch (ClassNotFoundException ex) {
                        staff = null;
                    }
                }

                return staffList;
            } catch (IOException ex) {
                
            } finally {
            try {
                obj1.close();
            } catch (IOException ex) {
                
            }
        }
             return new ArrayList<>();

    }
    
    
}