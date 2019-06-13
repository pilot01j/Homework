public class Mecanic {
	String name;
	String post;
	int salary ;
	public void auto (int a){
	System.out.print ("Repara masina"+"  "+a'\n');}
	public void truk(){
	System.out.print ("Repara autocistena"+'\n');}
	public void notWork (){
	System.out.print ("Nu luccreaza/Se odihneste");}
	public static void main(String []args){
	Mecanic  mk = new Mecanic(); 
	mk.name = "Lungu Ion"; 
	mk.post= "Mecanic";
	mk.salary = 30000;
   	System.out.print ("Nume :"+" "+mk.name+'\n');
	System.out.print ("Post :"+" "+mk.post+'\n');
	System.out.print ("Salariu :"+" "+mk.salary+" "+"lei"+'\n');
	mk.auto(12);
	mk.truk ();
	mk.notWork ();
	}	
} 