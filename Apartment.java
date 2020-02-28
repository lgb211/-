package Apartment;

import java.util.Scanner;

public class Apartment {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt(); //전체 테스트 횟수
	
	for(int i = 0; i<t; i++) {
		
		int k = sc.nextInt(); //층 수 1
		int n = sc.nextInt(); //호 수 3
		int count = 1;        //0층 값
		int[][] Apart = new int [k+1][n];//아파트 배열 
		
		for(int a = 0; a<=k;a++ ) { // 층 반복
			for(int j =0;j<n;j++) { // 호 반복
				if(a==0) {      // 0층 값 넣어주기
				Apart[a][j] = count;
				count++;
				}
				else {
					for(int b =0;b<=j;b++) { //자신의 아래층 1호부터 n까지 더하기
					Apart[a][j] += Apart[a-1][b];
				}
				}
			}
		
		}
		System.out.println(Apart[k][n-1]);
	
	}
	sc.close();
}
}
