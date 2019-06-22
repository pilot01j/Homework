public class Client {
	String name;
	char sex;
	byte age ;
	public void autobuz (int b){
	System.out.print ("Merge cu Autobuzul"+" "+b+" "+"zile"+'\n');}
	public void test (int c){
	System.out.print ("Testeaza Motocicleta"+" "+c+" "+"zile"+'\n');}
	public void arenda (int d){
	System.out.print ("Ia in arenda Trotineta"+" "+d+" "+"zile");}
	public static void main(String []args){
	Client  cl = new Client (); 
	cl.name = "Carp Ion"; 
	cl.sex= 'M';
	cl.age = 19;
        System.out.print ("Name :"+" "+cl.name+'\n');
	System.out.print ("Sex:"+" "+cl.sex+'\n');
	System.out.print ("Age :"+" "+cl.age+" "+'\n');
	cl.autobuz(1);
	cl.test(1);
	cl.arenda(8);
	}	
} 