package dial;

import java.util.*;

public class dial {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String n = sc.nextLine();
	String[] m = n.split("");
	int temp = 1,sum = 0;
	for(int i = 0; i<m.length;i++) {
		switch(m[i]) {
		case "A":
		case "B":
		case "C":
			temp += 2;
			break;
		case "D":
		case "E":
		case "F":
			temp += 3;
			break;
		case "G":
		case "H":
		case "I":
			temp += 4;
			break;
		case "J":
		case "K":
		case "L":
			temp += 5;
			break;
		case "M":
		case "N":
		case "O":
			temp += 6;
			break;
		case "P":
		case "Q":
		case "R":
		case "S":
			temp += 7;
			break;
		case "T":
		case "U":
		case "V":
			temp += 8;
			break;
		case "W":
		case "X":
		case "Y":
		case "Z":
			temp += 9;
			break;
		}
		sum += temp;
		temp = 1;
	}
	System.out.println(sum);
}
}
