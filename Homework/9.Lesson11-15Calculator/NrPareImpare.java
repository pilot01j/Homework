package Lesson11-15Calculator;

/* @author pilot*/
public class NrPareImpare {
    public void numere_pare ( int pare){
    pare = pare*2;
    for(int i=0;i< pare;++i){
    System.out.print(i%2==0?i+" ":""); 
    }
    }
    public void numere_impare ( int impare){
    impare = impare*2;
    for(int i=0;i< impare;i++){
    if (i%2!=0)
    System.out.print(i+" ");}
    }
}
    


    

