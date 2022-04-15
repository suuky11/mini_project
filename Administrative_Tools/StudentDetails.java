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


public class StudentDetails extends JFrame{
    JFrame f;
    JTable j;
    JScrollPane sp;
    String P,PP,ss,y,r,g,fa,ma,gm,phone,date;
    StudentDetails(String p,String pp) throws FileNotFoundException, IOException, ClassNotFoundException{
        f = new JFrame("STUDENT DETAILS"); 
        P=p;
        PP=pp;
        
      
  
        
         StudentList objr=new StudentList();
        for (int i=0;i<objr.studentList.size();i++){
          Student s=objr.studentList.get(i);
            System.out.println(s.getName()+s.getRollno());
          if((s.getRollno().equals(P))&&(s.getYear().equals(PP))){
         ss=s.getName();
         y=s.getYear();
         r=s.getRollno();
         g=s.getGender();
         fa=s.getFathersname();
         ma=s.getMothersname();
         gm=s.getMail();
         phone=s.getContact();
         date=s.getDob();
        }
        }
          
        
        String[][] data = { 
            { "1.", "Name", ss }, 
            { "2.", "Year", y } ,
            {"3.","rollno",r},
            {"4.","Date Of Birth",date},
             {"5.","Fathers Name",fa},
            {"6.","Mothers Name",ma},
             {"7.","gender",g},
            {"8.","Nationality","Indian"},
           {"9.","Contact",phone},
            {"10.","mail",gm}
            
        }; 
  
        
        String[] columnNames = {  "S.No","Field", "Details" }; 
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300); 
  
        
        sp = new JScrollPane(j); 
        f.add(sp); 
        f.setSize(720,480); 
        f.setVisible(true); 
        
        
    }
   
    
}