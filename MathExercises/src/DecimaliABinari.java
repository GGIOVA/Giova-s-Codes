import java.util.*;
public class DecimaliABinari {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci un decimale");
		int dec = sc.nextInt();
		int decRis = dec;
		int cont = 0;
		for (; dec > 0;) {
			dec = (dec-(dec%2))/2;
			cont++;
		 }
		int [] giova = new int[cont];
		System.out.print("la conversione binaria di " + decRis + "è : ");
		for (int i = 0; i < cont; i++) {
			giova[i] = decRis%2;
			decRis = (decRis-(decRis%2))/2;
			}
		
		for (int i = cont - 1; i >= 0; i--) {
			System.out.print(giova[i]);
			}

		}

}