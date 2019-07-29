
package Main;

import Employee.Accountant;
import Employee.Manager;
import Employee.Programmer;

public class Main {
    public static void main (String [] args){
    System.out.println("Accountant:");
    Accountant a1= new Accountant ("Ion","Vozian","26","1234");
    Accountant a2= new Accountant ("Ion","Vozian","26","1234");
    System.out.println (a1 + "\n" + a2);
    if(a1.equals(a2))
    System.out.println("Sult identici!");
    else
    System.out.println("Nu sunt identici!");
  
    System.out.println("\n"+"Manager:");
    Manager m1 = new Manager ("Stefan","Surugiu","30","8523");
    Manager m2 = new Manager ("Nicu","Ionescu","30","14523");
    System.out.println (m1 + "\n" + m2);
    if(m1.equals(m2))
    System.out.println("Sult identici!");
    else
    System.out.println("Nu sunt identici!");
    
    System.out.println("\n"+"Programmer:");
    Programmer p1 = new Programmer ("Gheorghe","Lungu","37","8523");
    Programmer p2 = new Programmer("Nicu","Chiriac","39","14545");
    System.out.println (p1 + "\n" + p2);
    if(m1.equals(m2))
    System.out.println("Sult identici!");
    else
    System.out.println("Nu sunt identici!");
    }
    }
    