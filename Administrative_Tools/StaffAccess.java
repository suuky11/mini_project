/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class StaffAccess extends JFrame implements ActionListener{
    JFrame frame;
    JButton teachingstaff ,nonteachingstaff, studentattendance;
    Image img = Toolkit.getDefaultToolkit().getImage("I:\\HOME.jpg");
    String h;
    StaffAccess(String ident) throws IOException{
         frame=new JFrame("STAFF ACCESS");
         h=ident;
        frame.setContentPane(new JPanel() {
       
         
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            System.out.println("inside panel");
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      setVisible(true);
       
       
        teachingstaff= new JButton("Staff Details");
      
        studentattendance=new JButton("Student Attendance");
       
       
       teachingstaff.setBounds(250, 50, 150, 40);
       teachingstaff.setBackground(Color.WHITE);
       
        
        studentattendance.setBounds(250,250,150,40);
        studentattendance.setBackground(Color.WHITE);
        
         
        teachingstaff.addActionListener(this);
        studentattendance.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
      
        frame.add(teachingstaff);
      
       
       frame.add(studentattendance);
        
       
        frame.setSize(720,480);
       
       
        frame.setLayout(null);
         
       
        frame.setVisible(true);
       
        
        
    } 

   
    public static void main(String[] args) throws IOException {
        //new StaffAccess();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(teachingstaff.getModel().isArmed()){
            try {
                new StaffDetails(h);
        } catch (IOException ex) {
            Logger.getLogger(StaffAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StaffAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if(studentattendance.getModel().isArmed()){
            try {
                new StudentAttendance();
            } catch (IOException ex) {
                Logger.getLogger(StaffAccess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}