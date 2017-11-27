
public class ArrayScacchiera {

	public static void main(String[] args) {
		/*OPPURE
		  for(int i=0;i<8;i++) {
			if(i%2==0) {
				

			for(int j=0;j<8;j++) {
				if(j%2==0) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
			}
			System.out.println();
			}
			else {
				for(int j=0;j<8;j++) {
					if(j%2==0) {
						System.out.print(1);
					}
					else {
						System.out.print(0);
					}
				}
				System.out.println();
				
			}
		}
	}
}
*/

		for(int row=0;row<8;row++){	
			for(int col=0;col<8;col++){
				
				System.out.print((col+row)%2);
			} 
			System.out.println();
		}
	}
}
		

