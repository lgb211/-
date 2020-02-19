package Time;
import java.util.*;
public class Alarm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int c =0;
		if(0 <= H && H <= 23 && 0 <=M && M<= 59) {
		if(H > 0) {
			if(M>45)
			System.out.println(H+" "+(M-45));
		else if(M<45) {
			c = 45-M;
			M = 60-c;
			System.out.println((H-1)+" "+M);}
		else if(M==45) {
			System.out.println(H +" "+0);
		}
		}
		else if(H ==0) {
			if(M<45) {
				c = 45-M;
				M = 60-c;
				System.out.println(23+" "+M);
			}else if(M==45) {
				System.out.println(H+" "+H);
			}else {
				System.out.println(H+" "+(M-45));
			}
		}
		}
	}
}
