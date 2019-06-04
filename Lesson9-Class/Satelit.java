public class Satelit {
        String model;
        int tonaj;
	int pret;
	public void inst(){
	System.out.println ("Este instalat in Racheta");}
	public void lans(){
	System.out.println ("Este lansat in cosmos");}
	public void trans(){
	System.out.println ("Transmite date");}
	public static void main(String []args){
	Satelit st = new Satelit(); 
	st.model = "WiFI Satelite";
	st.tonaj = 10;
	st.pret = 2550000;
	System.out.print ("Model :"+" "+st.model+'\n');
	System.out.print ("Tonaj :"+" "+st.tonaj+'\n');
	System.out.print ("Pret :"+" "+st.pret+" "+"EURO"+'\n');
        st.inst();
        st.lans();
        st.trans();
    
	}	
	} 