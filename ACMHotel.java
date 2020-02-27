package ACMHotel;

import java.util.Scanner;

public class ACMHotel {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt(); //t 번 반복
	
	for(int m=0;m<t;m++) {
   int h  =	sc.nextInt(); // 층
   int w  = sc.nextInt(); // 층의 방 개수
   int n  = sc.nextInt(); // 몇번째 가까운 방
   
   int [] hotel = new int[h*w]; 
   int count = 0;      
   String value ="";  //방번호 

   for(int i= 1;i<=w;i++) { //w 증가 
	   for(int j=1;j<=h;j++) {//h 증가
		   if(i<=9) {
		   value = j+"0"+i;
		   hotel[count] = Integer.parseInt(value);
		   count++;
		   }else {
		   value = j+""+i;
		   hotel[count] = Integer.parseInt(value);
		   count++;
		   }
		   
		   }
   }

   System.out.println(hotel[n-1]);//배열이 0번부터 시작이라 -1
   }
	sc.close();
}
}
