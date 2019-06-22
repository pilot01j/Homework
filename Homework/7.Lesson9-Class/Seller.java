public class Seller {
	String name;
	String post;
	int salary ;
	public void arenda (){
	System.out.print ("Da in arenda trotinete "+'\n');}
	public void prezinta (){
	System.out.print ("Prezinta motocicleta clientului"+'\n');}
	public void notWork (){
	System.out.print ("Nu luccreaza/Odihneste");}
	public static void main(String []args){
	Seller  sl4 = new Seller(); 
	sl4.name = "Atip Ion"; 
	sl4.post= "Seller";
	sl4.salary = 25000;
   	System.out.print ("Nume :"+" "+sl4.name+'\n');
	System.out.print ("Post :"+" "+sl4.post+'\n');
	System.out.print ("Salariu :"+" "+sl4.salary+" "+"lei"+'\n');
	sl4.arenda ();
	sl4.prezinta ();
	sl4.notWork ();
	}	
} 