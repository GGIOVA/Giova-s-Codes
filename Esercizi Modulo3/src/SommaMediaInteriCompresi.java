import java.util.Scanner;

public class SommaMediaInteriCompresi {

	public static void main(String[] args) {
		
		int a=3;
		int b=8;
		int somma=0;
		
		if(a<b) {
			for(int i=a;i<=b;i++) {
				somma=somma+i;  //somma+=i;  *=, /=, -=  (per i booleani  &=, |=)
			}
			System.out.println("Somma=>" + somma);
			System.out.println("MEDIA=>" + ((double)somma/(b-a+1)));  // + overload degli operatori...a seconda del tipo degli 
			                                                //operandi, l'operatore cambia la propria funzione
		}                                  //cast a double di somma/....     
	}
}
