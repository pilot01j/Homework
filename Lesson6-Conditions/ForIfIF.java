public class ForIfIF {
	public static void main (String [] args){
	int[] intArray = {1000,3,-7,100,75,-21,0,1,-301,67,3,-754,658,125,-128};
	for (int a : intArray) {		
	if (a==0){
	System.out.println (a+" = 0");
	} if (a>0){
	System.out.println (a+" > 0");
	} if(a<0){
	System.out.println (a+" < 0");
	}if(a%2==0){
	System.out.println (a+" este par");
	} if (a%2!=0){
	System.out.println (a+" este impar");
	}if (a>=-128&&a<=127){
	System.out.println (a+" este de tip byte"+"\n");
	}else{
	System.out.println (a+ " nu este de tip Byte"+"\n");}
	}
	}
}
