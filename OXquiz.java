import java.util.Scanner;
public class OXquiz {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	String [] b = new String[n];
	int sum=0,pl=0;
	for(int i=0;i<n;i++) {
		b[i] = sc.next();
		for(int j = 0; j<b[i].length();j++) {
			 if(b[i].charAt(j)=='O') {
				pl++;
				 sum += pl;
			 }else {
				 pl = 0;
			 }
		 }
	System.out.println(sum);
	sum=0;
	pl=0;
	}
	sc.close();
	
}
}
