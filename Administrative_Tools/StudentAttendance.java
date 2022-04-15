/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class StudentAttendance implements ActionListener{
     JFrame frame;
  
    Image img = Toolkit.getDefaultToolkit().getImage("I:\\sky.jpg");
    TextField t1;
    JComboBox cb;
    JLabel l;
    JButton enter,logout;
    String s,n;
    StudentList obj=new StudentList();
    StudentAttendance() throws IOException{
        frame=new JFrame("Student Attendance");
        frame.setBackground(Color.yellow);
       
        frame.setContentPane(new JPanel() {
      
         
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            System.out.println("inside panel");
            g.drawImage(img, 0, 0, null);
         }
      });
      frame.pack();
      frame.setVisible(true);
       enter=new JButton("ENTER");
       enter.setBounds(350,200,100,50);
       logout=new JButton("LOG OUT");
       logout.setBounds(400,300,100,50);
       t1=new TextField();
        t1.setBounds(400,150,250,30);
        l=new JLabel("enter the roll number:");
        l.setBounds(250,150,150,30);
       
        String[]s={"firstA","firstB","secondA","secondB"};
        cb=new JComboBox(s);
        cb.setBounds(50,100,150,20);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        frame.add(cb);
        frame.add(t1);
        frame.add(l);
        frame.add(enter);
        frame.add(logout);
        
        t1.addActionListener(this);
        enter.addActionListener(this);
        cb.addActionListener(cb) ;
        logout.addActionListener(this);
        frame.setSize(720,480);
        frame.setLayout(null);
         frame.setVisible(true);
 }    
   
    
    public static void main(String[] args) throws IOException {
    new StudentAttendance();   
     
    }
   
    
    public void actionPerformed(ActionEvent e) {
        s=String.valueOf(cb.getSelectedItem());
        n=t1.getText();
        
        System.out.println(s+n);
        
        if(enter.getModel().isArmed()){
            
            obj.MarkStudentAbsent(s, n);
        }
        if (logout.getModel().isArmed()){
            try {
                System.out.println("entering to write");
                obj.writeContentToFile();
            } catch (IOException ex) {
                Logger.getLogger(StudentAttendance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
 
        
        
        
        
        
        
        
        
    }
}
    
