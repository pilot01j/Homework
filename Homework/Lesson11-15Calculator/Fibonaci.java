package Lesson11-15Calculator;
/* @author pilot */
public class Fibonaci {
        int a=0;
	int b=1;
	int c;
   public void fibonacci(int f) {
        System.out.print("Primele "+f+" numere Fibonaci: "); 
	for(int i=1;i<f;++i){
        System.out.print(i==1?a+" "+b+" ":c+" "); 
	c=a+b;  
	a=b;  
	b=c;
        }     
   }
}
	