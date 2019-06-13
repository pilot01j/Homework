import java.util.Scanner;
public class AriaPerimetruPatrat {
	public static void main(String [ ] args) {
	Scanner patrat = new Scanner(System.in);
	System.out.println("Calcularea Ariei si Perimetrului unui patrat");
	System.out.print("Introduceti lungimea laturei :");
        double x = patrat.nextDouble();
	double aria = x*x ;
	double perimetru = 4*x;
	System.out.println("Aria patratului ="+aria);
	System.out.println("Primetrul patratului ="+perimetru);
	}
}