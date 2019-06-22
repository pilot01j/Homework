public class Luntre {
	String material;
	String culoare ;
	byte loc ;
	public void pluteste (){
	System.out.print ("Luntrea pluteste pe lac");}
	public void mal(){
	System.out.print ("Luntrea sta la malul lacului ");}
	public void scufunda (){
	System.out.print ("Luntrea se scufunda in lac");}
	public static void main(String []args){
	Luntre boat = new Luntre(); 
	boat.material = "Lemn"; 
	boat.culoare= "Albastra";
	boat.loc = 4;
	System.out.print ("Luntrea este din :"+" "+boat.material+'\n');
	System.out.print ("Luntrea are culoarea  :"+" "+boat.culoare+'\n');
	System.out.print ("Nr de locuri :"+" "+boat.loc+'\n');
	boat.pluteste();
	}	
} 