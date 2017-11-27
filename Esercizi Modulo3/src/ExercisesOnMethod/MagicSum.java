package ExercisesOnMethod;
import java.util.*;
public class MagicSum {
	public static boolean hasEight(int x) {
		String num=String.valueOf(x);
		
		if(num.indexOf("8") >= 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int risultato=0;
		
		for(int i =0; i!=-1;) {
			System.out.println("Inserisci un numuero > 0 oppure -1 per uscire: ");
			i=sc.nextInt();
			if(hasEight(i)==true &&i>=0 ) {
				risultato+=i;
			}
		}
		System.out.println("La somma dei numeri con all'interno almeno un 8 è : " + risultato);

	}
}
