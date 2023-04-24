package studentGuessingGame;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class StudentGuessingGame {

	String[] studentNames = { "Aleena", " Angel", "Asha", "Clemin", " Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Suchitra", "Vindhuja" };
	// String selectedStudentName;
	String studentNameAsStar;
	String enteredLetter;
	char[] selectedStudentNameInArray;
	
	StringBuilder finalStudentName = new StringBuilder();

	Scanner sc = new Scanner(System.in);
	//String studentName = sc.nextLine();
	
	Random r = new Random();
	String studentNameToBeGuessed = studentNames[r.nextInt(studentNames.length)];
	

//   void selectStudentName() {
//	System.out.println(wordToBeGuessed);
//  }

//	boolean selectStudentName(String enteredName) {
//		boolean flag = false;
//		for (int i = 0; i < studentNames.length; i++) {
//			if (studentNames[i].equals(enteredName)) {
//				selectedStudentName = studentNames[i];
//				flag = true;
//			}
//		}
//		return flag;

	void printNameAsStar() {
		studentNameAsStar = studentNameToBeGuessed.replaceAll("[a-zA-Z]", "*");
		System.out.println("You are guessing " + studentNameAsStar);
	}

	void guessAndPrintLetter() {
		selectedStudentNameInArray = studentNameToBeGuessed.toCharArray();
		int length = selectedStudentNameInArray.length;
		finalStudentName.setLength(length);

		int correctcount = 1;
		int wrongcount = 1;
		int points = 0;

		for (int k = 0; k <= selectedStudentNameInArray.length; k++) {
			System.out.println("Guess the letter..");
			enteredLetter = sc.next();
			if (studentNameToBeGuessed.contains(enteredLetter)) {
				System.out.println("You have guessed " + correctcount + " correct letter.. ");
				char letterGuessed = enteredLetter.charAt(0);
				for (int i = 0; i < selectedStudentNameInArray.length; i++) {

					if (letterGuessed == selectedStudentNameInArray[i]) {
						finalStudentName.setCharAt(i, letterGuessed);
						System.out.println("You are Guessing:: " + finalStudentName.toString());
						correctcount++;
					}
				}

			} else {
				System.out.println("You have guessed " + wrongcount + " wrong letter:: " + enteredLetter);

				wrongcount++;
				points++;
				if (points == 5) {
					System.out.println("You have lost 5 points.Try next time.The word to be guessed was *"+studentNameToBeGuessed);
					System.exit(0);
				}
			}

		}
	}

	void printResultMessage() {
		if (studentNameToBeGuessed.equals(finalStudentName.toString())) {
			System.out.println("Congratulations....You Win!!");
			System.out.println("You have guessed *" + studentNameToBeGuessed + "* correctly ");
			System.exit(0);
		} else {
			System.out.println("You are unable to Guess the word *" +studentNameToBeGuessed+ "*");
		}
	}

}
