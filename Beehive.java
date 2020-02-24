package Beehive;

import java.util.Scanner;

public class Beehive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //입력한 방
		int count = 0;        // 지나가는 방 개수
		Beehive bee = new Beehive();
		
		count = bee.room(n,count);
		System.out.println(count);
		
		sc.close();
	}
	
	public int room(int n,int count) {
		int i = 6; 
		int increase = 0; //둘러싼 방의 수
		int a = 0;
		int sum = 1; 

		if(n == 1)
			 count ++;
		while(n>sum) {  
			sum = sum+a; 
			increase += i;	    
			a = increase;     
			count++;   
		}
		
		return count;
	}
}
