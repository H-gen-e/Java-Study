package ch01;

import java.util.Scanner;

public class ConcatenateStrings {

	public static void main(String[] args) {
		
		//takes input through Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your korean score :");
		String kor = sc.nextLine();
		System.out.print("Enter your english score : ");
		String eng = sc.nextLine();
		System.out.print("Enter your mathematics score : ");
		String mat = sc.nextLine();
		
		//show output through a simple message
		System.out.printf("You got %s on your Korea test, %s on english test and %s on mathematics.\n", kor,eng,mat);
		
		//Unbox the inputs and get sum of them
		int korSco = Integer.parseInt(kor);
		int engSco = Integer.parseInt(eng);
		int matSco = Integer.parseInt(mat);
		
		int sum = korSco + engSco + matSco;
		
		//Display results through a simple message
		System.out.printf("Display values : %d %d %d.\n", korSco, engSco, matSco);
		System.out.printf("Display sum value : %d.\n", sum);
		
	}
	
}
