public class TrukDriver {
	String name;
	char sex;
	byte age ;
	public void draving (){
	System.out.print ("Merge "+'\n');}
	public void sleep(){
	System.out.print ("Doarme"+'\n');}
	public void eat (){
	System.out.print ("Maninca");}
	public static void main(String []args){
	TrukDriver  dr22 = new TrukDriver (); 
	dr22.name = "Nejivoi Ion"; 
	dr22.sex= 'M';
	dr22.age = 45;
	System.out.print ("Nume :"+" "+dr22.name+'\n');
	System.out.print ("Sex :"+" "+dr22.sex+'\n');
	System.out.print ("Age :"+" "+dr22.age+'\n');
	dr22.draving();
	dr22.sleep();
	dr22.eat();
	}	
} 