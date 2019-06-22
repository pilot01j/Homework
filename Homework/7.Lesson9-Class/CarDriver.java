public class CarDriver {
	String name;
	char sex;
	byte age ;
	public void merge (){
	System.out.print ("Merge cu masina"+'\n');}
	public void strica (){
	System.out.print ("Strica masina"+'\n');}
	public void jos (int a){
	System.out.print ("Merge pe jos:"+" "+a);}
	public static void main(String []args){
	CarDriver cd = new CarDriver(); 
	cd.name = "Carp Ion"; 
	cd.sex= 'M';
	cd.age = 19;
    	System.out.print ("Name :"+" "+cd.name+'\n');
	System.out.print ("Sex:"+" "+cd.sex+'\n');
	System.out.print ("Age :"+" "+cd.age+" "+'\n');
	cd.merge();
	cd.strica();
	cd.jos(2);
	}	
} 