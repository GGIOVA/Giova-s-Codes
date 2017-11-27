
public class Cornice {

	public static void main(String[] args) {
		int n=9;
		int i=1;
		int j=1;
		boolean cresceI=true;
		boolean cresceJ=true;
		while(i>0)
		/*for(int i=1;i<=(n*2);i++)*/ {
		while(j>0)	/*for(int j=1;j<=(n*2);j++)*/ {
				if(i<=j) {
					System.out.print(i);

				}else {
					System.out.print(j);
				}
				if(cresceJ && j<n) {
					j++;}
				else {
					cresceJ=false;
					j--;}
			}
			System.out.println();
			j=1;
			cresceJ=true;
			if(cresceI && i<n) {
				i++;}
			else {
				cresceI=false;
				i--;}
		}

	}

}
