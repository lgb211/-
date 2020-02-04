package Numberofwords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Words {


public static void main(String[] args) throws IOException {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String n = bf.readLine();
	String[] a = n.split(" ") ;
	int count =0;
	
	for(int i =0; i<a.length;i++) {
	if(a[i]==null || a[i].length() == 0) {
		count++;
	}
	}
	System.out.println(a.length-count);
}

}
