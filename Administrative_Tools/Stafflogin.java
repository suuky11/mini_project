/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Stafflogin extends JFrame implements ActionListener{

    JFrame frame;
  
    Image img = Toolkit.getDefaultToolkit().getImage("I:\\sky.jpg");
    TextField t1,t2;
    JLabel l1,l2;
    JButton b;
    Stafflogin()throws IOException{
        frame=new JFrame("STAFF LOGIN");
        frame.setContentPane(new JPanel() {
       
         
         public void paintComponent(Graphics g) {
            super.paintComponent(g);
            System.out.println("inside panel");
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      setVisible(true);
        
       
       
         
       
        t1=new TextField();
        t1.setBounds(300,150,200,30);
        b=new JButton("GO");
        b.setBounds(300,250,100,50);
        l1=new JLabel("ID NUMBER:");
        l1.setBounds(150,150,150,30);

        l2=new JLabel("enter the  date of birth:");
        l2.setBounds(150,200,150,30);

        t2=new TextField();
        t2.setBounds(300,200,200,30);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(this);
        frame.add(b);
        frame.add(t1);
        frame.add(t2);
        frame.add(l1);
        frame.add(l2);
        
        frame.setSize(720,480);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }    
   
   public static void main(String args[]) throws IOException{
       //new Stafflogin();
   }      
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(b.getModel().isArmed()){
            System.out.println("iam selecetd");
            String identity;
            identity=t1.getText();
            try {
               StaffAccess obj= new StaffAccess(identity);
            } catch (IOException ex) {
                Logger.getLogger(Stafflogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
