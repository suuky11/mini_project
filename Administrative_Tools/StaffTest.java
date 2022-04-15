/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class StaffTest {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("staffdata.txt"));
       ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("staffdata.txt"));
       Staff []objs=new Staff[8];
objs[0]=new Staff("meena","101","female","first","ds","YES","M.phil");
objs[1]=new Staff("aari","102","male","second","oops","YES","Phd");
objs[2]=new Staff("jeya","103","female","third","dpsd","YES","M.sc");
objs[3]=new Staff("sneha","104","female","final","dm","YES","M.sc M.phil");
objs[4]=new Staff("surya","105","male","first","ce","YES","M.sc");
objs[5]=new Staff("suganya","201","female","nil","nil","NO","Phd");
objs[6]=new Staff("bala","202","male","nil","nil","NO","M.sc");
objs[7]=new Staff("nisha","203","female","nil","nil","NO","M.phil");
obj.writeObject(objs[0]); 
obj.writeObject(objs[1]);
obj.writeObject(objs[2]);
obj.writeObject(objs[3]);
obj.writeObject(objs[4]);
obj.writeObject(objs[5]);
obj.writeObject(objs[6]);
obj.writeObject(objs[7]);
obj.close();


//for (int i=0;i<8;i++){
//          System.out.println(obj1.readObject());
//      }
//obj1.close();
    }
    
}
