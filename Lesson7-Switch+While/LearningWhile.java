public class LearningWhile {
	public static void main(String[] args) {
	byte b=0;
      	System.out.println( "Numere(0-100):");
	while(b<=100){
	System.out.println(b);
	b++;
}
	System.out.println("Numere Pare (0-50):");
	byte b=0;// am adaugat "byte b=0" p/u ca codul mai departe nu imi arata nimic , sa inteleg ca dupa primul while b=100 si de aceea nu merge
	//expica te rog ?
	while(b<=50){
	if (b%2==0)if(b!=0)//am adaugat exceptia "b!=0" p/u ca imi arata ca 0 este numar par
	System.out.println(b);
	b++;
}
	System.out.println("Numere Impare (50-100): ");
	while (b<=100){//aici puteam sa scriu (b<=100 && b>=50) ca sa-mi arate nr impare >50 , dar merge si fara &&b>=50 ,interesant!
	//poate dupa primul while b ramine egal cu 50 ?
	if (b%2!=0)
	System.out.println(b);
	b++;
}
	}
}
