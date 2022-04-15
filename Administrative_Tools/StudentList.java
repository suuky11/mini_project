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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentList {
          

   public List<Student> studentList=new ArrayList<>();
    public StudentList(){
        
        studentList=getStudentList();
        
    }
    
    public Student MarkStudentAbsent(String year,String roll){
        int flag=0,k=0;Student member=null;
            String []parts=roll.split(" ");
            for (int j=0;j<parts.length;j++){
               
            k=studentList.size();
            for (int i=0;i<k;i++){
                System.out.println(studentList.get(i).getName());
                boolean a=studentList.get(i).getRollno().equals(parts[j]);
                boolean b=studentList.get(i).getYear().equals(year);
                System.out.println(studentList.get(i).getRollno()+studentList.get(i).getYear());
                if ((a==true)&&(b==true)){
                    System.out.println(studentList.get(i).getName()+"is mathched");
                    
                    flag=1;
                    int no=studentList.get(i).getAbsent();
                    studentList.get(i).setAbsent(no+1);
                    member=studentList.get(i);
                    
                    studentList.remove(i);
                    studentList.add(i, member);
                    break;
                    
                                         }
            }
            
            }
       
        
        
        return member;
    
    }   
    
    public void writeContentToFile() throws FileNotFoundException, IOException{
        ObjectOutputStream wif=new ObjectOutputStream(new FileOutputStream("studentdata.txt"));
        for(int i=0;i<studentList.size();i++)
            wif.writeObject(studentList.get(i));
        
        
        System.out.println("co");
    }
    
    public void AddStudent(String name, String rollno, String year, String gender, String dob, String fathersname, String mothersname, String contact, String mail, String course){
        Student object=new Student(name,rollno,year,gender,dob,fathersname,mothersname,contact,mail,course);
        studentList.add(object);
    }
    public Student SetPayment(int val,String roll,String year){
        int flag=0,k=0;Student member=null;boolean a,b;
            
               System.out.println(roll+year);
            k=studentList.size();
            for (int i=0;i<k;i++){
                System.out.println(studentList.get(i).getName());
                a=studentList.get(i).getRollno().equals(roll);
                 b=studentList.get(i).getYear().equals(year);
                System.out.println(studentList.get(i).getRollno()+studentList.get(i).getYear());
                if ((a==true)&&(b==true)){
                    System.out.println(studentList.get(i).getName()+"is mathched");
                   
                    int no=studentList.get(i).getPaid();
                    System.out.println(no+"no");
                    studentList.get(i).setPaid(no+val);
                    member=studentList.get(i);
                    
                    studentList.remove(i);
                    studentList.add(i, member);
                    break;
                    
                                         }
            }
            
           
       
        
        
        return member;
    
    }   
    
    
    
    public List<Student> getStudentList(){
        
            ObjectInputStream obj1=null;
            
            
            try {
                obj1 = new ObjectInputStream(new FileInputStream("studentdata.txt"));
                int flag=0;
                Student student=null;
                try {
                    student = (Student)obj1.readObject();
                    System.out.println("reading"); 
                    studentList.add(student);
                } catch (IOException ex) {
                    student = null;
                }
                catch (ClassNotFoundException ex) {
                    student = null;
                    
                }

                while(student != null){
                 

                    try {
                        student = (Student) obj1.readObject();
                        if(student != null){
                           studentList.add(student);
                    }
                        
                            
                    } catch (IOException ex) {
                        student = null;
                    } catch (ClassNotFoundException ex) {
                        student = null;
                    }
                }

                return studentList;
            } catch (IOException ex) {
                
            } finally {
            try {
                obj1.close();
            } catch (IOException ex) {
                
            }
        }
             return new ArrayList<>();

    }
    
    
}
