package Breakevenpoint;
import java.util.*;
public class BreakEvenPoint {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String [] value = sc.nextLine().split(" "); 
	
	int lockup = 0,variable = 0,sale = 0,sum=0,count = 1;
	
	for(int i = 0 ; i<value.length;i++) {
		 if(i ==0) 
		 lockup = Integer.parseInt(value[i]);
		 if(i == 1) 
		 variable = Integer.parseInt(value[i]);
		 if(i == 2)
		 sale = Integer.parseInt(value[i]);
		
	}
	System.out.println((lockup/(sale-variable))+1);
	/*while (true) {
		
		if(lockup+variable*count<sum) {
			
			System.out.println(count-1);	
			break;
		}else if(lockup>2100000000 ||variable>2100000000 || sale >2100000000) {
			System.out.println("-1");
			break;
		}
		
		sum += sale;
		count ++;
	
	}*/
	sc.close();
}
}
