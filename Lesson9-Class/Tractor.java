public class Tractor {
    String model;
	String culoare;
	double motor;
	public void ara(){
	System.out.println ("Tractorul ara pamintul");}
	public void trans(){
	System.out.println ("Tractorul trasporta roda");}
	public void norWork (){
	System.out.println ("Tractorul nu lucreaza");}
	public static void main(String []args){
	Tractor trac = new Tractor(); 
	trac.model= "MTZ 65";
	trac.culoare = "Rosu";
	trac.motor= 5.40;
	System.out.print ("Model tractor :"+" "+trac.model+'\n');
	System.out.print ("Culoare :"+" "+trac.culoare+'\n');
	System.out.print ("Motorul :"+" "+trac.motor+'\n');
	trac.ara();
	trac.trans();
	trac.norWork();
	}	
	} 