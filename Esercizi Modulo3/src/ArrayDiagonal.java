
public class ArrayDiagonal {

	public static void main(String[] args) {
		/*String[] s= {"G","i","a","c","o","m","o"};
		
		for(int i=0;i<s.length;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			System.out.println(s[i]);
		}
	*/
		
		String testo="GIACOMO";
		int j=0;
		
		for(char c : testo.toCharArray()) {
			for(int i=0;i<j;i++) {
				
				System.out.print(" ");
			}
			System.out.println(c);
			j++;
		}
	}
}
