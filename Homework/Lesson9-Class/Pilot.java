public class Pilot {
	String name;
	char sex ;
	byte age ;
	public void zboara (){
	System.out.print ("Zboara cu avionul"+'\n');}
	public void sare (){
	System.out.print ("Sare din avion"+'\n');}
	public void aterizeaza (){
	System.out.print ("Aterizeaza cu parasuta");}
	public static void main(String []args){
	Pilot p4 = new Pilot(); 
	p4.name = "Filip Moris"; 
	p4.sex= 'M';
	p4.age = 34;
    	System.out.print ("Name :"+" "+p4.name+'\n');
	System.out.print ("Sex:"+" "+p4.sex+'\n');
	System.out.print ("Age :"+" "+p4.age+" "+'\n');
	p4.zboara();
	p4.sare ();
	p4.aterizeaza();
	}	
} 