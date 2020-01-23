import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String[] num = new String [26] ;
		int adr = 0;
		for(int i = 0;i<n.length();i++) {
		
		for(char a = 'a'; a<='z';a++) {
		if(a == n.charAt(i)) {
			if(num[adr] == "-1" || num[adr]== null) {
			num[adr] = Integer.toString(i);
			
			
			}
		}else if(a != n.charAt(i) && num[adr]== null) {
			
			num[adr] = "-1";
			
			}
		
		adr++;
		}
		adr=0;
		}
		for(String x : num) {
			System.out.println(x);
		}
	}

}
