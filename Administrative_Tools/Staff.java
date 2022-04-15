/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrative_tools;

import java.io.Serializable;
public class Staff implements Serializable {
private String name;
private String id;
private String gender;
private String year;
private String course;
private String TeachingStaff;
private String qualification;

    public Staff(String name, String id, String gender, String year, String course, String TeachingStaff, String qualification) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.year = year;
        this.course = course;
        this.TeachingStaff = TeachingStaff;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeachingStaff() {
        return TeachingStaff;
    }

    public void setTeachingStaff(String TeachingStaff) {
        this.TeachingStaff = TeachingStaff;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

   
    
    
}
    

    

