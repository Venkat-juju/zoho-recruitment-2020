package zoho.recruitment;

import java.util.Scanner;

public class PatternProgramming2 {
	

	private static void printPattern(String word) {
		int len = word.length();
		int pointer = len / 2;
		
		for (int i = 0; i < len; i++) {
			pointer = len / 2;
			for (int j = 0; j < len; j++) {
				if(pointer == len) {
					pointer = 0;
				}
				if (i + j >= len-1) {
					System.out.print(word.charAt(pointer++));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String word = scn.next();
		
		printPattern(word);
		
		scn.close();
	}
}
