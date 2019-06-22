package Lesson11-15Calculator;

/*@author pilot*/
public class Alfabet {
    void leter (char c){
    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
    System.out.println( c+" - este o vocala");}
    else if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
    System.out.println(c+" - este o consoana ");
    else
    System.out.println("Nu este o litera!");		
    }
}
	
        

    

