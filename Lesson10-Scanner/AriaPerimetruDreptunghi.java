import java.util.Scanner;
public class AriaPerimetruDreptunghi {
	public static void main(String [ ] args) {
	Scanner patrat = new Scanner(System.in);
	System.out.println("Calcularea Ariei si Perimetrului unui dreptunghi cu lungimea laturilor x,y .");
	System.out.print("Introduceti lungimea laturei x :");
        double x = patrat.nextDouble();
	System.out.print("Introduceti lungimea laturei y :");
	double y = patrat.nextDouble();
	double aria = x*y ;
	double perimetru = (x+y)*2;
	System.out.println("Aria dreptunghiului ="+aria);
	System.out.println("Primetrul dreptunghiului ="+perimetru);
	}
}