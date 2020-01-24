import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		sc.nextLine();
	
 		for(int i =0; i<n;i++) {
			
			String b[] = sc.nextLine().split(" ");
			
			int c = new Integer(b[0]).intValue();
			String[] a = b[1].split("");
			
	    	for(int l=0;l<a.length;l++) {	
			for(int j =0;j<c;j++) {
					System.out.print(a[l]);
			}
	    	}
	    	System.out.println();
 		}
	
 		
		sc.close();
		}
}
