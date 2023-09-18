/**
 * Determines if two strands or DNA or RNA are palindromic sequences
 */

import java.util.Scanner;

public class PalindromicSequence
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strand1;
		String strand2;


		do {
			System.out.print("Enter the first strand:");

			strand1 = scan.nextLine();
			
			System.out.print("Enter the second strand:");

			strand2 = scan.nextLine();
			
			if (strand1.length() != strand2.length()) {
				System.out.println("Both strands must be the same length");
				continue;
			}

			/**
			 * now determine if the two strands are a palindromic sequence
			 */
		}
		while (strand1.length() != 0);
		
		scan.close();
	}
}