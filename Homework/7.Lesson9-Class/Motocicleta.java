public class Motocicleta {
    	String model;
    	String culoare;
	int pret;
	public void test(){
	System.out.println ("Este testata de client");}
	public void salon(){
	System.out.println ("Este in salon");}
	public void park (){
	System.out.println ("Este in parcare");}
	public static void main(String []args){
	Motocicleta mot1 = new Motocicleta(); 
	mot1.model = "SUZUKI";
	mot1.culoare = "Verde";
	mot1.pret = 5000;
	System.out.print ("Model Motocicleta :"+" "+mot1.model+'\n');
	System.out.print ("Culoare :"+" "+mot1.culoare+'\n');
	System.out.print ("Pret :"+" "+mot1.pret+" "+"EURO"+'\n');
   	mot1.test();
	}	
	} 