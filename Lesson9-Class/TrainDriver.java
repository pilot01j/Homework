public class TrainDriver {
	String name;
	String post;
	byte age ;
	public void porneste (){
	System.out.print ("Porneste trenul"+'\n');}
	public void conduce (){
	System.out.print ("Conduce Trenul"+'\n');}
	public void opreste (){
	System.out.print ("Opreste trenul");}
	public static void main(String []args){
	TrainDriver td = new TrainDriver(); 
	td.name = "Mount Bil"; 
	td.post= "Train Driver";
	td.age = 34;
    	System.out.print ("Name :"+" "+td.name+'\n');
	System.out.print ("Post:"+" "+td.post+'\n');
	System.out.print ("Age :"+" "+td.age+" "+"lei"+'\n');
	td.porneste();
	td.conduce();
	td.opreste();
	}	
} 