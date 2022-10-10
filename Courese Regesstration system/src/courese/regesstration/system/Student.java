/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courese.regesstration.system;

/**
 *
 * @author iTTaste
 */
public class Student extends Person{
    static int sId=0;
    float cgpa;
    String semester;
    Student(String name, String address, String mail, float cgpa,String semester){
        super(++sId,name,address,mail);
        this.cgpa=cgpa;
        this.semester=semester;
    }
    
    float getCgpa(){
        return this.cgpa;
    }
    
    String getSemester(){
        return this.semester;
    }
}
