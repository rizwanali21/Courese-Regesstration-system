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
public class Person {
    int id;
    String name, address,mail;
    
    Person(int id,String name, String address, String mail){
        this.id=id;
        this.name=name;
        this.address=address;
        this.mail=mail;
    }
    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    String getMail(){
        return this.mail;
    }
    String getAdress(){
        return this.address;
    }
}
