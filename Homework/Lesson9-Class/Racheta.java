public class Racheta {
	String name;
	String carburant;
	byte tonaj ;
	public void start (){
	System.out.print ("Racheta isi ia startul"+'\n');}
	public void lan(){
	System.out.print ("Racheta lanseaza in cosmos satelitul "+'\n');}
	public void retur (){
	System.out.print ("Racheta se returneaza pe Pamint");}
	public static void main(String []args){
	Racheta roket = new Racheta(); 
	roket.name = "Falcon 9"; 
	roket.carburant= "Kerosen+Oxigen lichid";
	roket.tonaj = 12;
	System.out.print ("Model :"+" "+roket.name+'\n');
	System.out.print ("Carburant :"+" "+roket.carburant+'\n');
	System.out.print ("Tonaj maxim admis :"+" "+roket.tonaj+" "+"t"+'\n');
	roket.start();
	roket.lan();
	roket.retur();
	}	
} 