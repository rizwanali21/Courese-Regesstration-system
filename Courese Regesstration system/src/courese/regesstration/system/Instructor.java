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
public class Instructor extends Person{
    static int id=0;
    double salary;
    Instructor(String name, String address, String mail, double salary){
        super(++id,name,address,mail);
        this.salary=salary;
    }
    
    double getSalary(){
        return this.salary;
    }
}
