public class LearningWhile {
	public static void main(String[] args) {
	byte a=0;
	byte b=0;/* am adaugat "byte b=0" p/u ca programul facea doar prima intructiune "white (0<=100)" ,de ce nu efectua pe restu nu am inteles*/
      	System.out.println( "Numere(0-100):");
	while(a<=100){
	System.out.println(a);
	a++;
}
	System.out.println("Numere Pare (0-50):");
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
