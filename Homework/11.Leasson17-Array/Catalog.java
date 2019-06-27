
import java.util.Scanner;
/* @author User*/
 
public class Catalog {
    String [] students;
    Scanner sc = new Scanner(System.in);
    int i = 0;
    
    public void StringWhile (){
    System.out.println("\n" + "String array - while method.");
    System.out.print("Setati lungimea Array: ");
    int num = sc.nextInt();
    students = new String [num];
    System.out.println("Introduceti "+num+" elemente in  Array: ");
    i = 0;
    while (i < students.length) {
    students[i] = sc.next();
    i++;}
    }
    public void StringFor (){
    System.out.println("\n" + "String array - for method.");  
    System.out.print("Setati lungimea Array :");
    int num = sc.nextInt();
    students = new String [num];
    System.out.println("Introduceti "+num+" elemente in  Array: ");
    for (i = 0; i < students.length; i++) {
    students[i] = sc.next();}
    } 
    public void StringDoWhile (){
    System.out.println("\n" + "String array - do-while method.");
    System.out.print("Setati lungimea Array :");
    i = sc.nextInt();
    System.out.println("Introduceti "+i+" elemente in  Array:");
    students = new String [i];
    i = 0;
    do {
    students[i] = sc.next();
    i++;}
    while (i < students.length);
    }
    
   
    public void print (){
    Catalog print = new Catalog();
    i=0;
    System.out.println ("\n"+"Printarea array-lui:");
    for (String el : students){
    System.out.println (++i+". "+el);}
    }
}
   
    
    
    
