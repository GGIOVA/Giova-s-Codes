import java.util.*;
public class BinariADecimali {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("");
		int[] numeri = new int[10];
		int cont=0;
		
			for(int i=0; i<10; i++) {
				
				System.out.println("Inserisci al massimo 10 elementi tra 0 o 1, per uscire digita -1: ");
				
				cont = sc.nextInt();
				
				
				if(cont==-1) {
					for(int j=i;j<10;j++) {
						numeri[j]=0;
					} 
					break;
					
				}
				numeri[i] = cont;
			}
				
				long result=0;
					for(int x=0;x < numeri.length;x++) {
						int potenzaDiDue=1;
						for(int j =0;j<x;j++) {
							potenzaDiDue=potenzaDiDue*2;
						}
						result=result+(numeri[x]*potenzaDiDue);
						
					}
					
				System.out.println("Il numero binario digitato è: ");
					for(int i=0;i<numeri.length;i++) {
						System.out.print(numeri[i]);
					}
			
				System.out.println("Il numero in base dieci è: " + result);
				
			
		
	}

}  // if(numeri[i]!=0 ||numeri[i]!=1 || numeri[i]!=-1) {
         //System.out.println("errore");
