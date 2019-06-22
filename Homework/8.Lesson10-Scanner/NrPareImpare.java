import java.util.Scanner;
public class NrPareImpare {
	public static void main(String [ ] args) {
	Scanner number = new Scanner(System.in); 
	System.out.print("Setati cite numere pare doriti :");
	int pare = number.nextInt(); 
	System.out.print("Setati cite numere impare doriti :");
	int impare = number.nextInt(); 
	System.out.print("Primele "+pare+" numere pare:");
	pare=pare*2;
	for(int i=0;i<pare;i++){
	if (i%2==0)
	System.out.print(i+" ");}
	System.out.print('\n'+"Primele "+impare+" numere impare:"); 
	impare=impare*2;
	for(int i=0;i<impare;i++){
	if (i%2!=0)
	System.out.print(i+" ");
	}  
	}
}
