public class Trotineta {
    	String nr;
   	String tip;
	int val;

	public void arenda(int o){
	System.out.println ("Este data in arenda pe :"+" "+o+" "+"zile");}
	public void incarca(){
	System.out.println ("Se incarca");}
	public void nimic (){
	System.out.println ("Sta in parcare");}

	public static void main(String []args){
	Trotineta trot45 = new Trotineta(); 
	trot45.nr = "Tr0045";
	trot45.tip = "Electrica";
	trot45.val = 1200;
	System.out.print ("Trotineta :"+" "+trot45.nr+'\n');
	System.out.print ("Tip:"+" "+trot45.tip+'\n');
	System.out.print ("Valoarea :"+" "+trot45.val+" "+"lei"+'\n');
   	 trot45.arenda(8);
	}	
	} 