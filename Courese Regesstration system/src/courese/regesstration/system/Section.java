/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courese.regesstration.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author iTTaste
 */
public class Section {
    static int id=0;
    int num;
    String courseCode;
    Instructor t;
    ArrayList<Student> std=new ArrayList<Student>();
    int numStd;
    int crdtHr;
    Section(String courseCode, Instructor t, int numStd, int crdt){
        this.num=++id;
        this.crdtHr=crdt;
        this.courseCode=courseCode;
        this.t=t;
        this.numStd=numStd;
    }
    
    public void addStudent(){
        Scanner scan=new Scanner(System.in);
        if(std.size()>numStd){
            System.out.println("Number of Student full!");
        }
        
        else{
            
            System.out.println("Enter Student Name: ");
            String name=scan.next();
            System.out.println("Enter Student Mail: ");
            String mail=scan.next();
            System.out.println("Enter Student Address: ");
            String address=scan.next();
            System.out.println("Enter Student cgpa: ");
            float cgpa=scan.nextFloat();
            scan.nextLine();
            System.out.println("Enter Student Semester: ");
            String semester=scan.next();
            std.add(new Student(name,address,mail,cgpa,semester));
        }
    }
    
    public void removeStudent(int id){
        for(int i=0; i<std.size(); i++){
            if(std.get(i).id==id){
                std.remove(i);
                break;
            }
        }
    }
    
    public int getSecNum(){
        return this.num;
    }
    public int getNumStd(){
        return this.numStd;
    }
    public int getCrdt(){
        return this.crdtHr;
    }
    
    public String getCourseCode(){
        return this.courseCode;
    }
}
