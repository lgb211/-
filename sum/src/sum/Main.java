package sum;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
	    char z;
	    int [] m = new int[n];
		int b= 0,sum=0;
	
		for(int i = 0 ; i<n;i++) {
			m [i]=(int) a.charAt(i);
			
	    	sum += (m[i]-48);
		}
		System.out.println(sum);
	}
}
