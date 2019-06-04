public class Bicicleta {
	String model;
	String culoare ;
	byte viteze ;
	public void deal (){
	System.out.print ("Bicileta merge greu la deal");}
	public void stationeaza(){
	System.out.print ("Bicicleta stationeaza ");}
	public void vale (){
	System.out.print ("Bicicleta zboara la vale");}
	public static void main(String []args){
	Bicicleta bike1 = new Bicicleta(); 
	bike1.model = "Scott SPARK"; 
	bike1.culoare= "Negru Metalic";
	bike1.viteze = 32;
	System.out.print ("Modelul :"+" "+bike1.model+'\n');
	System.out.print ("Culoare :"+" "+bike1.culoare+'\n');
	System.out.print ("Nr de viteze:"+" "+bike1.viteze+'\n');
	bike1.vale();
	}	
} 