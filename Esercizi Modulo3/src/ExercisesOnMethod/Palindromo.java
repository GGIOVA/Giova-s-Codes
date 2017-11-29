package ExercisesOnMethod;
import java.util.*;
public class Palindromo {
	public static boolean isPal(String str) {
		if(str.equals(new StringBuilder(str).reverse().toString())) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(isPal(sc.nextLine()));

	}

}
