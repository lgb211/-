package sa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Constant {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String n1 = sc.next(); 
	String n2 = sc.next();
	
	String a = "";
	
	for(int i = n1.length()-1; i>=0;i--) {
		a += n1.charAt(i);
	}
	n1 = a;
	a = "";
	for(int i = n2.length()-1; i>=0;i--) {
		a += n2.charAt(i);
	}
	n2 = a;
	
	
	
	if(Integer.parseInt(n1) >Integer.parseInt(n2)) {
		System.out.println(n1);
	}else {
		System.out.println(n2);
	}
		
}
}
