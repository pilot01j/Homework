import java.util.Scanner;
public class Fibonaci {
	public static void main(String [ ] args) {
	Scanner fib_num = new Scanner(System.in); 
	long f = fib_num.nextLong();
	long a=0;
	long b=1;
	long c; 
	System.out.print("Primele "+f+" numere Fibonaci :"+a+" "+b);  
	for(long i=2;i<f;++i){
	c=a+b;  
	System.out.print(" "+c);  
	a=b;  
	b=c;}  
	}
}
