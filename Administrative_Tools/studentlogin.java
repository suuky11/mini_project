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


public class studentlogin extends JFrame  implements ActionListener{

    JFrame frame;
    JButton studentdetails ,academicdetails,feedetails,attendancedetails;
    Image img = Toolkit.getDefaultToolkit().getImage("I:\\sky.jpg");
    TextField t1,t2;
    JLabel l1,l2;
    studentlogin() throws IOException{
         frame=new JFrame("STUDENT LOGIN");
        frame.setContentPane(new JPanel() {
       public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      
        
        t1=new TextField();
        t1.setBounds(300,150,200,30);

        l1=new JLabel("enter the roll number:");
        l1.setBounds(150,150,150,30);

        l2=new JLabel("enter the Year:");
        l2.setBounds(150,200,150,30);
        
        

        t2=new TextField();
        t2.setBounds(300,200,200,30);
        
        t1.addActionListener(this);
        t2.addActionListener(this);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
       
        frame.add(t1);
        frame.add(t2);
        frame.add(l1);
        frame.add(l2);
        setVisible(true);
        frame.setSize(720,480);
        frame.setLayout(null);
        frame.setVisible(true);
    }    
   
        
    
    public static void main(String[] args) throws IOException {
       // new studentlogin() ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=t1.getText();
        //System.out.println(s);
        
        String ss=t2.getText();
        //System.out.println(ss);
        try {
           studentperformance obj= new studentperformance(s,ss);
            
        } catch (IOException ex) {
            Logger.getLogger(studentlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}