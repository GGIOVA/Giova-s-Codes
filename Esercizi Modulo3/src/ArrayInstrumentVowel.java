
public class ArrayInstrumentVowel {

	public static void main(String[] args) {
		String[] s= {"cello","guitar","violin","double bass"};
		
		for(String strumento : s) {                             // fro each!!!
			for(char c : strumento.toCharArray()) {
				if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') {
					/* OPPURE
					 * switch (c) {
					 * case 'a':
					 * case'e':
					 * case'i':
					 * case'o':
					 * case'u':
					 * 	break;
					 * default:
					 */
					System.out.print(c);
					}
					
				}
			System.out.println();
		}
	}

}
