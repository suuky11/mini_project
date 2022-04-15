/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;
import java.awt.event.ActionEvent;
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
import javax.swing.*; 

/**
 *
 * @author Sukky
 */
public class Project extends JFrame implements ActionListener {

   JFrame frame; 
    JButton about ,studentlogin,stafflogin,registration; 
    Image img = Toolkit.getDefaultToolkit().getImage("I:\\HOME.jpg"); 
    Project() throws IOException {
        frame=new JFrame("WELCOME TO ADMINISTRATIVE TOOLS"); 
        frame.setContentPane(new JPanel() {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      
      about= new JButton("About"); 
      studentlogin=new JButton("Student Login");
      stafflogin=new JButton("Staff Login");
      registration=new JButton("REGISTRTION");
        
       about.setBounds(450, 50, 150, 40); 
       registration.setBounds(450,130,150,40);
       registration.setBackground(Color.WHITE);
       about.setBackground(Color.WHITE);
       studentlogin.setBounds(450,200,150,40);
       studentlogin.setBackground(Color.WHITE);
       stafflogin.setBounds(450,300,150,40);
       stafflogin.setBackground(Color.WHITE);
       
       frame.add(about); 
       frame.add(registration);
       frame.add(studentlogin);
       frame.add(stafflogin);
       
       about.addActionListener(this);
       studentlogin.addActionListener(this);
       stafflogin.addActionListener(this);
       registration.addActionListener(this);
       setVisible(true);
       frame.setSize(720,480); 
       frame.setLayout(null); 
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       frame.setVisible(true); 
    }    
    public static void main(String[] args) throws IOException {
       new Project();
    }
     @Override   
    public void actionPerformed(ActionEvent e) {
        
        if(registration.getModel().isArmed()){
            
            new RegistrationForm();
        }
        
        if(about.getModel().isArmed()){
            
        
            new About();
            
        }
        if (studentlogin.getModel().isArmed()){
            
          try {
                
                new studentlogin() ;
              } 
            catch (IOException ex) {
            
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
         if (stafflogin.getModel().isArmed()){
             
        try {
                new Stafflogin();
        } 
        catch (IOException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
         }

 
    
    } 
}
    