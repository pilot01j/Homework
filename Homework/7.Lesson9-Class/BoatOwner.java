public class BoatOwner {
	String name;
	char sex ;
	byte age ;
	public void visleste (){
	System.out.print ("Visleste pe lac cu o luntre"+'\n');}
	public void inoata (){
	System.out.print ("Inoata"+'\n');}
	public void repara (){
	System.out.print ("Repara luntrea");}
	public static void main(String []args){
	BoatOwner owner = new BoatOwner(); 
	owner.name = "James Gosling"; 
	owner.sex= 'M';
	owner.age = 64;
    	System.out.print ("Name :"+" "+owner.name+'\n');
	System.out.print ("Sex:"+" "+owner.sex+'\n');
	System.out.print ("Age :"+" "+owner.age+" "+'\n');
	owner.visleste();
	owner.inoata ();
	owner.repara ();
	}	
} 