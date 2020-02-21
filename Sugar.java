package sugar;
import java.util.*;
public class Sugar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt(); 
		int count = 0;
		
		Sugar su = new Sugar();
		count =su.bag(n,count);
		System.out.println(count);
		
	}
	
	public int bag(int n,int count) {
		String x =Integer.toString(n);
		int a = 0;
		for(int i = 0;i<x.length();i++) {
			 a= n%10;
		}
		
		
		if(n>=3 && n!= 4 && n!=7) {					
		
		switch(a)
		{
			case 0:
				count = n/5;
				break;
			case 1:
				count = (n-6)/5+2;
				break;
			case 2:
				count = (n-12)/5+4;
				break;
			case 3:
				count = (n-3)/5+1;
				break;
			case 4:
				count = (n-9)/5+3;
				break;
			case 5:
				count = n/5;
				break;
			case 6:
				count = (n-6)/5+2;
				break;
			case 7:
				count = (n-12)/5+4;
				break;
			case 8:
				count = (n-3)/5+1;
				break;
			case 9:
				count = (n-9)/5+3;
				break;
		}
		
		}else  {
			count = -1;
		}
			
		return count;
		
	}
}
