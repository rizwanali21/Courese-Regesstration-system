/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courese.regesstration.system;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author iTTaste
 */
public class CoureseRegesstrationSystem {

    /**
     * @param args 
     * @throws java.io.IOException 
     * @throws java.lang.InterruptedException 
     */
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        char ch = 0;
        int c = 0;
        ArrayList<Section> sec = new ArrayList<>();
        do{
           System.out.println("Enter 1 to add new Section: ");
           System.out.println("Enter 2 to add new Student: ");
           System.out.println("Enter 3 remove student: ");
           System.out.println("Enter 4 to get Average student: ");
           System.out.println("Enter 5 to display all Section: ");
           System.out.println("Enter 6 to save in file: ");
           c=scan.nextInt();
           scan.nextLine();
           
           switch(c){
               case 1:
                   System.out.println("Enter Number of Students: ");
                   int num=scan.nextInt();
                   scan.nextLine();
                   System.out.println("Enter Credit Hrs: ");
                   int crdtHr=scan.nextInt();
                   scan.nextLine();
                   System.out.println("Enter Course code: ");
                   String code=scan.next();
                   scan.nextLine();
                   System.out.println("Enter Instructor Name: ");
                   String name=scan.next();
                   System.out.println("Enter Instructor Mail: ");
                   String mail=scan.next();
                   System.out.println("Enter Instructor Address: ");
                   String address=scan.next();
                   System.out.println("Enter Instructor salary: ");
                   double salary=scan.nextDouble();
                   scan.nextLine();
                   Instructor i=new Instructor(name,address,mail,salary);
                   sec.add(new Section(code,i,num,crdtHr));
                   break;
                   
               case 2:
                   if(sec.isEmpty())System.out.println("No section exist");
                   else{
                   System.out.println("Enter Section Id to add Student in: ");
                   int sn=scan.nextInt();
                   scan.nextLine();
                   for(int j=0;j<sec.size();j++){
                       if(sec.get(j).num==sn){
                           
                           sec.get(j).addStudent();
                           break;
                       }
                       else System.out.println("Invalid");
                   }
                   }
                   break;
                   
                   
               case 3:
                   if(sec.isEmpty())System.out.println("No section exist");
                   else{
                   System.out.println("Enter Section Id to remove Student from: ");
                   int sn=scan.nextInt();
                   scan.nextLine();
                   System.out.println("Enter Student id to Remove: ");
                   int std=scan.nextInt();
                   scan.nextLine();
                   for(int j=0;j<sec.size();j++){
                       if(sec.get(j).num==sn){
                           sec.get(j).removeStudent(std);
                           break;
                       }
                       else System.out.println("Invalid");
                   }
                   }
                           
                   break;
                   
               case 4:
                   float avg=0;
                   int j;
                   for(j=0;j<sec.size();j++){
                       avg+=sec.get(j).getNumStd();
                       
                   }
                   avg=avg/j;
                   System.out.println("Average num of students: "+avg);
                   break;
                   
               case 5:
                   for(j=0;j<sec.size();j++){
                       System.out.println("Section Id: "+sec.get(j).getSecNum());
                       System.out.println("Section CourseCode: "+sec.get(j).getCourseCode());
                       System.out.println("Section credit hrs: "+sec.get(j).getCrdt());
                       System.out.println("Number of Students Allowed: "+sec.get(j).getNumStd());
                       System.out.println("Instructor Id: "+sec.get(j).t.id);
                   }
                   break;
               case 6:
                   FileWriter writer = new FileWriter("MyFile.txt", true);
                   for(j=0;j<sec.size();j++){
                       try {
                            
                            writer.write(sec.get(j).getSecNum()+"\t"+sec.get(j).getCourseCode()+"\t"+sec.get(j).getNumStd()+"\t"+sec.get(j).getCrdt()+"\n");
                            writer.write("\r\n");   // write new line
                            
                            } 
                       catch (IOException e) {
                             e.printStackTrace();
                                }
                   }writer.close();
                   break;
               default:
                   System.out.println("Invalid!!");
                   break;
           }
           
           System.out.println("Enter Y to enter more and N to Exit: ");
           ch=scan.next().charAt(0);
           scan.nextLine();
        }while(ch=='Y'||ch=='y');
    }
    
}
