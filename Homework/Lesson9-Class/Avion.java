public class Avion {
	String modelul;
	int viteza_max;
	int nr_locuri;
	public void zboara(int vit){
	System.out.print ("Avionul zboara cu viteza de"+" "+vit+" "+"km/h");}
	public void aterizeaza(){
	System.out.print ("Avionul aterizeaza");}
	public void decoleaza (){
	System.out.print ("Avionul decoleaza");}
	public static void main(String []args){
	Avion av1 = new Avion(); 
	av1.modelul = "Aerobus 380"; 
	av1.viteza_max = 800;
	av1.nr_locuri = 450;
	System.out.print ("Modelul :"+" "+av1.modelul+'\n');
	System.out.print ("Viteza maxima :"+" "+av1.viteza_max+" "+"km/h"+'\n');
	System.out.print ("Numarul de Locuri :"+" "+av1.nr_locuri+'\n');
	av1.zboara(600);
	}	
} 