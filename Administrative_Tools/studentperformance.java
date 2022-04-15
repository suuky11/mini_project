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


public class studentperformance extends JFrame implements ActionListener{

    JFrame frame;
    JButton studentdetails ,academicdetails,feedetails,attendancedetails;
    Image img = Toolkit.getDefaultToolkit().getImage("I:\\sky.jpg");
    String a,aa;
    studentperformance(String s,String ss) throws IOException{
        frame=new JFrame("Student Performance");
        a=s;
        aa=ss;
        frame.setContentPane(new JPanel() {
       
         
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      setVisible(true);
        studentdetails= new JButton("Student Details");
       
        feedetails=new JButton("fees Details");
        attendancedetails=new JButton("Attendance Details");
       
       studentdetails.setBounds(250, 50, 150, 40);
       studentdetails.setBackground(Color.WHITE);

       feedetails.setBounds(250,200,150,40);
       feedetails.setBackground(Color.WHITE);
        attendancedetails.setBounds(250,350,150,40);
        attendancedetails.setBackground(Color.white);
         
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        
        frame.add(studentdetails);
        
        frame.add(feedetails);
        frame.add(attendancedetails);
        
        studentdetails.addActionListener(this);
        feedetails.addActionListener(this);
        attendancedetails.addActionListener(this);
       
        frame.setSize(720,480);
        frame.setLayout(null);
        frame.setVisible(true);
    }    
   
        
    
    public static void main(String[] args) throws IOException {
       
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(studentdetails.getModel().isArmed()){
            try {
                new StudentDetails(a,aa);
            } catch (IOException ex) {
                Logger.getLogger(studentperformance.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(studentperformance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(feedetails.getModel().isArmed()){
            
        
            try {
                //new FeesDetails(a,aa);
                FeesDetails obj=new FeesDetails (a,aa);
            } catch (IOException ex) {
                Logger.getLogger(studentperformance.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(studentperformance.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (NoClassDefFoundError ex) {
                Logger.getLogger(studentperformance.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(attendancedetails.getModel().isArmed()){
            try {
                new AttendanceChecking(a,aa);
            } catch (IOException ex) {
                Logger.getLogger(studentperformance.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(studentperformance.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
}