/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class StaffDetails extends JFrame {
    JFrame f;
    JTable j;
    JScrollPane sp;
    String n,I,c,ge,ts,yea,qualification;
    StaffDetails(String z) throws FileNotFoundException, IOException, ClassNotFoundException{
        f=new JFrame("STAFF DETAILS");
        StaffList obj1=new StaffList();
        for (int i=0;i<obj1.staffList.size();i++){
            Staff a=obj1.staffList.get(i);
            
            System.out.println(z+"z ka val");
         if(a.getId().equals(z)){
             
             n=a.getName();
             I=a.getId();
            
             ge=a.getGender();
             yea=a.getYear();
             qualification=a.getQualification();
            if(a.getTeachingStaff().equals("YES")){
                ts="YES";
                 c=a.getCourse();
                
            }
            else{
                ts="NIL";
                 c="NILL";
            }
            
           break; 
         }
            
        }
        System.out.println(n+I+c+ge+yea+ts);
        
        String[][] data = { 
            { "1.", "Name", n }, 
            { "2.", "Year", yea } ,
            {"3.","ID",I},
            
             {"4.","gender",ge},
             {"5.","Qualification",qualification},
            {"5.","Nationality","Indian"},
           
            
        }; 
  
        
        String[] columnNames = {  "S.No","Field", "Details" }; 
  
        
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300); 
  
        
        JScrollPane sp = new JScrollPane(j); 
        f.add(sp); 
       
        f.setSize(720,480); 
        
        f.setVisible(true); 
        
    } 
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
   // new StaffDetails("101");
    }
    
}