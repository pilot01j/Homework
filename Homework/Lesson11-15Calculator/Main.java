package Lesson11-15Calculator;
import java.util.Scanner;
/* @author pilot*/
public class Main {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Alege optiunea ");
    System.out.println ("1.Operatiuni matematice cu 2 numere. ");
    System.out.println ("2.Calcularea Ariei si Perimetrului. ");
    System.out.println ("3.Vocala sau consoana. ");
    System.out.println ("4.Numere Fibonaci. ");
    System.out.println ("5.Numere Pare/Impare. ");
    int option = sc.nextInt();
    switch (option) {
    case 1 :
    System.out.println ("Alege operatiunea matematica: ");
    System.out.println ("1. Adunarea.");
    System.out.println ("2. Scaderea.");
    System.out.println ("3. Imultirea.");
    System.out.println ("4. Impartirea.");
    int option2 = sc.nextInt();       
    Calculator calc = new Calculator ();
    double x,y;
    System.out.print ("Introduceti primul numar:  ");
    x=sc.nextDouble();
    System.out.print ("Introduceti al doilea numar:  ");
    y=sc.nextDouble();
    switch (option2) {
        case 1:
        System.out.println(x+" "+"+"+" "+y+" "+"="+" "+calc.adunarea (x,y));
        break;
        case 2:
        System.out.println(x+" "+"-"+" "+y+" "+"="+" "+calc.scaderea (x,y));
        break;
        case 3:
        System.out.println(x+" "+"*"+" "+y+" "+"="+" "+calc.imultirea (x,y));
        break;
        case 4: 
        System.out.println(x+" "+"/"+" "+y+" "+"="+" "+calc.impartirea (x,y));
        break;}
    break;
   
    case 2 :
    System.out.println ("Alege figura geometrica: ");
    System.out.println ("1. Patrat.");
    System.out.println ("2. Dreotunghi.");
    Geometrie geo = new Geometrie ();
    int option3 = sc.nextInt();
    switch (option3) {
        case 1:
        System.out.print ("Introduceti lungimea laturei:  ");
        double p=sc.nextDouble();
        System.out.println("Aria patratului = " + geo.patrat_aria(p) );;
        System.out.println("Perimetrul patratului = "+ geo.patrat_perimetru (p));
        break;
        case 2:
        double lat, lon;  
        System.out.print ("Introduceti latitudinea:  ");
        lat=sc.nextDouble();
        System.out.print ("Introduceti longitudinea:  ");
        lon=sc.nextDouble();
        System.out.println("Aria dreptunghiului = "+geo.deptungi_aria (lat, lon));
        System.out.println("Perimetrul dreptunghiului = "+geo.dreptunghi_perimetru (lat, lon));
        break;}
    break;
    
    case 3:
    Alfabet abc = new Alfabet ();
    System.out.print ("Introduceti o litera :  ");
    char c = sc.next().charAt(0); 
    abc.leter(c); 
    break;
    
    case 4:
    Fibonaci d = new Fibonaci ();
    System.out.print ("Introduceti nr dorit de cifre Fibonaci:  ");
    int f =sc.nextInt ();
    d.fibonacci(f);
    //System.out.println(d.fibonacci(f));
    break;
    
    case 5:  
    System.out.println ("Alege numerele care doresti sa fie afisate : ");
    System.out.println ("1. Pare.");
    System.out.println ("2. Impare.");
    NrPareImpare nr = new NrPareImpare ();
    int option4 = sc.nextInt();
    switch (option4) {
        case 1:
        System.out.print ("Setati cite nr pare doriti sa afisati: ");
        int pare =sc.nextInt ();
        nr.numere_pare(pare);
        break;
        case 2:
        System.out.print ("Setati cite nr impare doriti sa afisati: ");
        int impare =sc.nextInt ();
        nr.numere_impare(impare);
        break;}
    break;
    }
    }
}
