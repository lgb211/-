package Breakevenpoint;
import java.util.*;
public class BreakEvenPoint {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String [] value = sc.nextLine().split(" "); 
	
	int lockup = 0,variable = 0,sale = 0;
	
	for(int i = 0 ; i<value.length;i++) {
		 if(i ==0) 
		 lockup = Integer.parseInt(value[i]);
		 if(i == 1) 
		 variable = Integer.parseInt(value[i]);
		 if(i == 2)
		 sale = Integer.parseInt(value[i]);
		
	}
	if(variable>=sale)
		System.out.println(-1);
	else
		System.out.println((lockup/(sale-variable))+1);
	
	sc.close();
}
}
