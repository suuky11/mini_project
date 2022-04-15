/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
public class FeesDetails extends JFrame  implements ActionListener {
    Frame f;
    int n,m,p;
    JButton b1,ok;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
    JTextField t1;
    String one,two,three,four,five,six,four1,five1,six1,one1,two1,three1,total,nn,mm,paid,r,y;
    FeesDetails (String roll,String ss) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.print(roll);
        System.out.print(ss);
        
         fee obj2=new fee();
         r=roll;
         y=ss;
         one1=obj2.tutionfee;
         two1=obj2.transport;
         three1=obj2.miscelaneous;
         f=new Frame("Fees Details");
         
        StudentList objj=new StudentList();
    
        for (int i=0;i<objj.studentList.size();i++){
          Student s=objj.studentList.get(i);
          if((s.getCourse().equals("cse"))&&(s.getRollno().equals(roll))){
              cse obj=new cse ();
              System.out.println("tution fee "+obj.getTutionfee()+"transport "+obj.getTransport()+"Misclaneous"+obj.getMiscelaneous()+"lab fee "+obj.getLabEntryCard()+
              "BOOTCAMP "+ obj.getBootcamp()+"Library membership "+obj.getLibrarymembership());
             four="lab fee ";four1=obj.getLabEntryCard();
              five="BOOTCAMP ";five1=obj.getBootcamp();
              six="Library membership ";six1=obj.getLibrarymembership();
              p=s.getPaid();
              paid=String.valueOf(p);
              
              break;
          }
          if((s.getCourse().equals("ece"))&&(s.getRollno().equals(roll))){
              ece obj=new ece();
              System.out.println("tution fee "+obj.tutionfee+"transport "+obj.transport+"Misclaneous"+obj.miscelaneous+"circuitLabEntryCard "+obj.getCircuitLabEntryCard()+
              "workshop1"+ obj.getWorkshop1()+"workshop2 "+obj.getWorkshop2());
              four="circuitLabEntryCard " ;four1=obj.getCircuitLabEntryCard();
              five="workshop1";five1=obj.getWorkshop1();
              six="workshop2";six1=obj.getWorkshop2();
              
              
              
              
              
              break;
              
          }
          
          if((s.getCourse().equals("eee"))&&(s.getRollno().equals(roll))){
              eee obj=new eee();
              System.out.println("tution fee "+obj.tutionfee+"transport "+obj.transport+"Misclaneous"+obj.miscelaneous+"LabEntryCard "+obj.getLabEntryCard()+
              "Librarymembership"+ obj.getLibrarymembership()+"CircuitStuff "+obj.getCircuitStuff());
              
              four="LabEntryCard ";four1=obj.getLabEntryCard();
              five="Librarymembership";five1=obj.getLibrarymembership();
              six="CircuitStuff ";six1=obj.getCircuitStuff();
              
              
              
              break;
              
          }
          
          if((s.getCourse().equals("civil"))&&(s.getRollno().equals(roll))){
              civil obj=new civil();
              System.out.println("tution fee "+obj.tutionfee+"transport "+obj.transport+"Misclaneous"+obj.miscelaneous+"LabEntryCard "+obj.getLabEntryCard()+
              "SiteVisit"+ obj.getSiteVisit()+"EngineeringStuff"+obj.getEngineeringStuff());
              four="LabEntryCard ";four1=obj.getLabEntryCard();
              five="SiteVisit";five1=obj.getSiteVisit();
              six="EngineeringStuff";six1=obj.getEngineeringStuff();
              
            break;
              
          }
              
        }
        
        l1=new JLabel("FEE RECEIPT");
        l1.setBounds(250,50,100,100);
        f.add(l1);
        
        b1=new JButton("SAVE & EXIT");
        b1.setBounds(450,100,200,30);
        f.add(b1);
        
        l2=new JLabel("TUTION FEE :");
        l2.setBounds(200,150,100,100);
        f.add(l2);
        
        l3=new JLabel(one1);
        l3.setBounds(300,150,100,100);
        f.add(l3);
        
        l4=new JLabel("TRANSPORT");
        l4.setBounds(200,200,100,100);
        f.add(l4);
        
        l5=new JLabel(two1);
        l5.setBounds(300,200,100,100);
        f.add(l5);
        
        l6=new JLabel("MECELANEOUS");
        l6.setBounds(200,250,100,100);
        f.add(l6);
        
        l7=new JLabel(three1);
        l7.setBounds(300,250,100,100);
        f.add(l7);
        
        l8=new JLabel(four);
        l8.setBounds(200,300,100,100);
        f.add(l8);
        
        l9=new JLabel(four1);
        l9.setBounds(300,300,100,100);
        f.add(l9);
        
        l10=new JLabel(five);
        l10.setBounds(200,350,100,100);
        f.add(l10);
        
        l11=new JLabel(five1);
        l11.setBounds(300,350,100,100);
        f.add(l11);
        
        l12=new JLabel(six);
        l12.setBounds(200,400,100,100);
        f.add(l12);
        
        l13=new JLabel(six1);
        l13.setBounds(300,400,100,100);
        f.add(l13);
        n=Integer.valueOf(one1)+Integer.valueOf(two1)+Integer.valueOf(three1)+Integer.valueOf(four1)+Integer.valueOf(five1)+Integer.valueOf(six1);
        System.out.println(n);
        nn=String.valueOf(n);
        l14=new JLabel("total amount :");
        l14.setBounds(450,150,100,100);
        f.add(l14);
        
        
        l15=new JLabel(nn);
        l15.setBounds(550,150,100,100);
        f.add(l15);
        
        l19=new JLabel("paid ammount:");
        l19.setBounds(450,170,100,100);
        f.add(l19);
        
        l20=new JLabel(paid);
        l20.setBounds(550,170,100,100);
        f.add(l20);
        
        l16=new JLabel("enter amount");
        l16.setBounds(450,230,100,100);
        f.add(l16);
        
        t1=new JTextField();
        t1.setBounds(450,300,100,30);
        f.add(t1);
        

        ok=new JButton("ok");
        ok.setBounds(500,330,50,50);
        f.add(ok);
        ok.addActionListener(this);
       setVisible(true);
       f.setSize(720,480); 
       f.setLayout(null); 
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       f.setVisible(true); 
    }
    public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException,NoClassDefFoundError{
   
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(ok.getModel().isArmed())
        {   int i=Integer.valueOf(t1.getText());
            int k=n-i;
            JOptionPane.showMessageDialog(f,"BALANCE TO BE PAID: "+k);
           StudentList object= new StudentList();
           object.SetPayment(i,r,y);
            try {
                object.writeContentToFile();
            } catch (IOException ex) {
                Logger.getLogger(FeesDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}

    
    

