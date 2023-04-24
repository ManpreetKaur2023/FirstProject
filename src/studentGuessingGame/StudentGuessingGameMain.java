package studentGuessingGame;

import java.util.Scanner;

public class StudentGuessingGameMain {

	public static void main(String[] args) {
		StudentGuessingGame studentGuessingGame = new StudentGuessingGame();
		
		// studentGuessingGame.selectStudentName();
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Select the student name")
//		boolean nameFound = studentGuessingGame.selectStudentName(studentName);
//		if (nameFound) {
//			System.out.println("Welcome to the game");
//		} else {
//			System.out.println("Student name not found in the list");
//			System.exit(0);
//		}
		
		
		studentGuessingGame.printNameAsStar();
		System.out.println("You have guessed 0 wrong letter.");

		studentGuessingGame.guessAndPrintLetter();
		studentGuessingGame.printResultMessage();
	}

}
