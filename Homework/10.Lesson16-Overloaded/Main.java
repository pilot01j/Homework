
import java.util.Scanner;
/* @author pilot*/
public class Main {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Alege optiunea:"+
                        "\n"+"1.Calculator cu 2 parapetri."+
                        "\n"+"2.Procent."+
                        "\n"+"3.Employee.");
    int option = sc.nextInt();
    switch (option) {
    case 1 :
    Calculator obj = new Calculator();
    System.out.println ("Alege tipul de date:"+
                       "\n"+"1.Integer."+
                       "\n"+"2.Float."+  
                       "\n"+"3.Long."+
                       "\n"+"4.Double.");  
    int option2=sc.nextInt();
    if (option2 == 1){
    System.out.print ("Introduceti primul numar: ");
    int a = sc.nextInt();
    System.out.print ("Introduceti al doilea numar: ");
    int b = sc.nextInt();    
    System.out.println (a+" + "+b+" = "+obj.add (a,b)+
                   "\n"+a+" - "+b+" = "+obj.reduction (a,b)+
                   "\n"+a+" * "+b+" = "+obj.multiplying (a,b)+
                   "\n"+a+" / "+b+" = "+obj.division(a,b));}
    if (option2==2){
    System.out.print ("Introduceti primul numar: ");
    float a = sc.nextFloat();
    System.out.print ("Introduceti al doilea numar: ");
    float b = sc.nextFloat();    
    System.out.println (a+" + "+b+" = "+obj.add (a,b)+
                   "\n"+a+" - "+b+" = "+obj.reduction (a,b)+
                   "\n"+a+" * "+b+" = "+obj.multiplying (a,b)+
                   "\n"+a+" / "+b+" = "+obj.division(a,b));}
    if (option2==3){
    System.out.print ("Introduceti primul numar: ");
    long a = sc.nextLong();
    System.out.print ("Introduceti al doilea numar: ");
    long b = sc.nextLong();    
    System.out.println (a+" + "+b+" = "+obj.add (a,b)+
                   "\n"+a+" - "+b+" = "+obj.reduction (a,b)+
                   "\n"+a+" * "+b+" = "+obj.multiplying (a,b)+
                   "\n"+a+" / "+b+" = "+obj.division(a,b));}
    if (option2==4){
    System.out.print ("Introduceti primul numar: ");
    double a = sc.nextDouble();
    System.out.print ("Introduceti al doilea numar: ");
    double b = sc.nextDouble();
    System.out.println (a+" + "+b+" = "+obj.add (a,b)+
                   "\n"+a+" - "+b+" = "+obj.reduction (a,b)+
                   "\n"+a+" * "+b+" = "+obj.multiplying (a,b)+
                   "\n"+a+" / "+b+" = "+obj.division(a,b));}
    break;
    
    case 2 :
    Calculator pr = new Calculator();    
    System.out.println ("Alege tipul de date:"+
                   "\n"+"1.Integer."+
                   "\n"+"2.Float."+
                   "\n"+"3.Long."+  
                   "\n"+"4.Double.");  
    int option3=sc.nextInt();
    if (option3 == 1){
    System.out.print ("Introduceti numarul: ");
    int a = sc.nextInt();
    System.out.print ("Introduceti valoarea %: ");
    int b = sc.nextInt();    
    System.out.println ("100 % = "+a+"\n"+b+" % "+" = "+pr.percent(a,b));}
    if (option3==2){
   System.out.print ("Introduceti numarul: ");
    float a = sc.nextFloat();
    System.out.print ("Introduceti valoarea %: ");
    float b = sc.nextFloat();    
    System.out.println ("100 % = "+a+"\n"+b+" % "+" = "+pr.percent(a,b));}
    if (option3==3){
    System.out.print ("Introduceti numarul: ");
    long a = sc.nextLong();
    System.out.print ("Introduceti valoarea %: ");
    long b = sc.nextLong();    
    System.out.println ("100 % = "+a+"\n"+b+" % "+" = "+pr.percent(a,b));}
    if (option3==4){
    System.out.print ("Introduceti numarul: ");
    double a = sc.nextDouble();
    System.out.print ("Introduceti valoarea %: ");
    double b = sc.nextDouble();
    System.out.println ("100 % = "+a+"\n"+b+" % "+" = "+pr.percent(a,b));}
    break;
    
    case 3:
    System.out.println ("Introduceti datele angajatului:");
    System.out.print ("Numele: ");
    String name = sc.next();
    System.out.print ("Prenumele: ");
    String surname2 = sc.next();
    System.out.print ("Position: ");
    String position = sc.next();
    System.out.print ("Salary: ");
    String salary = sc.next();
    System.out.print ("Sex: ");
    String sex= sc.next();
    System.out.print ("Nationality: ");
    String nationality = sc.next();
    System.out.print ("Age: ");
    String age = sc.next();
    System.out.print  ("IDNO: ");
    String IDNO = sc.next();
    //Employee em = new Employee(name,surname2,position,salary,sex,nationality,age,IDNO);
    
    System.out.println ("Selecteza datele care doresti sa fie afisate:");
    System.out.println ("1.Nume , Prenume.");
    System.out.println ("2.Nume , Prenume , Position , Salary.");  
    System.out.println ("3.Toate datele."); 
    int option4=sc.nextInt();
    if (option4 == 1){
    Employee em1 = new Employee(name,surname2);
    System.out.println("\n"+" Name: "+em1.name +"\n"+" Surname: "+em1.surname2);}
    if (option4 == 2){
    Employee em2 = new Employee(name,surname2,position,salary);
    System.out.println("\n"+" Name: "+em2.name +"\n"+" Surname: "+em2.surname2+"\n"+" Position: "+em2.position+"\n"+" Salary: "+em2.salary);}
    if (option4 == 2){
    Employee em = new Employee(name,surname2,position,salary,sex,nationality,age,IDNO);
    System.out.println("\n"+" Name: "+em.name +"\n"+" Surname: "+em.surname2+"\n"+" Position: "+em.position+"\n"+" Salary: "+em.salary+"\n"+" Sex: "+em.sex+"\n"+" Nationality: "+em.nationality+"\n"+" Age: "+em.age+"\n"+" IDNO: "+em.IDNO);}
    break;
    }
    }    
}
