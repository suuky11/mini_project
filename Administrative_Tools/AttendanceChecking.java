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
import javax.swing.JLabel;
import javax.swing.JTextField;
public class AttendanceChecking extends JFrame {
    JFrame frame;
    String d,dd;
    JLabel l,l2,l3,l4,l5;
    String one1,two1;
    AttendanceChecking(String A,String AA) throws IOException, FileNotFoundException, ClassNotFoundException{
        frame=new JFrame("YOUR ATTENDANCE DETAILS");
        d=A;
        dd=AA;
     
        
        
        int p=checking(A,AA);
        String pp=String.valueOf(p);
        l=new JLabel(pp);
        l.setBounds(250,50,50,50);
        l2=new JLabel("Number of Days Absentees");
        l2.setBounds(0,50,250,50);

        frame.add(l);
        frame.add(l2);
        frame.setSize(720,480);
        frame.setLayout(null);
        frame.setVisible(true);
       
}
     public int checking(String x,String xx) throws FileNotFoundException, IOException, ClassNotFoundException{
       StudentList obj1=new StudentList();
       Student student=null;
       for(int i=0;i<obj1.studentList.size();i++){
       student = obj1.studentList.get(i);
       if((student.getRollno().equals(x) )&&( student.getYear().equals(xx)))
           return student.getAbsent();
       
       }
      
       
       return 0;
    }
    public static void main(String[] args) {
      
    }
    
}
