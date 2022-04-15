/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrationForm implements ActionListener {
    JLabel l1, l2, l3, l4, l5,l6,l7,l8,l9,l10;
        JTextField t1, t2, t3,t4,t5,t6,t7,t8;
        JComboBox j1, j2;
        JButton b1, b2;
        JFrame f;
   RegistrationForm ()  {



         f= new JFrame( "Student Details Form");
        
        l1 = new JLabel("Candidate Name:");
        l1.setBounds(50, 70, 100, 30);
        l10=new JLabel("Date Of Birth");
        l10.setBounds(50,150,100,30);
        t8=new JTextField();
        t8.setBounds(160,150,130,30);
        l2 = new JLabel("Course:");

        l2.setBounds(50, 120, 120, 30);

        l3 = new JLabel("gender:");

        l3.setBounds(50, 190, 50, 30);
        
        l8=new JLabel("Contact");
        l8.setBounds(50,230,50,50);
        t6=new JTextField();
        t6.setBounds(150,230,150,30);
        
        l9=new JLabel("EMail");
        l9.setBounds(50,280,50,50);
        l4 = new JLabel("year:");
        t7=new JTextField();
        t7.setBounds(150,280,150,30);
        l4.setBounds(420, 50, 70, 30);

        l5 = new JLabel("id:");

        l5.setBounds(420, 120, 70, 30);
        
        l6=new JLabel("FathersName");
        l6.setBounds(420,180,100,30);
        t4=new JTextField();
        t4.setBounds(420,200,200,30);
        t5=new JTextField();
        t5.setBounds(420,290,200,30);
        l7= new JLabel("MothersName");
        l7.setBounds(420,270,100,30);

        t1 = new JTextField();

        t1.setBounds(150, 70, 130, 30);

        t2 = new JTextField();

        t2.setBounds(160, 120, 130, 30);

        t3 = new JTextField();

        t3.setBounds(490, 120, 130, 30);

        String s1[] = {"  ", "male","female","transgender"};

        String s2[]= {"  ", "firstA", "firstB"};

        

        j1 = new JComboBox(s1);

        j1.setBounds(120, 190, 100, 30);

        j2 = new JComboBox(s2);

        j2.setBounds(470, 50, 140, 30);

        b1 = new JButton("Save");

        b1.setBounds(150, 360, 70, 30);

        b2 = new JButton("close");

        b2.setBounds(420, 360, 70, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        



        f.add(l1);

        f.add(t1);

        f.add(l2);

        f.add(t2);

        f.add(l3);

        f.add(j1);

        f.add(l4);

        f.add(j2);

        f.add(l5);

        f.add(t3);

        f.add(b1);

        f.add(b2);
        f.add(l6);
        f.add(l7);
        f.add(t4);
        f.add(t5);
        f.add(l8);
        f.add(l9);
        f.add(t6);
        f.add(t7);
        f.add(l10);
        f.add(t8);

        f.setLayout(null);

        f.setSize(700, 600);

        f.setVisible(true);

    }

   

    public static void main(String args[]) {

        new RegistrationForm();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(b1.getModel().isArmed()){
           String name=t1.getText();
           String course =t2.getText();
           String roll=t3.getText();
           String Date=t8.getText();
           String father=t4.getText();
           String mother=t5.getText();
           String contact=t6.getText();
           String mail=t7.getText();
           String gender=String.valueOf(j1.getSelectedItem());
           String Year=String.valueOf(j2.getSelectedItem());
           System.out.println(name+roll+Year+gender+Date+father+mother+contact+mail+course);
           StudentList obj=new StudentList();
           obj.AddStudent(name,roll,Year,gender,Date,father,mother,contact,mail,course);
           try {
               obj.writeContentToFile();
           } catch (IOException ex) {
               Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       if (b1.getModel().isArmed()){
           
           JOptionPane.showMessageDialog(f,"Successfully Saved" + " The Details");

            }
       if (b2.getModel().isArmed()){
           
           

            }
           
       }
    
}
    

