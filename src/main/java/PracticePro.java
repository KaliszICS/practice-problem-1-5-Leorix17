/**
	* File: Lesson 1.5: Characters
	* Author: Leo
	* Date Created: February 19, 2025
	* Date Last Modified: February 19, 2025
	*/


import java.util.Scanner;
public class PracticePro {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char a;
		a = 'a';
		System.out.println(a);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a word: ");
		String word = input.nextLine();
		
		char letter1;
		letter1 = word.charAt(2);
		System.out.println(letter1);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a word: ");
		String word = input.nextLine();
		
		char letter1;
		letter1 = word.charAt(1);
		System.out.println("The second character user entered was: " + letter1);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		int num1 = input.nextInt();
		System.out.println("Your number plus 1 is: " + (num1 + 1));
	}

	public static void q5() {
		//Write question 5 code here Ask the user to "Input a letter: ", save it as a string,
		//  then save it as a character. Ask the user to "Input another letter: "
		// , save it as a string, then save it as a character. Output the result of the characters 
		// added together (not concatenated).
		Scanner input = new Scanner(System.in);

		System.out.print("Input a letter: ");
		String letter1 = input.nextLine();
		char char1 = letter1.charAt(0);


		System.out.print("Input another letter: ");
		String letter2 = input.nextLine();
		char char2 = letter2.charAt(0);

		System.out.println(char1 + char2);
	}

}
