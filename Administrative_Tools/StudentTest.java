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
import java.io.Serializable;


public class StudentTest {
    StudentTest(String a) throws FileNotFoundException, IOException, ClassNotFoundException{
        
           System.out.println("not found file");
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("studentdata.txt"));
        int flag=0;
        for (int i=0;i<3;i++){
          
          Student member=(Student)obj1.readObject();
          String aa=member.getRollno();
          if (a.equalsIgnoreCase(aa)){
                  System.out.println(a+"is here");
                  flag=1;
                  break;
        }
        }
        System.out.println(obj1.readObject());
        obj1.close();
        if (flag!=1)
           System.out.println("not found");
    }
    public static void main  (String[] args)throws IOException, ClassNotFoundException {
        
        ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
        ObjectInputStream obj1=new ObjectInputStream(new FileInputStream("studentdata.txt"));
        Student []objs=new Student[6];
        
        objs[0]=new Student("renu","1","firstA","female","23.09.2001","perumal","jeyanthi","9876543215","renu@gmail.com","cse");
        objs[1]=new Student("menu","2","firstA","female","21.03.2001","pandi","kamali","9270543215","menu@gmail.com","ece");
        objs[2]=new Student("ram","1","firstB","male","13.09.2001","peter","rohini","9876543444","ram@gmail.com","eee");
        objs[3]=new Student("bindhu","2","firstB","female","03.09.2001","paul","varsha","9876543215","bindhu@gmail.com","cse");
        objs[4]=new Student("ravi","1","secondA","male","28.03.2000","ragu","jeyanthi","9876543888","ravi@gmail.com","civil");
        objs[5]=new Student("ravanan","2","secondA","male","27.09.2000","akash","vanathi","9876222215","ravanan@gmail.com","cse");
        
        
        obj.writeObject(objs[0]);
        obj.writeObject(objs[1]);
        obj.writeObject(objs[2]);
        obj.writeObject(objs[3]);
        obj.writeObject(objs[4]);
        obj.writeObject(objs[5]);
        obj.close();

         
      for (int i=0;i<6;i++){
          System.out.println(obj1.readObject());
      }

     obj1.close();
    
    }
}