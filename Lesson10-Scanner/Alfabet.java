import java.util.Scanner;
public class Alfabet {
	public static void main(String [ ] args) {
	Scanner abc = new Scanner(System.in);
        char leter = abc.nextLine().charAt(0);
	switch (leter){
	case 'A' :  case 'a' :
	case 'E' :  case 'e' :
	case 'I' :  case 'i' :
	case 'O' :  case 'o' :
	case 'U' :  case 'u' :
	System.out.print("Litera "+leter+": este o vocala");
	break;
	default:
	System.out.print("Litera :"+leter+": este o consoana");
	}
	}
}