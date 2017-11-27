package ExercisesOnMethod;
import java.util.*;
public class OddTest {
	public static boolean isOdd(int x) {
		if(x%2==1 || x%2==-1)
			return true;
		else
			return false;
	}

	public static boolean isPositive(int x) {
		if(x>=0)
			return true;
		else
			return false;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		
		int x=sc.nextInt();
		System.out.println("Il tuo numero è: ");
		
		if(isOdd(x)==true) {
			System.out.println("dispari");
		}
		else {
			System.out.println("pari");
		}
		if(isPositive(x)==true) {
			System.out.println("e positivo");
		}
		else {
			System.out.println("e negativo");
		}
	}
}
