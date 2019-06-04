public class Car {
	String modelul;
	String culoarea;
	byte virsta;
	public void merbine(){
	System.out.print ("Masina merge bine");}
	public void merrau(){
	System.out.print ("Masina merge rau");}
	public void repara (int zile){
	System.out.print ("Masina se repara"+" "+zile+" "+"zile");}
	public static void main(String []args){
	Car car1 = new Car(); 
	car1.modelul = "BMW X3"; 
	car1.culoarea = "Neagra";
	car1.virsta = 6;
	System.out.print ("Modelul"+" "+car1.modelul+'\n');
	System.out.print ("Culoarea"+" "+car1.culoarea+'\n');
	System.out.print ("Virsta"+" "+car1.virsta+'\n');
	car1.repara(12);
	}	
} 