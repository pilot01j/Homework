public class Tren {
    byte nr;
	String cursa;
	double ora;
	public void arive(){
	System.out.println ("Ajunge in gara");}
	public void start(){
	System.out.println ("Porneste din gara");}
	public void not (){
	System.out.println ("Va intirzia");}
	public static void main(String []args){
	Tren tr1 = new Tren(); 
	tr1.nr= 101;
	tr1.cursa = "Chisinau - Bucuresti";
	tr1.ora= 15.40;
	System.out.print ("Trenul cu nr :"+" "+tr1.nr+'\n');
	System.out.print (tr1.cursa+'\n');
	System.out.print ("La ora :"+" "+tr1.ora +'\n');
	tr1.start();
	}	
	} 