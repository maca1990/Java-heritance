/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author camil
 */
class Student extends estudiante{
    public static void main (String[]args){
        estudiante S = new Student();
        estudiante S2 = new Student();
        
        S.insertRecord(111, "Camilo");
        S2.insertRecord(222, "Felipe");
        
        S.displayInformation();
        S2.displayInformation();
    }
}
class estudiante{  
 int rollno;  
 String name;  
 
 void insertRecord(int rollno, String name){  
  this.rollno=rollno;  
  this.name=name;  
 }  
 void displayInformation(){System.out.println(rollno+" "+name);} 
   
}