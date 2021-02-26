package zoho.recruitment;

import java.util.Scanner;

public class PatternProgramming {
	
	private static void printPattern(String word) {
		int len = word.length();
		String str = word;
		String temp = "";
		
		if (len % 2 == 0) {
			System.out.println("Enter the word with odd number of letters...");
			return;
		}
		
		for(int i = word.length() / 2; i < word.length(); i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(" ");
			}
			len--;
			temp += str.charAt(i);
			System.out.println(temp);
		}
		
		for(int i = 0; i < word.length() / 2; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(" ");
			}
			len--;
			temp += str.charAt(i);
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String word = scn.next();
		
		printPattern(word);
		
		scn.close();
	}
}
