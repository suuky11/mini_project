/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import java.io.Serializable;

public class Student implements Serializable {

   private String name;
   private String rollno;
   private String year;
   private int absent;
   private int no_of_days;
   private String gender;
   private String dob;
   private String fathersname;
   private String mothersname;
   private String contact ;
   private String mail;
   private String course;
   private int paid;

    public Student(String name, String rollno, String year, String gender, String dob, String fathersname, String mothersname, String contact, String mail, String course) {
        this.name = name;
        this.rollno = rollno;
        this.year = year;
        this.gender = gender;
        this.dob = dob;
        this.fathersname = fathersname;
        this.mothersname = mothersname;
        this.contact = contact;
        this.mail = mail;
        this.course = course;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    public int getNo_of_days() {
        return no_of_days;
    }

    public void setNo_of_days(int no_of_days) {
        this.no_of_days = no_of_days;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFathersname() {
        return fathersname;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    public String getMothersname() {
        return mothersname;
    }

    public void setMothersname(String mothersname) {
        this.mothersname = mothersname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    
   

}
