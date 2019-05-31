//arata in ordine descrescatoare nr de la 100 pina la 0, la fel nr impare 100-50 si nr pare 50-0
class Forif {
  public static void main (String[] args ) {
      System.out.print ("Numere (100-0): "); 
      for (int i = 100; i <=100&&i>=0; i--) {
      System.out.print (i +" ");
      }System.out.println (); 


      System.out.print ( "Numere pare (50-0): "); 
      for (int i =100; i<=100&& i>0;i--){
      if (i<=50) if (i%2==0)
      System.out.print (i+" ");}
      System.out.println ();
      System.out.print("Numere impare (100-50): "); 
      for (int i=100; i>=50&&i<=100;i--){
      if (i%2!=0)
      System.out.print (i+" ");
    }    
   }
}
