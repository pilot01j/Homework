class AlfabetNota {
	public static void main(String[ ] args) {
	char  leter = 'Z';
	byte nota = 10;
	switch (leter){
	case 'A' :
	case 'E' :
	case 'I' :
	case 'O' :
	case 'U' :
	System.out.println(leter+" este o vocala");
	break;
	default:
	System.out.println(leter+" este o consoana");
	}
	switch (nota){
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	System.out.println(nota+" Insuficient") ;
	break;
	case 6:
	case 7:
	System.out.println(nota+" Satisfacator");
	break;
	case 8:
	case 9 :
	System.out.println(nota+" Bine");
	break;
	case 10 :
	System.out.println(nota+" Formidabil");
	break;
	default:
	System.out.println (nota+" Serios ?");
	}
	}
}
