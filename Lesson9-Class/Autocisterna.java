public class Autocistena {
	String model;
	double capMot ;
	int tonaj ;
	public void incarca(){
	System.out.print ("Autocisterna se incarca");}
	public void descarca(){
	System.out.print ("Autocisterna se descarca");}
	public void transporta (){
	System.out.print ("Autocisterna transporta marfa");}
	public static void main(String []args){
	Autocistena cam = new Autocistena(); 
	cam.model = "MAN TGA 18.410"; 
	cam.capMot = 12.50;
	cam.tonaj = 32000;
	System.out.print ("Modelul :"+" "+cam.model+'\n');
	System.out.print ("Capacitatea motorului :"+" "+cam.capMot+'\n');
	System.out.print ("Tonajul maxim transportat:"+" "+cam.tonaj+" "+"litri"+'\n');
	cam.transporta();
	}	
} 