
import java.util.Scanner;

/* @author User*/
public class Main {
    public static void main ( String[] args ){ 
    Scanner sc = new Scanner(System.in);
    Catalog  arr = new Catalog  ();
    System.out.println("Alege metoda de formare a String array: "+
    "\n"+"1. While."+"\n"+"2. For."+"\n"+"3. Do While");
    int option = sc.nextInt();
    switch(option){
    case 1: 
           arr.StringWhile();
           arr.print();
           break;
    case 2:
           arr.StringFor();
           arr.print();
           break;
    case 3:
           arr.StringDoWhile();
           arr.print();
           break;
    }
  }
}