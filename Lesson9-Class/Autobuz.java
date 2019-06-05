public class Autobuz {
    String nr;
	String ruta;
	byte loc;
	public void trans(){
	System.out.println ("Autobuzul lucreaza pe ruta");}
	public void stationeaza(){
	System.out.println ("Autobuzul stationeaza in parcare");}
	public void repara (){
	System.out.println ("Autobuzul se repara");}
	public static void main(String []args){
	Autobuz aut4 = new Autobuz(); 
	aut4.nr= "29";
	aut4.ruta = "Ciorescu-Chisinau";
	aut4.loc= 45;
	System.out.print ("Autobuzul nr :"+" "+aut4.nr+'\n');
	System.out.print ("Ruta :"+" "+aut4.ruta+'\n');
	System.out.print ("Locuri :"+" "+aut4.loc+'\n');
    aut4.trans();
	}	
	} 
